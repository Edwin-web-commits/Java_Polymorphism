public class BeefBurger extends Humburger {
    private String chips;
    private String smoothie;
    public BeefBurger(String dessert, String smoothie) {
        super("BrownRolls","Beef", 15);
        this.smoothie=smoothie;
        this.chips=chips;

        System.out.println("Beef burger with BrownRolls,Beef,dessert and smootie pieces at $15");
    }

}
