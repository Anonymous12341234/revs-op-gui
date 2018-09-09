package scripts.GodsRevs.gui;

public class FXMLString {

	public static final String get = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
			"\r\n" + 
			"<?import com.jfoenix.controls.JFXButton?>\r\n" + 
			"<?import com.jfoenix.controls.JFXCheckBox?>\r\n" + 
			"<?import com.jfoenix.controls.JFXComboBox?>\r\n" + 
			"<?import com.jfoenix.controls.JFXListView?>\r\n" + 
			"<?import com.jfoenix.controls.JFXSlider?>\r\n" + 
			"<?import com.jfoenix.controls.JFXTabPane?>\r\n" + 
			"<?import com.jfoenix.controls.JFXTextField?>\r\n" + 
			"<?import com.jfoenix.controls.JFXTreeTableView?>\r\n" + 
			"<?import javafx.geometry.Insets?>\r\n" + 
			"<?import javafx.scene.control.Label?>\r\n" + 
			"<?import javafx.scene.control.Tab?>\r\n" + 
			"<?import javafx.scene.image.ImageView?>\r\n" + 
			"<?import javafx.scene.layout.ColumnConstraints?>\r\n" + 
			"<?import javafx.scene.layout.GridPane?>\r\n" + 
			"<?import javafx.scene.layout.HBox?>\r\n" + 
			"<?import javafx.scene.layout.RowConstraints?>\r\n" + 
			"<?import javafx.scene.layout.VBox?>\r\n" + 
			"<?import javafx.scene.text.Font?>\r\n" + 
			"<?import javafx.scene.text.Text?>\r\n" + 
			"\r\n" + 
			"<JFXTabPane maxHeight=\"-Infinity\" maxWidth=\"-Infinity\" minHeight=\"-Infinity\" minWidth=\"-Infinity\" prefHeight=\"471.0\" prefWidth=\"717.0\" xmlns=\"http://javafx.com/javafx/8.0.171\" xmlns:fx=\"http://javafx.com/fxml/1\" fx:controller=\"scripts.GodsRevs.gui.GUIController\">\r\n" + 
			"   <tabs>\r\n" + 
			"      <Tab text=\"Start\">\r\n" + 
			"         <content>\r\n" + 
			"            <GridPane>\r\n" + 
			"              <columnConstraints>\r\n" + 
			"                <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"              </columnConstraints>\r\n" + 
			"              <rowConstraints>\r\n" + 
			"                <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"              </rowConstraints>\r\n" + 
			"               <children>\r\n" + 
			"                  <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.rowIndex=\"1\">\r\n" + 
			"                     <children>\r\n" + 
			"                        <JFXButton onAction=\"#start\" prefHeight=\"40.0\" prefWidth=\"150.0\" style=\"-fx-font-weight: bold; -fx-background-color: darkred; -fx-text-fill: white;\" text=\"START\" />\r\n" + 
			"                     </children>\r\n" + 
			"                  </HBox>\r\n" + 
			"                  <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\">\r\n" + 
			"                     <children>\r\n" + 
			"                        <Text strokeType=\"OUTSIDE\" strokeWidth=\"0.0\" text=\"Gods Revenants\">\r\n" + 
			"                           <font>\r\n" + 
			"                              <Font size=\"30.0\" />\r\n" + 
			"                           </font>\r\n" + 
			"                        </Text>\r\n" + 
			"                     </children>\r\n" + 
			"                  </HBox>\r\n" + 
			"               </children>\r\n" + 
			"            </GridPane>\r\n" + 
			"         </content>\r\n" + 
			"      </Tab>\r\n" + 
			"      <Tab text=\"Revenants\">\r\n" + 
			"         <content>\r\n" + 
			"            <GridPane>\r\n" + 
			"              <columnConstraints>\r\n" + 
			"                <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"              </columnConstraints>\r\n" + 
			"              <rowConstraints>\r\n" + 
			"                <RowConstraints maxHeight=\"212.0\" minHeight=\"10.0\" prefHeight=\"68.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                  <RowConstraints maxHeight=\"212.0\" minHeight=\"10.0\" prefHeight=\"68.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                <RowConstraints maxHeight=\"372.0\" minHeight=\"10.0\" prefHeight=\"366.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"              </rowConstraints>\r\n" + 
			"               <children>\r\n" + 
			"                  <GridPane GridPane.rowIndex=\"2\">\r\n" + 
			"                     <columnConstraints>\r\n" + 
			"                        <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                        <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                     </columnConstraints>\r\n" + 
			"                     <rowConstraints>\r\n" + 
			"                        <RowConstraints maxHeight=\"338.0\" minHeight=\"58.0\" prefHeight=\"58.0\" />\r\n" + 
			"                        <RowConstraints maxHeight=\"295.0\" minHeight=\"10.0\" prefHeight=\"232.0\" />\r\n" + 
			"                        <RowConstraints maxHeight=\"82.0\" minHeight=\"10.0\" prefHeight=\"73.0\" />\r\n" + 
			"                     </rowConstraints>\r\n" + 
			"                     <children>\r\n" + 
			"                        <VBox prefHeight=\"414.0\" prefWidth=\"300.0\">\r\n" + 
			"                           <children>\r\n" + 
			"                              <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\">\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <Text strokeType=\"OUTSIDE\" strokeWidth=\"0.0\" text=\"Possible revenants\" />\r\n" + 
			"                                 </children>\r\n" + 
			"                              </HBox>\r\n" + 
			"                           </children>\r\n" + 
			"                        </VBox>\r\n" + 
			"                        <JFXListView fx:id=\"actualRevs\" GridPane.columnIndex=\"1\" GridPane.rowIndex=\"1\">\r\n" + 
			"                           <GridPane.margin>\r\n" + 
			"                              <Insets left=\"5.0\" />\r\n" + 
			"                           </GridPane.margin>\r\n" + 
			"                        </JFXListView>\r\n" + 
			"                        <JFXListView fx:id=\"possibleRevs\" GridPane.rowIndex=\"1\">\r\n" + 
			"                           <GridPane.margin>\r\n" + 
			"                              <Insets right=\"5.0\" />\r\n" + 
			"                           </GridPane.margin>\r\n" + 
			"                        </JFXListView>\r\n" + 
			"                        <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"1\">\r\n" + 
			"                           <children>\r\n" + 
			"                              <Text strokeType=\"OUTSIDE\" strokeWidth=\"0.0\" text=\"Revenants to kill\" />\r\n" + 
			"                           </children>\r\n" + 
			"                        </HBox>\r\n" + 
			"                        <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.rowIndex=\"2\">\r\n" + 
			"                           <children>\r\n" + 
			"                              <JFXButton onAction=\"#addRevs\" prefHeight=\"40.0\" prefWidth=\"150.0\" style=\"-fx-background-color: darkred; -fx-text-fill: white; -fx-font-weight: bold;\" text=\"ADD\" />\r\n" + 
			"                           </children>\r\n" + 
			"                        </HBox>\r\n" + 
			"                        <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"1\" GridPane.rowIndex=\"2\">\r\n" + 
			"                           <children>\r\n" + 
			"                              <JFXButton onAction=\"#clearRevs\" prefHeight=\"40.0\" prefWidth=\"150.0\" style=\"-fx-background-color: darkred; -fx-text-fill: white; -fx-font-weight: bold;\" text=\"CLEAR\" />\r\n" + 
			"                           </children>\r\n" + 
			"                        </HBox>\r\n" + 
			"                     </children>\r\n" + 
			"                     <padding>\r\n" + 
			"                        <Insets bottom=\"10.0\" left=\"10.0\" right=\"10.0\" top=\"10.0\" />\r\n" + 
			"                     </padding>\r\n" + 
			"                  </GridPane>\r\n" + 
			"                  <GridPane alignment=\"CENTER\">\r\n" + 
			"                    <columnConstraints>\r\n" + 
			"                      <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                      <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                    </columnConstraints>\r\n" + 
			"                    <rowConstraints>\r\n" + 
			"                      <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                    </rowConstraints>\r\n" + 
			"                     <children>\r\n" + 
			"                        <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"1\">\r\n" + 
			"                           <children>\r\n" + 
			"                              <JFXTextField fx:id=\"minimumHP\" alignment=\"CENTER\" focusColor=\"#860000\" prefHeight=\"25.0\" prefWidth=\"162.0\" promptText=\"Enter minimum HP % to attack\" style=\"-jfx-focus-color: darkred;\" />\r\n" + 
			"                           </children>\r\n" + 
			"                        </HBox>\r\n" + 
			"                        <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\">\r\n" + 
			"                           <children>\r\n" + 
			"                              <Label text=\"Minimum revenant HP % to attack\" />\r\n" + 
			"                           </children>\r\n" + 
			"                        </HBox>\r\n" + 
			"                     </children>\r\n" + 
			"                  </GridPane>\r\n" + 
			"                  <GridPane alignment=\"CENTER\" GridPane.rowIndex=\"1\">\r\n" + 
			"                     <columnConstraints>\r\n" + 
			"                        <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                        <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                     </columnConstraints>\r\n" + 
			"                     <rowConstraints>\r\n" + 
			"                        <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                     </rowConstraints>\r\n" + 
			"                     <children>\r\n" + 
			"                        <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"1\">\r\n" + 
			"                           <children>\r\n" + 
			"                              <JFXTextField fx:id=\"lootAmount\" alignment=\"CENTER\" focusColor=\"#860000\" prefHeight=\"25.0\" prefWidth=\"162.0\" promptText=\"Enter minimum loot to bank at\" style=\"-jfx-focus-color: darkred;\" />\r\n" + 
			"                           </children>\r\n" + 
			"                        </HBox>\r\n" + 
			"                        <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\">\r\n" + 
			"                           <children>\r\n" + 
			"                              <Label text=\"Minimum loot to bank at (gp)\" />\r\n" + 
			"                           </children>\r\n" + 
			"                        </HBox>\r\n" + 
			"                     </children>\r\n" + 
			"                  </GridPane>\r\n" + 
			"               </children>\r\n" + 
			"            </GridPane>\r\n" + 
			"         </content>\r\n" + 
			"      </Tab>\r\n" + 
			"      <Tab text=\"Equipment\">\r\n" + 
			"         <content>\r\n" + 
			"            <GridPane hgap=\"40.0\">\r\n" + 
			"              <columnConstraints>\r\n" + 
			"                <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"              </columnConstraints>\r\n" + 
			"              <rowConstraints>\r\n" + 
			"                <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"              </rowConstraints>\r\n" + 
			"               <children>\r\n" + 
			"                  <GridPane prefHeight=\"323.0\" prefWidth=\"281.0\" style=\"-fx-background-image: url('https://i.imgur.com/W07fHf0.png'); -fx-background-size: stretch;\" GridPane.columnIndex=\"1\">\r\n" + 
			"                    <columnConstraints>\r\n" + 
			"                      <ColumnConstraints hgrow=\"SOMETIMES\" maxWidth=\"92.0\" minWidth=\"10.0\" prefWidth=\"80.0\" />\r\n" + 
			"                        <ColumnConstraints hgrow=\"SOMETIMES\" maxWidth=\"108.0\" minWidth=\"10.0\" prefWidth=\"61.0\" />\r\n" + 
			"                      <ColumnConstraints hgrow=\"SOMETIMES\" maxWidth=\"118.0\" minWidth=\"10.0\" prefWidth=\"65.0\" />\r\n" + 
			"                        <ColumnConstraints hgrow=\"SOMETIMES\" maxWidth=\"132.0\" minWidth=\"10.0\" prefWidth=\"61.0\" />\r\n" + 
			"                        <ColumnConstraints hgrow=\"SOMETIMES\" maxWidth=\"116.0\" minWidth=\"10.0\" prefWidth=\"71.0\" />\r\n" + 
			"                    </columnConstraints>\r\n" + 
			"                    <rowConstraints>\r\n" + 
			"                        <RowConstraints maxHeight=\"50.0\" minHeight=\"10.0\" prefHeight=\"50.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                        <RowConstraints maxHeight=\"70.0\" minHeight=\"10.0\" prefHeight=\"54.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                        <RowConstraints maxHeight=\"62.0\" minHeight=\"10.0\" prefHeight=\"55.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                        <RowConstraints maxHeight=\"81.0\" minHeight=\"10.0\" prefHeight=\"57.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                      <RowConstraints maxHeight=\"78.0\" minHeight=\"10.0\" prefHeight=\"66.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                      <RowConstraints maxHeight=\"74.0\" minHeight=\"10.0\" prefHeight=\"62.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                      <RowConstraints maxHeight=\"46.0\" minHeight=\"10.0\" prefHeight=\"46.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                    </rowConstraints>\r\n" + 
			"                     <GridPane.margin>\r\n" + 
			"                        <Insets bottom=\"20.0\" top=\"20.0\" />\r\n" + 
			"                     </GridPane.margin>\r\n" + 
			"                     <children>\r\n" + 
			"                        <HBox alignment=\"CENTER_RIGHT\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"1\" GridPane.rowIndex=\"2\">\r\n" + 
			"                           <children>\r\n" + 
			"                              <ImageView fx:id=\"cape\" fitHeight=\"50.0\" fitWidth=\"40.0\" pickOnBounds=\"true\" preserveRatio=\"true\" />\r\n" + 
			"                           </children>\r\n" + 
			"                        </HBox>\r\n" + 
			"                        <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"2\" GridPane.rowIndex=\"1\">\r\n" + 
			"                           <children>\r\n" + 
			"                              <ImageView fx:id=\"helm\" fitHeight=\"50.0\" fitWidth=\"40.0\" pickOnBounds=\"true\" preserveRatio=\"true\" />\r\n" + 
			"                           </children>\r\n" + 
			"                        </HBox>\r\n" + 
			"                        <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"2\" GridPane.rowIndex=\"2\">\r\n" + 
			"                           <children>\r\n" + 
			"                              <ImageView fx:id=\"amulet\" fitHeight=\"50.0\" fitWidth=\"40.0\" pickOnBounds=\"true\" preserveRatio=\"true\" />\r\n" + 
			"                           </children>\r\n" + 
			"                        </HBox>\r\n" + 
			"                        <HBox alignment=\"CENTER_LEFT\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"3\" GridPane.rowIndex=\"2\">\r\n" + 
			"                           <children>\r\n" + 
			"                              <ImageView fx:id=\"ammo\" fitHeight=\"50.0\" fitWidth=\"40.0\" pickOnBounds=\"true\" preserveRatio=\"true\" />\r\n" + 
			"                           </children>\r\n" + 
			"                        </HBox>\r\n" + 
			"                        <HBox alignment=\"CENTER_LEFT\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"1\" GridPane.rowIndex=\"3\">\r\n" + 
			"                           <children>\r\n" + 
			"                              <ImageView fx:id=\"weapon\" fitHeight=\"50.0\" fitWidth=\"40.0\" pickOnBounds=\"true\" preserveRatio=\"true\" />\r\n" + 
			"                           </children>\r\n" + 
			"                        </HBox>\r\n" + 
			"                        <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"2\" GridPane.rowIndex=\"3\">\r\n" + 
			"                           <children>\r\n" + 
			"                              <ImageView fx:id=\"torso\" fitHeight=\"50.0\" fitWidth=\"40.0\" pickOnBounds=\"true\" preserveRatio=\"true\" />\r\n" + 
			"                           </children>\r\n" + 
			"                        </HBox>\r\n" + 
			"                        <HBox alignment=\"CENTER_RIGHT\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"3\" GridPane.rowIndex=\"3\">\r\n" + 
			"                           <children>\r\n" + 
			"                              <ImageView fx:id=\"shield\" fitHeight=\"50.0\" fitWidth=\"42.0\" pickOnBounds=\"true\" preserveRatio=\"true\" />\r\n" + 
			"                           </children>\r\n" + 
			"                        </HBox>\r\n" + 
			"                        <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"2\" GridPane.rowIndex=\"4\">\r\n" + 
			"                           <children>\r\n" + 
			"                              <ImageView fx:id=\"legs\" fitHeight=\"47.0\" fitWidth=\"44.0\" pickOnBounds=\"true\" preserveRatio=\"true\" />\r\n" + 
			"                           </children>\r\n" + 
			"                        </HBox>\r\n" + 
			"                        <HBox alignment=\"CENTER_LEFT\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"1\" GridPane.rowIndex=\"5\">\r\n" + 
			"                           <children>\r\n" + 
			"                              <ImageView fx:id=\"gloves\" fitHeight=\"50.0\" fitWidth=\"40.0\" pickOnBounds=\"true\" preserveRatio=\"true\" />\r\n" + 
			"                           </children>\r\n" + 
			"                        </HBox>\r\n" + 
			"                        <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"2\" GridPane.rowIndex=\"5\">\r\n" + 
			"                           <children>\r\n" + 
			"                              <ImageView fx:id=\"boots\" fitHeight=\"50.0\" fitWidth=\"40.0\" pickOnBounds=\"true\" preserveRatio=\"true\" />\r\n" + 
			"                           </children>\r\n" + 
			"                        </HBox>\r\n" + 
			"                        <HBox alignment=\"CENTER_RIGHT\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"3\" GridPane.rowIndex=\"5\">\r\n" + 
			"                           <children>\r\n" + 
			"                              <ImageView fx:id=\"ring\" fitHeight=\"50.0\" fitWidth=\"40.0\" pickOnBounds=\"true\" preserveRatio=\"true\" />\r\n" + 
			"                           </children>\r\n" + 
			"                        </HBox>\r\n" + 
			"                     </children>\r\n" + 
			"                  </GridPane>\r\n" + 
			"                  <VBox alignment=\"CENTER\" prefHeight=\"200.0\" prefWidth=\"100.0\">\r\n" + 
			"                     <children>\r\n" + 
			"                        <JFXButton onAction=\"#loadEquipment\" prefHeight=\"40.0\" prefWidth=\"150.0\" style=\"-fx-text-fill: white; -fx-font-weight: bold; -fx-background-color: darkred;\" text=\"GRAB CURRENT SETUP\" />\r\n" + 
			"                     </children>\r\n" + 
			"                  </VBox>\r\n" + 
			"               </children>\r\n" + 
			"            </GridPane>\r\n" + 
			"         </content>\r\n" + 
			"      </Tab>\r\n" + 
			"      <Tab text=\"Prayer\">\r\n" + 
			"         <content>\r\n" + 
			"            <GridPane>\r\n" + 
			"               <columnConstraints>\r\n" + 
			"                  <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                  <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"               </columnConstraints>\r\n" + 
			"               <rowConstraints>\r\n" + 
			"                  <RowConstraints maxHeight=\"338.0\" minHeight=\"58.0\" prefHeight=\"58.0\" />\r\n" + 
			"                  <RowConstraints maxHeight=\"295.0\" minHeight=\"10.0\" prefHeight=\"232.0\" />\r\n" + 
			"                  <RowConstraints maxHeight=\"82.0\" minHeight=\"10.0\" prefHeight=\"73.0\" />\r\n" + 
			"               </rowConstraints>\r\n" + 
			"               <children>\r\n" + 
			"                  <VBox prefHeight=\"414.0\" prefWidth=\"300.0\">\r\n" + 
			"                     <children>\r\n" + 
			"                        <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\">\r\n" + 
			"                           <children>\r\n" + 
			"                              <Text strokeType=\"OUTSIDE\" strokeWidth=\"0.0\" text=\"Possible prayers\" />\r\n" + 
			"                           </children>\r\n" + 
			"                        </HBox>\r\n" + 
			"                     </children>\r\n" + 
			"                  </VBox>\r\n" + 
			"                  <JFXListView fx:id=\"actualPrayers\" GridPane.columnIndex=\"1\" GridPane.rowIndex=\"1\">\r\n" + 
			"                     <GridPane.margin>\r\n" + 
			"                        <Insets left=\"5.0\" />\r\n" + 
			"                     </GridPane.margin>\r\n" + 
			"                  </JFXListView>\r\n" + 
			"                  <JFXListView fx:id=\"possiblePrayers\" GridPane.rowIndex=\"1\">\r\n" + 
			"                     <GridPane.margin>\r\n" + 
			"                        <Insets right=\"5.0\" />\r\n" + 
			"                     </GridPane.margin>\r\n" + 
			"                  </JFXListView>\r\n" + 
			"                  <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"1\">\r\n" + 
			"                     <children>\r\n" + 
			"                        <Text strokeType=\"OUTSIDE\" strokeWidth=\"0.0\" text=\"Prayers to use\" />\r\n" + 
			"                     </children>\r\n" + 
			"                  </HBox>\r\n" + 
			"                  <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.rowIndex=\"2\">\r\n" + 
			"                     <children>\r\n" + 
			"                        <JFXButton onAction=\"#addPrayers\" prefHeight=\"40.0\" prefWidth=\"150.0\" style=\"-fx-background-color: darkred; -fx-text-fill: white; -fx-font-weight: bold;\" text=\"ADD\" />\r\n" + 
			"                     </children>\r\n" + 
			"                  </HBox>\r\n" + 
			"                  <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"1\" GridPane.rowIndex=\"2\">\r\n" + 
			"                     <children>\r\n" + 
			"                        <JFXButton onAction=\"#clearPrayers\" prefHeight=\"40.0\" prefWidth=\"150.0\" style=\"-fx-background-color: darkred; -fx-text-fill: white; -fx-font-weight: bold;\" text=\"CLEAR\" />\r\n" + 
			"                     </children>\r\n" + 
			"                  </HBox>\r\n" + 
			"               </children>\r\n" + 
			"               <padding>\r\n" + 
			"                  <Insets bottom=\"10.0\" left=\"10.0\" right=\"10.0\" top=\"10.0\" />\r\n" + 
			"               </padding>\r\n" + 
			"            </GridPane>\r\n" + 
			"         </content>\r\n" + 
			"      </Tab>\r\n" + 
			"      <Tab text=\"Potions\">\r\n" + 
			"         <content>\r\n" + 
			"            <HBox prefHeight=\"100.0\" prefWidth=\"200.0\">\r\n" + 
			"            </HBox>\r\n" + 
			"         </content>\r\n" + 
			"         <content>\r\n" + 
			"            <GridPane hgap=\"10.0\" vgap=\"10.0\">\r\n" + 
			"               <columnConstraints>\r\n" + 
			"                  <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                  <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"               </columnConstraints>\r\n" + 
			"               <rowConstraints>\r\n" + 
			"                  <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"               </rowConstraints>\r\n" + 
			"               <children>\r\n" + 
			"                  <GridPane>\r\n" + 
			"                     <columnConstraints>\r\n" + 
			"                        <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                     </columnConstraints>\r\n" + 
			"                     <rowConstraints>\r\n" + 
			"                        <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                        <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                        <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                     </rowConstraints>\r\n" + 
			"                     <children>\r\n" + 
			"                        <GridPane GridPane.rowIndex=\"2\">\r\n" + 
			"                           <columnConstraints>\r\n" + 
			"                              <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                              <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                           </columnConstraints>\r\n" + 
			"                           <rowConstraints>\r\n" + 
			"                              <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                           </rowConstraints>\r\n" + 
			"                           <children>\r\n" + 
			"                              <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\">\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <JFXButton onAction=\"#clearPotionTable\" prefHeight=\"40.0\" prefWidth=\"150.0\" style=\"-fx-background-color: darkred; -fx-text-fill: white; -fx-font-weight: bold;\" text=\"CLEAR TABLE\" />\r\n" + 
			"                                 </children>\r\n" + 
			"                              </HBox>\r\n" + 
			"                              <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"1\">\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <JFXButton onAction=\"#addPotionEntry\" prefHeight=\"40.0\" prefWidth=\"150.0\" style=\"-fx-background-color: darkred; -fx-text-fill: white;\" text=\"ADD POTION\">\r\n" + 
			"                                       <font>\r\n" + 
			"                                          <Font name=\"System Bold\" size=\"12.0\" />\r\n" + 
			"                                       </font>\r\n" + 
			"                                    </JFXButton>\r\n" + 
			"                                 </children>\r\n" + 
			"                              </HBox>\r\n" + 
			"                           </children>\r\n" + 
			"                        </GridPane>\r\n" + 
			"                        <GridPane GridPane.rowIndex=\"1\">\r\n" + 
			"                           <columnConstraints>\r\n" + 
			"                              <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                              <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                           </columnConstraints>\r\n" + 
			"                           <rowConstraints>\r\n" + 
			"                              <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                           </rowConstraints>\r\n" + 
			"                           <children>\r\n" + 
			"                              <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\">\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <Label text=\"Quantity\" textAlignment=\"CENTER\" wrapText=\"true\" />\r\n" + 
			"                                 </children>\r\n" + 
			"                              </HBox>\r\n" + 
			"                              <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"1\">\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <JFXTextField fx:id=\"potionQuantity\" alignment=\"CENTER\" promptText=\"Enter quantity\" style=\"-jfx-focus-color: darkred;\" />\r\n" + 
			"                                 </children>\r\n" + 
			"                              </HBox>\r\n" + 
			"                           </children>\r\n" + 
			"                        </GridPane>\r\n" + 
			"                        <GridPane>\r\n" + 
			"                           <columnConstraints>\r\n" + 
			"                              <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                              <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                           </columnConstraints>\r\n" + 
			"                           <rowConstraints>\r\n" + 
			"                              <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                           </rowConstraints>\r\n" + 
			"                           <children>\r\n" + 
			"                              <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"1\">\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <JFXComboBox fx:id=\"potion\" promptText=\"Select potion type\" />\r\n" + 
			"                                 </children>\r\n" + 
			"                              </HBox>\r\n" + 
			"                              <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\">\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <Label text=\"Potion type\" />\r\n" + 
			"                                 </children>\r\n" + 
			"                              </HBox>\r\n" + 
			"                           </children>\r\n" + 
			"                        </GridPane>\r\n" + 
			"                     </children>\r\n" + 
			"                  </GridPane>\r\n" + 
			"                  <VBox alignment=\"CENTER\" prefHeight=\"200.0\" prefWidth=\"100.0\" spacing=\"20.0\" GridPane.columnIndex=\"1\">\r\n" + 
			"                     <children>\r\n" + 
			"                        <JFXTreeTableView fx:id=\"potionTable\" prefHeight=\"200.0\" prefWidth=\"334.0\" />\r\n" + 
			"                     </children>\r\n" + 
			"                     <padding>\r\n" + 
			"                        <Insets left=\"15.0\" right=\"15.0\" />\r\n" + 
			"                     </padding>\r\n" + 
			"                  </VBox>\r\n" + 
			"               </children>\r\n" + 
			"            </GridPane>\r\n" + 
			"         </content>\r\n" + 
			"      </Tab>\r\n" + 
			"      <Tab text=\"Other Settings\">\r\n" + 
			"         <content>\r\n" + 
			"            <JFXTabPane>\r\n" + 
			"               <tabs>\r\n" + 
			"                  <Tab text=\"Ammo\">\r\n" + 
			"                     <content>\r\n" + 
			"                        <GridPane>\r\n" + 
			"                          <columnConstraints>\r\n" + 
			"                            <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                          </columnConstraints>\r\n" + 
			"                          <rowConstraints>\r\n" + 
			"                            <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                            <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                          </rowConstraints>\r\n" + 
			"                           <children>\r\n" + 
			"                              <GridPane>\r\n" + 
			"                                <columnConstraints>\r\n" + 
			"                                  <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                                  <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                                </columnConstraints>\r\n" + 
			"                                <rowConstraints>\r\n" + 
			"                                  <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                                </rowConstraints>\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\">\r\n" + 
			"                                       <children>\r\n" + 
			"                                          <JFXCheckBox fx:id=\"useAmmo\" text=\"Use ammo\" />\r\n" + 
			"                                       </children>\r\n" + 
			"                                    </HBox>\r\n" + 
			"                                    <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"1\">\r\n" + 
			"                                       <children>\r\n" + 
			"                                          <JFXTextField fx:id=\"ammoQuantity\" alignment=\"CENTER\" promptText=\"Enter ammo quantity\" style=\"-jfx-focus-color: darkred;\" />\r\n" + 
			"                                       </children>\r\n" + 
			"                                    </HBox>\r\n" + 
			"                                 </children>\r\n" + 
			"                              </GridPane>\r\n" + 
			"                              <GridPane GridPane.rowIndex=\"1\">\r\n" + 
			"                                 <columnConstraints>\r\n" + 
			"                                    <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                                    <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                                 </columnConstraints>\r\n" + 
			"                                 <rowConstraints>\r\n" + 
			"                                    <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                                 </rowConstraints>\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\">\r\n" + 
			"                                       <children>\r\n" + 
			"                                          <JFXCheckBox fx:id=\"refillBlowpipe\" text=\"Refill blowpipe\" />\r\n" + 
			"                                       </children>\r\n" + 
			"                                    </HBox>\r\n" + 
			"                                    <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"1\">\r\n" + 
			"                                       <children>\r\n" + 
			"                                          <JFXComboBox fx:id=\"dartType\" promptText=\"Select dart type\" style=\"-jfx-focus-color: darkred;\" />\r\n" + 
			"                                       </children>\r\n" + 
			"                                    </HBox>\r\n" + 
			"                                 </children>\r\n" + 
			"                              </GridPane>\r\n" + 
			"                           </children>\r\n" + 
			"                        </GridPane>\r\n" + 
			"                     </content>\r\n" + 
			"                  </Tab>\r\n" + 
			"                  <Tab text=\"Cave Location\">\r\n" + 
			"                     <content>\r\n" + 
			"                        <GridPane>\r\n" + 
			"                          <columnConstraints>\r\n" + 
			"                            <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                            <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                          </columnConstraints>\r\n" + 
			"                          <rowConstraints>\r\n" + 
			"                            <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                          </rowConstraints>\r\n" + 
			"                           <children>\r\n" + 
			"                              <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\">\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <Label text=\"Revenant cave location\" />\r\n" + 
			"                                 </children>\r\n" + 
			"                              </HBox>\r\n" + 
			"                              <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"1\">\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <JFXComboBox fx:id=\"caveLocation\" promptText=\"Select cave location\" style=\"-jfx-focus-color: darkred;\" />\r\n" + 
			"                                 </children>\r\n" + 
			"                              </HBox>\r\n" + 
			"                           </children>\r\n" + 
			"                        </GridPane>\r\n" + 
			"                     </content>\r\n" + 
			"                  </Tab>\r\n" + 
			"                  <Tab text=\"Mouse\">\r\n" + 
			"                     <content>\r\n" + 
			"                        <GridPane>\r\n" + 
			"                          <columnConstraints>\r\n" + 
			"                            <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                          </columnConstraints>\r\n" + 
			"                          <rowConstraints>\r\n" + 
			"                            <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                            <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                          </rowConstraints>\r\n" + 
			"                           <children>\r\n" + 
			"                              <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\">\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <JFXCheckBox fx:id=\"customMouse\" text=\"Use custom mouse speed\" />\r\n" + 
			"                                 </children>\r\n" + 
			"                              </HBox>\r\n" + 
			"                              <GridPane GridPane.rowIndex=\"1\">\r\n" + 
			"                                <columnConstraints>\r\n" + 
			"                                  <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                                  <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                                </columnConstraints>\r\n" + 
			"                                <rowConstraints>\r\n" + 
			"                                  <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                                </rowConstraints>\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <VBox alignment=\"CENTER\" prefHeight=\"200.0\" prefWidth=\"100.0\" spacing=\"25.0\">\r\n" + 
			"                                       <children>\r\n" + 
			"                                          <Text strokeType=\"OUTSIDE\" strokeWidth=\"0.0\" text=\"Min\" />\r\n" + 
			"                                          <JFXSlider fx:id=\"min\" blockIncrement=\"40.0\" majorTickUnit=\"40.0\" max=\"250.0\" min=\"80.0\" prefHeight=\"14.0\" prefWidth=\"195.0\" showTickLabels=\"true\" showTickMarks=\"true\" value=\"100.0\" />\r\n" + 
			"                                       </children>\r\n" + 
			"                                       <opaqueInsets>\r\n" + 
			"                                          <Insets />\r\n" + 
			"                                       </opaqueInsets>\r\n" + 
			"                                       <padding>\r\n" + 
			"                                          <Insets left=\"50.0\" right=\"50.0\" />\r\n" + 
			"                                       </padding>\r\n" + 
			"                                    </VBox>\r\n" + 
			"                                    <VBox alignment=\"CENTER\" prefHeight=\"200.0\" prefWidth=\"100.0\" spacing=\"25.0\" GridPane.columnIndex=\"1\">\r\n" + 
			"                                       <children>\r\n" + 
			"                                          <Text strokeType=\"OUTSIDE\" strokeWidth=\"0.0\" text=\"Max\" />\r\n" + 
			"                                          <JFXSlider fx:id=\"max\" blockIncrement=\"40.0\" majorTickUnit=\"40.0\" max=\"250.0\" min=\"80.0\" showTickLabels=\"true\" showTickMarks=\"true\" value=\"100.0\" />\r\n" + 
			"                                       </children>\r\n" + 
			"                                       <padding>\r\n" + 
			"                                          <Insets left=\"50.0\" right=\"50.0\" />\r\n" + 
			"                                       </padding>\r\n" + 
			"                                    </VBox>\r\n" + 
			"                                 </children>\r\n" + 
			"                              </GridPane>\r\n" + 
			"                           </children>\r\n" + 
			"                        </GridPane>\r\n" + 
			"                     </content>\r\n" + 
			"                  </Tab>\r\n" + 
			"                  <Tab text=\"Stopping\">\r\n" + 
			"                     <content>\r\n" + 
			"                        <GridPane>\r\n" + 
			"                          <columnConstraints>\r\n" + 
			"                            <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                              <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                          </columnConstraints>\r\n" + 
			"                          <rowConstraints>\r\n" + 
			"                            <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                            <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                          </rowConstraints>\r\n" + 
			"                           <children>\r\n" + 
			"                              <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\">\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <JFXCheckBox fx:id=\"stopRuntime\" style=\"-jfx-checked-color: darkred; -jfx-unchecked-color: darkred;\" text=\"Stop after runtime (seconds)\" />\r\n" + 
			"                                 </children>\r\n" + 
			"                              </HBox>\r\n" + 
			"                              <HBox alignment=\"CENTER\" layoutX=\"10.0\" layoutY=\"10.0\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"1\">\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <JFXTextField fx:id=\"targetRuntime\" alignment=\"CENTER\" promptText=\"Enter target runtime\" style=\"-jfx-focus-color: darkred;\" />\r\n" + 
			"                                 </children>\r\n" + 
			"                              </HBox>\r\n" + 
			"                              <HBox alignment=\"CENTER\" layoutX=\"10.0\" layoutY=\"10.0\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.rowIndex=\"1\">\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <JFXCheckBox fx:id=\"stopProfit\" text=\"Stop after profit gained (gp)\" />\r\n" + 
			"                                 </children>\r\n" + 
			"                              </HBox>\r\n" + 
			"                              <HBox alignment=\"CENTER\" layoutX=\"10.0\" layoutY=\"10.0\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"1\" GridPane.rowIndex=\"1\">\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <JFXTextField fx:id=\"targetProfit\" alignment=\"CENTER\" promptText=\"Enter target profit\" style=\"-jfx-focus-color: darkred;\" />\r\n" + 
			"                                 </children>\r\n" + 
			"                              </HBox>\r\n" + 
			"                           </children>\r\n" + 
			"                        </GridPane>\r\n" + 
			"                     </content>\r\n" + 
			"                  </Tab>\r\n" + 
			"                  <Tab text=\"Travel\">\r\n" + 
			"                     <content>\r\n" + 
			"                        <GridPane>\r\n" + 
			"                          <columnConstraints>\r\n" + 
			"                            <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                          </columnConstraints>\r\n" + 
			"                          <rowConstraints>\r\n" + 
			"                            <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                              <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                            <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                          </rowConstraints>\r\n" + 
			"                           <children>\r\n" + 
			"                              <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\">\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <JFXCheckBox fx:id=\"clanWars\" text=\"Bank at clan wars and use portal (Otherwise we use edge bank)\" />\r\n" + 
			"                                 </children>\r\n" + 
			"                                 <opaqueInsets>\r\n" + 
			"                                    <Insets />\r\n" + 
			"                                 </opaqueInsets>\r\n" + 
			"                                 <GridPane.margin>\r\n" + 
			"                                    <Insets />\r\n" + 
			"                                 </GridPane.margin>\r\n" + 
			"                              </HBox>\r\n" + 
			"                              <HBox alignment=\"CENTER_LEFT\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.rowIndex=\"2\">\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <GridPane prefHeight=\"99.0\" prefWidth=\"823.0\">\r\n" + 
			"                                      <columnConstraints>\r\n" + 
			"                                        <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                                        <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                                      </columnConstraints>\r\n" + 
			"                                      <rowConstraints>\r\n" + 
			"                                        <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                                      </rowConstraints>\r\n" + 
			"                                       <children>\r\n" + 
			"                                          <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\">\r\n" + 
			"                                             <children>\r\n" + 
			"                                                <Label text=\"Revenant travel method\" />\r\n" + 
			"                                             </children>\r\n" + 
			"                                          </HBox>\r\n" + 
			"                                          <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"1\">\r\n" + 
			"                                             <children>\r\n" + 
			"                                                <JFXComboBox fx:id=\"travelMethod\" promptText=\"Select a method\" style=\"-jfx-focus-color: darkred;\" />\r\n" + 
			"                                             </children>\r\n" + 
			"                                          </HBox>\r\n" + 
			"                                       </children>\r\n" + 
			"                                    </GridPane>\r\n" + 
			"                                 </children>\r\n" + 
			"                              </HBox>\r\n" + 
			"                              <HBox alignment=\"CENTER\" layoutX=\"10.0\" layoutY=\"10.0\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.rowIndex=\"1\">\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <JFXCheckBox fx:id=\"royalSeedPod\" text=\"Use royal seed pod to bank\" />\r\n" + 
			"                                 </children>\r\n" + 
			"                                 <GridPane.margin>\r\n" + 
			"                                    <Insets />\r\n" + 
			"                                 </GridPane.margin>\r\n" + 
			"                              </HBox>\r\n" + 
			"                           </children>\r\n" + 
			"                        </GridPane>\r\n" + 
			"                     </content>\r\n" + 
			"                  </Tab>\r\n" + 
			"                  <Tab text=\"World Hopping\">\r\n" + 
			"                     <content>\r\n" + 
			"                        <GridPane>\r\n" + 
			"                          <columnConstraints>\r\n" + 
			"                            <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                          </columnConstraints>\r\n" + 
			"                          <rowConstraints>\r\n" + 
			"                            <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                            <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                            <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                          </rowConstraints>\r\n" + 
			"                           <children>\r\n" + 
			"                              <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\">\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <JFXCheckBox fx:id=\"disableWorldHopping\" text=\"Disable world hopping when PKer nearby\" />\r\n" + 
			"                                 </children>\r\n" + 
			"                              </HBox>\r\n" + 
			"                              <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.rowIndex=\"2\">\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <JFXTextField fx:id=\"worldTextField\" alignment=\"CENTER\" prefHeight=\"25.0\" prefWidth=\"272.0\" promptText=\"Enter world(s)\" style=\"-jfx-focus-color: darkred;\" />\r\n" + 
			"                                 </children>\r\n" + 
			"                              </HBox>\r\n" + 
			"                              <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.rowIndex=\"1\">\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <Text strokeType=\"OUTSIDE\" strokeWidth=\"0.0\" text=\"Choose worlds to hop to (will ignore if world hopping is disabled) (leave empty to use all) (comma to separate multiple worlds)\" />\r\n" + 
			"                                 </children>\r\n" + 
			"                              </HBox>\r\n" + 
			"                           </children>\r\n" + 
			"                        </GridPane>\r\n" + 
			"                     </content>\r\n" + 
			"                  </Tab>\r\n" + 
			"                  <Tab text=\"Misc.\">\r\n" + 
			"                     <content>\r\n" + 
			"                        <GridPane>\r\n" + 
			"                           <columnConstraints>\r\n" + 
			"                              <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                           </columnConstraints>\r\n" + 
			"                           <rowConstraints>\r\n" + 
			"                              <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                              <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                              <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                              <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                              <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                              <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                           </rowConstraints>\r\n" + 
			"                           <children>\r\n" + 
			"                              <HBox alignment=\"CENTER_LEFT\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.rowIndex=\"2\">\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <JFXCheckBox fx:id=\"customAntiban\" text=\"Custom antiban inside revenant cave\" />\r\n" + 
			"                                 </children>\r\n" + 
			"                                 <opaqueInsets>\r\n" + 
			"                                    <Insets />\r\n" + 
			"                                 </opaqueInsets>\r\n" + 
			"                                 <GridPane.margin>\r\n" + 
			"                                    <Insets left=\"30.0\" />\r\n" + 
			"                                 </GridPane.margin>\r\n" + 
			"                              </HBox>\r\n" + 
			"                              <HBox alignment=\"CENTER_LEFT\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.rowIndex=\"3\">\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <JFXCheckBox fx:id=\"keepCameraHigh\" text=\"Keep camera angle high\" />\r\n" + 
			"                                 </children>\r\n" + 
			"                                 <GridPane.margin>\r\n" + 
			"                                    <Insets left=\"30.0\" />\r\n" + 
			"                                 </GridPane.margin>\r\n" + 
			"                              </HBox>\r\n" + 
			"                              <HBox alignment=\"CENTER_LEFT\" layoutX=\"10.0\" layoutY=\"62.0\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.rowIndex=\"4\">\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <JFXCheckBox fx:id=\"salve\" text=\"Salve amulet\" />\r\n" + 
			"                                 </children>\r\n" + 
			"                                 <GridPane.margin>\r\n" + 
			"                                    <Insets left=\"30.0\" />\r\n" + 
			"                                 </GridPane.margin>\r\n" + 
			"                              </HBox>\r\n" + 
			"                              <HBox alignment=\"CENTER_LEFT\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.rowIndex=\"5\">\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <JFXCheckBox fx:id=\"agilityShortcut\" text=\"Use agility shortcut to avoid PKers if teleblocked\" />\r\n" + 
			"                                 </children>\r\n" + 
			"                                 <GridPane.margin>\r\n" + 
			"                                    <Insets left=\"30.0\" />\r\n" + 
			"                                 </GridPane.margin>\r\n" + 
			"                              </HBox>\r\n" + 
			"                              <GridPane>\r\n" + 
			"                                <columnConstraints>\r\n" + 
			"                                  <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                                  <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                                </columnConstraints>\r\n" + 
			"                                <rowConstraints>\r\n" + 
			"                                  <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"                                </rowConstraints>\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\">\r\n" + 
			"                                       <children>\r\n" + 
			"                                          <Label text=\"Camera method\" />\r\n" + 
			"                                       </children>\r\n" + 
			"                                    </HBox>\r\n" + 
			"                                    <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"1\">\r\n" + 
			"                                       <children>\r\n" + 
			"                                          <JFXComboBox fx:id=\"cameraMethod\" promptText=\"Select camera method\" style=\"-jfx-focus-color: darkred;\" />\r\n" + 
			"                                       </children>\r\n" + 
			"                                    </HBox>\r\n" + 
			"                                 </children>\r\n" + 
			"                              </GridPane>\r\n" + 
			"                              <HBox alignment=\"CENTER_LEFT\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.rowIndex=\"1\">\r\n" + 
			"                                 <children>\r\n" + 
			"                                    <JFXCheckBox fx:id=\"specialAttack\" text=\"Use special attack\" />\r\n" + 
			"                                 </children>\r\n" + 
			"                                 <GridPane.margin>\r\n" + 
			"                                    <Insets left=\"30.0\" />\r\n" + 
			"                                 </GridPane.margin>\r\n" + 
			"                              </HBox>\r\n" + 
			"                           </children>\r\n" + 
			"                        </GridPane>\r\n" + 
			"                     </content>\r\n" + 
			"                  </Tab>\r\n" + 
			"               </tabs>\r\n" + 
			"            </JFXTabPane>\r\n" + 
			"         </content>\r\n" + 
			"      </Tab>\r\n" + 
			"      <Tab text=\"Save/Load Settings\">\r\n" + 
			"         <content>\r\n" + 
			"            <GridPane prefHeight=\"145.0\" prefWidth=\"828.0\">\r\n" + 
			"               <columnConstraints>\r\n" + 
			"                  <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"                  <ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />\r\n" + 
			"               </columnConstraints>\r\n" + 
			"               <children>\r\n" + 
			"                  <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\">\r\n" + 
			"                     <children>\r\n" + 
			"                        <JFXButton onAction=\"#saveSettings\" prefHeight=\"40.0\" prefWidth=\"150.0\" style=\"-fx-background-color: darkred; -fx-font-weight: bold; -fx-text-fill: white;\" text=\"SAVE SETTINGS\" />\r\n" + 
			"                     </children>\r\n" + 
			"                  </HBox>\r\n" + 
			"                  <HBox alignment=\"CENTER\" prefHeight=\"100.0\" prefWidth=\"200.0\" GridPane.columnIndex=\"1\">\r\n" + 
			"                     <children>\r\n" + 
			"                        <JFXButton onAction=\"#loadSettings\" prefHeight=\"40.0\" prefWidth=\"150.0\" style=\"-fx-background-color: darkred; -fx-font-weight: bold; -fx-text-fill: white;\" text=\"LOAD SETTINGS\" />\r\n" + 
			"                     </children>\r\n" + 
			"                  </HBox>\r\n" + 
			"               </children>\r\n" + 
			"               <rowConstraints>\r\n" + 
			"                  <RowConstraints minHeight=\"10.0\" prefHeight=\"30.0\" vgrow=\"SOMETIMES\" />\r\n" + 
			"               </rowConstraints>\r\n" + 
			"            </GridPane>\r\n" + 
			"         </content>\r\n" + 
			"      </Tab>\r\n" + 
			"   </tabs>\r\n" + 
			"</JFXTabPane>\r\n" + 
			"";
	
}
