public class Warrior extends Hero {
    @Override
    public void applySuperAbility() {

        setAbilityType("warrior ударил ");
        System.out.println("warrior применил супер способность" + getAbilityType());
    }
}
