package scripts.napi.graphics.javafx;

import java.io.ByteArrayInputStream;
import java.net.URL;

import javax.swing.SwingUtilities;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;
import scripts.napi.framework.NScript;
import scripts.napi.logger.Loggable;
import scripts.napi.timing.NTiming;

public class JavaFXGUI extends Application implements Loggable {
	
	private AbstractGUIController controller;

	private Stage stage;
	private Scene scene;

	private boolean isOpen = false;
	
	private final String fxml;
	private final String windowName;
	private final URL css;
	private final boolean customTitleBar;
	private NScript script;
	
	public JavaFXGUI(String fxml, String windowName) {
		this(fxml, windowName, null);
	}
	
	public JavaFXGUI(String fxml, String windowName, URL css) {
		this(fxml, windowName, css, false);
	}
	
	public JavaFXGUI(String fxml, String windowName, URL css, boolean customTitleBar) {
		this (fxml, windowName, css, customTitleBar, null);
	}
	
	public JavaFXGUI(String fxml, String windowName, URL css, boolean customTitleBar, NScript script) {
		this.fxml = fxml;
		this.windowName = windowName;
		this.css = css;
		this.customTitleBar = customTitleBar;
		this.script = script;
		
		// We have to start the JFX thread from the EDT otherwise tribot will end it.
		SwingUtilities.invokeLater(() -> {

			new JFXPanel(); // we have to init the toolkit

			Platform.runLater(() -> {
				try {
					final Stage stage = new Stage();

					start(stage);
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		});

		waitForInit();
	}

	public Scene getScene() {
		return this.scene;
	}

	public Stage getStage() {
		return this.stage;
	}

	/**
	 * The main entry point for all JavaFX applications. The start method is called
	 * after the init method has returned, and after the system is ready for the
	 * application to begin running.
	 * <p>
	 * <p>
	 * NOTE: This method is called on the JavaFX Application Thread.
	 * </p>
	 *
	 * @param stage
	 *            the primary stage for this application, onto which the application
	 *            scene can be set. The primary stage will be embedded in the
	 *            browser if the application was launched as an applet. Applications
	 *            may create other stages, if needed, but they will not be primary
	 *            stages and will not be embedded in the browser.
	 */
	@Override
	public void start(Stage stage) throws Exception {
		
		this.stage = stage;
		
		stage.setTitle(windowName);

		Platform.setImplicitExit(false);

		FXMLLoader loader = new FXMLLoader();

		loader.setClassLoader(this.getClass().getClassLoader());
		
		Parent box = loader.load(new ByteArrayInputStream(fxml.getBytes()));
		
		controller = loader.getController();
		
		controller.setGUI(this);

		scene = new Scene(box);
		
		scene.setFill(Color.TRANSPARENT);

		if (this.customTitleBar)
			stage.initStyle(StageStyle.UNDECORATED);
		
		if (this.css != null)
			scene.getStylesheets().add(this.css.toExternalForm());
		stage.setScene(scene);
		
		stage.setResizable(false);

		stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

	         @Override
	         public void handle(WindowEvent event) {
	             Platform.runLater(new Runnable() {

	                 @Override
	                 public void run() {
	                     endScript();
	                 }
	             });
	         }
	     });
		
	}
	
    @SuppressWarnings("unchecked")
	public <T extends AbstractGUIController> T getController() {

        return (T) this.controller;

    }

	public void show() {

		if (stage == null)
			return;

		isOpen = true;

		Platform.runLater(() -> stage.show());
	}

	public void close() {

		if (stage == null)
			return;

		isOpen = false;

		Platform.runLater(() -> stage.close());
	}

	public boolean isOpen() {
		return isOpen;
	}

	private void waitForInit() {
		NTiming.waitCondition(() -> stage != null, 5000);
	}

	@SuppressWarnings("deprecation")
	public void endScript() {
		if (script != null && script.isActive()) {
			log("User interface was closed, attempting to stop script...");
			this.script.stopScript();
		}
	}
	
	public void setScript(NScript script) {
		this.script = script;
	}

	public NScript getScript() {
		return this.script;
	}

	@Override
	public String name() {
		return "GUI";
	}
	
	public static class Builder {
		
		private String fxml;
		private String windowName;
		private URL css;
		private boolean customTitleBar;
		private NScript script;
		
		public Builder withFXML(String fxml) {
			this.fxml = fxml;
			return this;
		}
		
		public Builder withWindowName(String windowName) {
			this.windowName = windowName;
			return this;
		}
		
		public Builder withCSS(URL css) {
			this.css = css;
			return this;
		}
		
		public Builder withCustomTitleBar(boolean customTitleBar) {
			this.customTitleBar = customTitleBar;
			return this;
		}
		
		public Builder withScript(NScript script) {
			this.script = script;
			return this;
		}
		
		public JavaFXGUI build() {
			return new JavaFXGUI(fxml, windowName, css, customTitleBar, script);
		}
		
		
	}
}
