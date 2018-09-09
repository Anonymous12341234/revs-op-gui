package scripts.GodsRevs.gui.enums;

public enum RevEnum {

	
    REV_IMP(7881, 7, "Revenant imp"),
    REV_GOBLIN(7931, 15, "Revenant goblin"),
    REV_PYREFIEND(7932, 52, "Revenant pyrefiend"),
    REV_HOBGOBLIN(7933, 60, "Revenant hobgoblin"),
    REV_CYCLOPS(7934, 82, "Revenant cyclops"),
    REV_HELLHOUND(7935, 90, "Revenant hellhound"),
    REV_DEMON(7936, 98, "Revenant demon"),
    REV_ORK(7937, 105, "Revenant ork"),
    REV_DARK_BEAST(7938, 120, "Revenant dark beast"),
    REV_KNIGHT(7939, 126, "Revenant knight"),
    REV_DRAGON(7940, 135, "Revenant dragon");
    

    private int revId;
    private int revLvl;
    private String name;

    RevEnum(int revId, int revLvl, String name) {
        this.revId = revId;
        this.revLvl = revLvl;
        this.name = name;
    }

    public int getRevId() {
        return revId;
    }

    public int getRevLvl() {
        return revLvl;
    }
    
    public String getRevName() {
    	return name;
    }
    
}
