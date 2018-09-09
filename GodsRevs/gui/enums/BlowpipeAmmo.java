package scripts.GodsRevs.gui.enums;

public enum BlowpipeAmmo {


    BRONZE_DART(0, ""),
    IRON_DART(0, ""),
    STEEL_DART(0, ""),
    MITHRIL_DART(0, ""),
    ADAMANT_DART(0, ""),
    RUNE_DART(0, ""),
    DRAGON_DART(0, "");
    

    private int ammoID;
    private String name;

    BlowpipeAmmo(int ammoID, String name) {
        this.ammoID = ammoID;
        this.name = name;
    }

    public int getAmmoId() {
        return ammoID;
    }

    public String getAmmoName() {
    	return name;
    }
    
}