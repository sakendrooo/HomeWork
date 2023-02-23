public class Medic extends Hero {

    @Override
    public void applySuperAbility() {
     setAbilityType("медик ударил ");
        System.out.println("madic применил супер способность" + getAbilityType());
    }
}
