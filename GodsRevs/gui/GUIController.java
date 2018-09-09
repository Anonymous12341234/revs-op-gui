package scripts.GodsRevs.gui;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.tribot.api.General;
import org.tribot.api2007.Equipment;
import org.tribot.api2007.Equipment.SLOTS;
import org.tribot.api2007.Prayer;
import org.tribot.api2007.Prayer.PRAYERS;
import org.tribot.api2007.types.RSItem;
import org.tribot.util.Util;

import com.allatori.annotations.DoNotRename;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXSlider;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.cells.editors.TextFieldEditorBuilder;
import com.jfoenix.controls.cells.editors.base.GenericEditableTreeTableCell;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableColumn.CellEditEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import scripts.GodsRevs.gui.enums.BlowpipeAmmo;
import scripts.GodsRevs.gui.enums.CameraMethod;
import scripts.GodsRevs.gui.enums.CaveLocation;
import scripts.GodsRevs.gui.enums.Potion;
import scripts.GodsRevs.gui.enums.RevEnum;
import scripts.GodsRevs.gui.enums.TravelMethod;
import scripts.napi.datatypes.SimpleProperties;
import scripts.napi.graphics.SpriteUtil;
import scripts.napi.graphics.javafx.AbstractGUIController;

@DoNotRename
public class GUIController extends AbstractGUIController {
	
	private static final File DIRECTORY = new File(Util.getWorkingDirectory() + File.separator + "GodsRevs");
	
	@FXML @DoNotRename
	private JFXSlider min, max;
	
	@FXML @DoNotRename
	private JFXTextField minimumHP, potionQuantity, targetRuntime, targetProfit, worldTextField, ammoQuantity, lootAmount, foodName, foodQuantity;
	
	@FXML @DoNotRename
	private ImageView helm, ammo, gloves, boots, ring, legs, torso, shield, weapon, amulet, cape;
	
	@FXML @DoNotRename
	private JFXListView<Prayer.PRAYERS> possiblePrayers, actualPrayers;
	
	@FXML @DoNotRename
	private JFXListView<RevEnum> possibleRevs, actualRevs;
	
	@FXML @DoNotRename
	private JFXComboBox<Potion> potion;
	
	@FXML @DoNotRename
	private JFXComboBox<CaveLocation> caveLocation;
	
	@FXML @DoNotRename
	private JFXTreeTableView<PotionTableEntry> potionTable;
	
	@FXML @DoNotRename
	private JFXCheckBox stopRuntime, stopProfit, clanWars, royalSeedPod, disableWorldHopping, useAmmo, refillBlowpipe, specialAttack, customAntiban,
	keepCameraHigh, salve, agilityShortcut, customMouse;
	
	@FXML @DoNotRename
	private JFXComboBox<TravelMethod> travelMethod;
	
	@FXML @DoNotRename
	private JFXComboBox<BlowpipeAmmo> dartType;
	
	@FXML @DoNotRename
	private JFXComboBox<CameraMethod> cameraMethod;
	
	private ObservableList<PotionTableEntry> potionList;
	
	private HashMap<SLOTS, Integer> equipment;
	
	private GodsRevsSettings settings;

	@SuppressWarnings("unchecked")
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		equipment = new HashMap<SLOTS, Integer>();
		
		possibleRevs.getItems().addAll(FXCollections.observableArrayList(RevEnum.values()));
		possiblePrayers.getItems().addAll(FXCollections.observableArrayList(PRAYERS.values()));
		
		travelMethod.setItems(FXCollections.observableArrayList(TravelMethod.values()));
		dartType.setItems(FXCollections.observableArrayList(BlowpipeAmmo.values()));
		caveLocation.setItems(FXCollections.observableArrayList(CaveLocation.values()));
		cameraMethod.setItems(FXCollections.observableArrayList(CameraMethod.values()));
		potion.setItems(FXCollections.observableArrayList(Potion.values()));
		
		travelMethod.getSelectionModel().selectFirst();
		dartType.getSelectionModel().selectFirst();
		caveLocation.getSelectionModel().selectFirst();
		cameraMethod.getSelectionModel().selectFirst();
		potion.getSelectionModel().selectFirst();
		
		potionList = FXCollections.observableArrayList();
		
		JFXTreeTableColumn<PotionTableEntry, String> potionCol = new JFXTreeTableColumn<>("Potion");
		potionCol.setPrefWidth(220);
		
		JFXTreeTableColumn<PotionTableEntry, String> thresholdCol = new JFXTreeTableColumn<>("Quantity");
		thresholdCol.setPrefWidth(112);
		
		potionCol.setCellValueFactory((TreeTableColumn.CellDataFeatures<PotionTableEntry, String> param) -> {
            if (potionCol.validateValue(param)) {
                return param.getValue().getValue().potion;
            } else {
                return potionCol.getComputedValue(param);
            }
        });
        
		thresholdCol.setCellValueFactory((TreeTableColumn.CellDataFeatures<PotionTableEntry, String> param) -> {
            if (thresholdCol.validateValue(param)) {
                return param.getValue().getValue().quantity;
            } else {
                return thresholdCol.getComputedValue(param);
            }
        });
		
		potionCol.setCellFactory((TreeTableColumn<PotionTableEntry, String> param) -> new GenericEditableTreeTableCell<>(
				new TextFieldEditorBuilder()));
		potionCol.setOnEditCommit((CellEditEvent<PotionTableEntry, String> t) -> t.getTreeTableView()
				.getTreeItem(t.getTreeTablePosition().getRow()).getValue().potion.set(t.getNewValue()));
		
		thresholdCol.setCellFactory((TreeTableColumn<PotionTableEntry, String> param) -> new GenericEditableTreeTableCell<>(
				new TextFieldEditorBuilder()));
		thresholdCol.setOnEditCommit((CellEditEvent<PotionTableEntry, String> t) -> t.getTreeTableView()
				.getTreeItem(t.getTreeTablePosition().getRow()).getValue().quantity.set(t.getNewValue()));
		
		final TreeItem<PotionTableEntry> potionRoot = new RecursiveTreeItem<>(potionList, RecursiveTreeObject::getChildren);
		
		potionTable.setRoot(potionRoot);
        potionTable.setShowRoot(false);
        potionTable.setEditable(false);
        potionTable.getColumns().setAll(potionCol, thresholdCol);
        
        loadSettings("last");
        
        if (!DIRECTORY.exists())
        	DIRECTORY.mkdirs();
        
        Platform.runLater(() -> {
			if (gui != null) {
				//final Image icon = SpriteUtil.getFXImage();
				final Stage stage = gui.getStage();
				if (stage != null) {
					//stage.getIcons().add(icon);
					stage.setResizable(true);
					stage.setAlwaysOnTop(true);
				}	
			}
        });
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getSettings() {
		return (T) settings;
	}
	
	@FXML @DoNotRename
	public void start() {
		try {
			saveSettings("last");
			this.settings = getSettingsInstance("last");
			this.gui.close();
		}
		catch (Exception e) {
			General.println("Make sure that the GUI is correctly filled out");
		}
	}
	
	@FXML @DoNotRename
	public void addRevs() {
		final ObservableList<RevEnum> list = possibleRevs.getSelectionModel().getSelectedItems();
		actualRevs.getItems().addAll(list);
		possibleRevs.getItems().removeAll(list);
	}
	
	@FXML @DoNotRename
	public void clearRevs() {
		actualRevs.getItems().clear();
		possibleRevs.getItems().clear();
		possibleRevs.getItems().addAll(FXCollections.observableArrayList(RevEnum.values()));
	}
	
	@FXML @DoNotRename
	public void loadEquipment() {
		this.equipment = new HashMap<>(Arrays.stream(Equipment.getItems()).collect(Collectors.toMap(RSItem::getEquipmentSlot, RSItem::getID)));
		drawImages();
	}
	
	@FXML @DoNotRename
	public void addPrayers() {
		final ObservableList<PRAYERS> list = possiblePrayers.getSelectionModel().getSelectedItems();
		actualPrayers.getItems().addAll(list);
		possiblePrayers.getItems().removeAll(list);
	}
	
	@FXML @DoNotRename
	public void clearPrayers() {
		actualPrayers.getItems().clear();
		possiblePrayers.getItems().clear();
		possiblePrayers.getItems().addAll(FXCollections.observableArrayList(PRAYERS.values()));
	}
	
	@FXML @DoNotRename
	public void clearPotionTable() {
		this.potionList.clear();
	}
	
	@FXML @DoNotRename
	public void addPotionEntry() {
		this.potionList.add(new PotionTableEntry(potion.getValue().toString(), Integer.parseInt(potionQuantity.getText())));
	}
	
	@FXML @DoNotRename
	public void saveSettings() {
		FileChooser chooser = new FileChooser();
		chooser.setInitialDirectory(DIRECTORY);
		final ExtensionFilter filter = new ExtensionFilter("Configuration Files (.ini)", "*.ini");
		chooser.getExtensionFilters().add(filter);
		chooser.setSelectedExtensionFilter(filter);
		chooser.setTitle("Save settings");
		saveSettings(chooser.showSaveDialog(this.gui.getStage()).getName());
	}
	
	@FXML @DoNotRename
	public void loadSettings() {
		FileChooser chooser = new FileChooser();
		chooser.setInitialDirectory(DIRECTORY);
		final ExtensionFilter filter = new ExtensionFilter("Configuration Files (.ini)", "*.ini");
		chooser.getExtensionFilters().add(filter);
		chooser.setSelectedExtensionFilter(filter);
		chooser.setTitle("Load settings");
		loadSettings(chooser.showOpenDialog(this.gui.getStage()).getName());
	}

	private void drawImages() {
		amulet.setImage(null);
		ammo.setImage(null);
		torso.setImage(null);
		boots.setImage(null);
		cape.setImage(null);
		gloves.setImage(null);
		helm.setImage(null);
		legs.setImage(null);
		ring.setImage(null);
		shield.setImage(null);
		weapon.setImage(null);
		new Thread(() -> {
			this.equipment.entrySet().forEach(item -> {
				switch (item.getKey()) {
				case AMULET:
					drawSprite(item.getValue(), amulet);
					break;
				case ARROW:
					drawSprite(item.getValue(), ammo);
					break;
				case BODY:
					drawSprite(item.getValue(), torso);
					break;
				case BOOTS:
					drawSprite(item.getValue(), boots);
					break;
				case CAPE:
					drawSprite(item.getValue(), cape);
					break;
				case GLOVES:
					drawSprite(item.getValue(), gloves);
					break;
				case HELMET:
					drawSprite(item.getValue(), helm);
					break;
				case LEGS:
					drawSprite(item.getValue(), legs);
					break;
				case RING:
					drawSprite(item.getValue(), ring);
					break;
				case SHIELD:
					drawSprite(item.getValue(), shield);
					break;
				case WEAPON:
					drawSprite(item.getValue(), weapon);
					break;
				}
			});
		}).start();
	}
	
	private void drawSprite(int id, ImageView imageView) {
		Image image = SpriteUtil.getFXImage(id);
		if (image == null) {
			General.println("Image is null. Item id " + id);
			return;
		}
		Platform.runLater(() -> {
			if (imageView == null) {
				General.println("Image view is null. Item id " + id);
				return;
			}
			imageView.setImage(image);
		});	
	}
	
	private void saveSettings(String name) {
		
		if (!name.contains(".ini"))
			name += ".ini";
		
		try (PrintWriter pw = new PrintWriter(DIRECTORY.getAbsolutePath() + "/" + name)) {
			
		SimpleProperties prop = new SimpleProperties();
		
		prop.setProperty("revenants", concatCollection(this.actualRevs.getItems()));
		prop.setProperty("minimumHP", minimumHP.getText().isEmpty() ? "0" : minimumHP.getText());
		prop.setProperty("equipment", getEquipmentString());
		prop.setProperty("prayers", concatCollection(this.actualPrayers.getItems()));
		prop.setProperty("potions", getPotionString());
		prop.setProperty("stopRuntime", stopRuntime.isSelected());
		prop.setProperty("stopProfit", stopProfit.isSelected());
		prop.setProperty("targetRuntime", targetRuntime.getText().isEmpty() ? "0" : targetRuntime.getText());
		prop.setProperty("targetProfit", targetProfit.getText().isEmpty() ? "0" : targetProfit.getText());
		prop.setProperty("clanWars", clanWars.isSelected());
		prop.setProperty("royalSeedPod", royalSeedPod.isSelected());
		prop.setProperty("travelMethod", travelMethod.getValue());
		prop.setProperty("disableWorldHopping", disableWorldHopping.isSelected());
		prop.setProperty("worlds", worldTextField.getText());
		prop.setProperty("useAmmo", useAmmo.isSelected());
		prop.setProperty("ammoQuantity", ammoQuantity.getText().isEmpty() ? "0" : ammoQuantity.getText());
		prop.setProperty("refillBlowpipe", refillBlowpipe.isSelected());
		prop.setProperty("dartType", dartType.getValue());
		prop.setProperty("caveLocation", caveLocation.getValue());
		prop.setProperty("specialAttack", specialAttack.isSelected());
		prop.setProperty("customAntiban", customAntiban.isSelected());
		prop.setProperty("keepCameraHigh", keepCameraHigh.isSelected());
		prop.setProperty("salveAmulet", salve.isSelected());
		prop.setProperty("agilityShortcut", agilityShortcut.isSelected());
		prop.setProperty("cameraMethod", cameraMethod.getValue());
		prop.setProperty("lootAmount", lootAmount.getText().isEmpty() ? "0" : lootAmount.getText());
		prop.setProperty("customMouse", customMouse.isSelected());
		prop.setProperty("min", min.getValue());
		prop.setProperty("max", max.getValue());
		prop.setProperty("foodName", foodName.getText());
		prop.setProperty("foodQuantity", foodQuantity.getText().isEmpty() ? "0" : foodQuantity.getText());
		
		prop.store(pw, "Gods Revs Settings");
		
		if (!name.contains("last"))
			General.println("Settings saved successfully: " + name);
		
		}
		catch (Exception e) {
			e.printStackTrace();
			General.println("Failed to save settings: " + name);
		}
	}
	
	private void loadSettings(String name) {
		
		final GodsRevsSettings settings = getSettingsInstance(name);
		
		if (settings == null) {
			if (!name.contains("last"))
				General.println("Error loading settings: " + name);
			return;
		}
		
		this.potionList.clear();
		this.actualPrayers.getItems().clear();
		this.actualRevs.getItems().clear();
		
		actualRevs.getItems().addAll(FXCollections.observableArrayList(settings.getRevs()));
		minimumHP.setText(String.valueOf(settings.getMinimumHP()));
		lootAmount.setText(String.valueOf(settings.getLootAmount()));
		
		equipment = settings.getEquipment();
		drawImages();
		
		if (settings.getPrayers() != null)
			actualPrayers.getItems().addAll(FXCollections.observableArrayList(settings.getPrayers()));
		
		final PotionTableEntry[] potions = settings.getPotions();
		if (potions != null)
			this.potionList.addAll(FXCollections.observableArrayList(settings.getPotions()));
		
		this.stopRuntime.setSelected(settings.isStopRuntime());
		this.stopProfit.setSelected(settings.isStopProfit());
		this.targetRuntime.setText(String.valueOf(settings.getTargetRuntime()));
		this.targetProfit.setText(String.valueOf(settings.getTargetProfit()));
		
		this.clanWars.setSelected(settings.isClanWars());
		this.royalSeedPod.setSelected(settings.isRoyalSeedPod());
		this.travelMethod.setValue(settings.getTravelMethod());
		
		this.disableWorldHopping.setSelected(settings.isDisableWorldHopping());
		this.worldTextField.setText(Arrays.stream(settings.getWorlds()).mapToObj(value -> String.valueOf(value)).collect(Collectors.joining(",")));
		
		this.useAmmo.setSelected(settings.isUseAmmo());
		this.refillBlowpipe.setSelected(settings.isRefillBlowpipe());
		
		this.ammoQuantity.setText(String.valueOf(settings.getAmmoQuantity()));
		this.dartType.setValue(settings.getBlowpipeAmmo());
		
		this.caveLocation.setValue(settings.getCaveLocation());
		
		this.specialAttack.setSelected(settings.isSpecialAttack());
		this.customAntiban.setSelected(settings.isCustomAntiban());
		this.keepCameraHigh.setSelected(settings.isKeepCameraHigh());
		this.salve.setSelected(settings.isSalve());
		this.agilityShortcut.setSelected(settings.isAgilityShortcut());
		this.cameraMethod.setValue(settings.getCameraMethod());
		
		this.customMouse.setSelected(settings.isCustomMouse());
		this.min.setValue(settings.getMin());
		this.max.setValue(settings.getMax());
		
		this.foodName.setText(settings.getFoodName());
		this.foodQuantity.setText(String.valueOf(settings.getFoodQuantity()));
		
		General.println("Settings loaded successfully: " + name);
		
	}
	
	public static GodsRevsSettings getSettingsInstance(String name) {
		try {
			
			if (!name.contains(".ini"))
				name += ".ini";
				
			SimpleProperties prop = new SimpleProperties();
			prop.load(new FileInputStream(new File(DIRECTORY.getAbsolutePath() + "/" + name)));
			
			final GodsRevsSettings settings = new GodsRevsSettings();
			
			settings.setMinimumHP(Integer.parseInt(prop.getProperty("minimumHP")));
			settings.setLootAmount(prop.getInt("lootAmount"));
			
			settings.setRevs(Arrays.stream(prop.getProperty("revenants").split(",")).map(value -> RevEnum.valueOf(value)).toArray(RevEnum[]::new));
		
			HashMap<Equipment.SLOTS, Integer> map = new HashMap<>();
			for (String s : prop.getProperty("equipment").split(",")) {
				if (s.isEmpty())
					continue;
				String[] entry = s.split(":");
				map.put(Equipment.SLOTS.valueOf(entry[0]), Integer.valueOf(entry[1]));
			}
			
			settings.setEquipment(map);
			
			if (!prop.getProperty("prayers").isEmpty())
				settings.setPrayers(Arrays.stream(prop.getProperty("prayers").split(",")).map(value -> PRAYERS.valueOf(value)).toArray(PRAYERS[]::new));
			
			if (!prop.getProperty("potions").isEmpty())
				settings.setPotions(Stream.of(prop.getProperty("potions"))
						.map(string -> string.split(","))
						.map(entryBase -> {
							String[] entry = entryBase[0].split(":");
							return new PotionTableEntry(entry[0], Integer.valueOf(entry[1]));
						})
						.toArray(PotionTableEntry[]::new));
			
			LinkedList<PotionTableEntry> entries = new LinkedList<>();
				for (String s : prop.getProperty("potions").split(",")) {
					if (s.isEmpty())
						continue;
					String[] entry = s.split(":");
					entries.add(new PotionTableEntry(entry[0], Integer.valueOf(entry[1])));
				}
				
			if (entries.size() > 0)
				settings.setPotions(entries.toArray(new PotionTableEntry[entries.size()]));
				
				
			settings.setStopRuntime(Boolean.valueOf(prop.getBool("stopRuntime")));
			settings.setStopProfit(prop.getBool("stopProfit"));
			settings.setTargetProfit(prop.getInt("targetProfit"));
			settings.setTargetRuntime(prop.getInt("targetRuntime"));
			
			settings.setClanWars(prop.getBool("clanWars"));
			settings.setRoyalSeedPod(prop.getBool("royalSeedPod"));
			
			settings.setTravelMethod(TravelMethod.valueOf(prop.getProperty("travelMethod")));
			
			settings.setDisableWorldHopping(prop.getBool("disableWorldHopping"));
			
			if (prop.getProperty("worlds").isEmpty())
				settings.setWorlds(new int[0]);
			else
				settings.setWorlds(Arrays.stream(prop.getProperty("worlds").split(",")).mapToInt(string -> Integer.parseInt(string)).toArray());
			
			settings.setUseAmmo(prop.getBool("useAmmo"));
			settings.setRefillBlowpipe(prop.getBool("refillBlowpipe"));
			settings.setAmmoQuantity(prop.getInt("ammoQuantity"));
			settings.setBlowpipeAmmo(BlowpipeAmmo.valueOf(prop.getProperty("dartType")));
			
			settings.setCaveLocation(CaveLocation.valueOf(prop.getProperty("caveLocation")));
			
			settings.setSpecialAttack(prop.getBool("specialAttack"));
			settings.setCustomAntiban(prop.getBool("customAntiban"));
			settings.setKeepCameraHigh(prop.getBool("keepCameraHigh"));
			settings.setSalve(prop.getBool("salve"));
			settings.setAgilityShortcut(prop.getBool("agilityShortcut"));
			settings.setCameraMethod(CameraMethod.valueOf(prop.getProperty("cameraMethod")));
			
			settings.setCustomMouse(prop.getBool("customMouse"));
			settings.setMin((int)prop.getDouble("min"));
			settings.setMax((int)prop.getDouble("max"));
			
			settings.setFoodName(prop.getProperty("foodName"));
			settings.setFoodQuantity(prop.getInt("foodQuantity"));
			
			return settings;
			
		}
		catch (Exception e) {
			e.printStackTrace();
			if (!name.contains("last"))
				General.println("Error obtaining settings instance: " + name);
		}
		return null;
	}
	
	private <T extends Collection<?>> String concatCollection(T collection) {
		return collection.stream().map(entity -> entity.toString()).collect(Collectors.joining(","));
	}
	
	private String getEquipmentString() {
		return this.equipment.entrySet().stream().map(entry -> (entry.getKey() + ":" + entry.getValue() + ",")).collect(Collectors.joining());
	}
	
	private String getPotionString() {
		return this.potionList.stream().map(entry -> entry.getPotion() + ":" + entry.getQuantity() + ",").collect(Collectors.joining());
	}

}
