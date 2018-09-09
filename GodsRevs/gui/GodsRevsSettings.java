package scripts.GodsRevs.gui;

import java.util.HashMap;

import org.tribot.api2007.Equipment;
import org.tribot.api2007.Prayer.PRAYERS;

import scripts.GodsRevs.gui.enums.BlowpipeAmmo;
import scripts.GodsRevs.gui.enums.CameraMethod;
import scripts.GodsRevs.gui.enums.CaveLocation;
import scripts.GodsRevs.gui.enums.RevEnum;
import scripts.GodsRevs.gui.enums.TravelMethod;

public class GodsRevsSettings {
	
	private RevEnum[] revs;
	private int minimumHP;
	
	private HashMap<Equipment.SLOTS, Integer> equipment;
	private PRAYERS[] prayers;
	private PotionTableEntry[] potions;
	
	private boolean stopRuntime, stopProfit;
	private int targetRuntime, targetProfit;
	
	private boolean clanWars, royalSeedPod;
	private TravelMethod travelMethod;
	
	private boolean disableWorldHopping;
	private int[] worlds;
	
	private boolean useAmmo, refillBlowpipe;
	private int ammoQuantity;
	
	private BlowpipeAmmo blowpipeAmmo;
	
	private CaveLocation caveLocation;
	
	private boolean specialAttack, customAntiban, keepCameraHigh, salve, agilityShortcut;
	
	private CameraMethod cameraMethod;

	public RevEnum[] getRevs() {
		return revs;
	}

	public void setRevs(RevEnum[] revs) {
		this.revs = revs;
	}

	public HashMap<Equipment.SLOTS, Integer> getEquipment() {
		return equipment;
	}

	public void setEquipment(HashMap<Equipment.SLOTS, Integer> equipment) {
		this.equipment = equipment;
	}

	public PRAYERS[] getPrayers() {
		return prayers;
	}

	public void setPrayers(PRAYERS[] prayers) {
		this.prayers = prayers;
	}

	public PotionTableEntry[] getPotions() {
		return potions;
	}

	public void setPotions(PotionTableEntry[] potions) {
		this.potions = potions;
	}

	public boolean isStopRuntime() {
		return stopRuntime;
	}

	public void setStopRuntime(boolean stopRuntime) {
		this.stopRuntime = stopRuntime;
	}

	public boolean isStopProfit() {
		return stopProfit;
	}

	public void setStopProfit(boolean stopProfit) {
		this.stopProfit = stopProfit;
	}

	public int getTargetRuntime() {
		return targetRuntime;
	}

	public void setTargetRuntime(int targetRuntime) {
		this.targetRuntime = targetRuntime;
	}

	public int getTargetProfit() {
		return targetProfit;
	}

	public void setTargetProfit(int targetProfit) {
		this.targetProfit = targetProfit;
	}

	public boolean isClanWars() {
		return clanWars;
	}

	public void setClanWars(boolean clanWars) {
		this.clanWars = clanWars;
	}

	public boolean isRoyalSeedPod() {
		return royalSeedPod;
	}

	public void setRoyalSeedPod(boolean royalSeedPod) {
		this.royalSeedPod = royalSeedPod;
	}

	public TravelMethod getTravelMethod() {
		return travelMethod;
	}

	public void setTravelMethod(TravelMethod travelMethod) {
		this.travelMethod = travelMethod;
	}

	public boolean isDisableWorldHopping() {
		return disableWorldHopping;
	}

	public void setDisableWorldHopping(boolean disableWorldHopping) {
		this.disableWorldHopping = disableWorldHopping;
	}

	public int[] getWorlds() {
		return worlds;
	}

	public void setWorlds(int[] worlds) {
		this.worlds = worlds;
	}

	public boolean isUseAmmo() {
		return useAmmo;
	}

	public void setUseAmmo(boolean useAmmo) {
		this.useAmmo = useAmmo;
	}

	public boolean isRefillBlowpipe() {
		return refillBlowpipe;
	}

	public void setRefillBlowpipe(boolean refillBlowpipe) {
		this.refillBlowpipe = refillBlowpipe;
	}

	public int getAmmoQuantity() {
		return ammoQuantity;
	}

	public void setAmmoQuantity(int ammoQuantity) {
		this.ammoQuantity = ammoQuantity;
	}

	public BlowpipeAmmo getBlowpipeAmmo() {
		return blowpipeAmmo;
	}

	public void setBlowpipeAmmo(BlowpipeAmmo blowpipeAmmo) {
		this.blowpipeAmmo = blowpipeAmmo;
	}

	public CaveLocation getCaveLocation() {
		return caveLocation;
	}

	public void setCaveLocation(CaveLocation caveLocation) {
		this.caveLocation = caveLocation;
	}

	public boolean isSpecialAttack() {
		return specialAttack;
	}

	public void setSpecialAttack(boolean specialAttack) {
		this.specialAttack = specialAttack;
	}

	public boolean isCustomAntiban() {
		return customAntiban;
	}

	public void setCustomAntiban(boolean customAntiban) {
		this.customAntiban = customAntiban;
	}

	public boolean isKeepCameraHigh() {
		return keepCameraHigh;
	}

	public void setKeepCameraHigh(boolean keepCameraHigh) {
		this.keepCameraHigh = keepCameraHigh;
	}

	public boolean isSalve() {
		return salve;
	}

	public void setSalve(boolean salve) {
		this.salve = salve;
	}

	public boolean isAgilityShortcut() {
		return agilityShortcut;
	}

	public void setAgilityShortcut(boolean agilityShortcut) {
		this.agilityShortcut = agilityShortcut;
	}

	public CameraMethod getCameraMethod() {
		return cameraMethod;
	}

	public void setCameraMethod(CameraMethod cameraMethod) {
		this.cameraMethod = cameraMethod;
	}

	public int getMinimumHP() {
		return minimumHP;
	}

	public void setMinimumHP(int minimumHP) {
		this.minimumHP = minimumHP;
	}

}
