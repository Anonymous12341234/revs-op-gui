package scripts.GodsRevs.gui;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;

import javafx.beans.property.SimpleStringProperty;
import scripts.GodsRevs.gui.enums.Potion;

public class PotionTableEntry extends RecursiveTreeObject<PotionTableEntry> {
	
	public SimpleStringProperty potion;
	public SimpleStringProperty quantity;
	
	public PotionTableEntry(String potion, int quantity) {
		this.potion = new SimpleStringProperty(potion);
		this.quantity = new SimpleStringProperty(String.valueOf(quantity));
	}
	
	public String getPotion() {
		return potion.get();
	}
	
	public String getQuantity() {
		return quantity.get();
	}
	
	public Potion getActualPotion() {
		return Potion.valueOf(potion.get());
	}
	
	public int getActualQuantity() {
		return Integer.parseInt(quantity.get());
	}

}
