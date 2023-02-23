public abstract class Hero implements HavingSuperAbility   {
    int health;
    int damage;
    private String  AbilityType;




    public String getAbilityType() {
        return AbilityType;
    }

    public void setAbilityType(String abilityType) {
        AbilityType = abilityType;
    }
}
