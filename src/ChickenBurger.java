public class ChickenBurger extends Humburger{
    private String cold_drink;
    private String chips ;



    public ChickenBurger(String cold_drink, String chips) {
        super("WhiteRolls", "Chicken", 10);

        this.cold_drink=cold_drink;
        this.chips=chips;
        System.out.println("Chicken burger with whiteRolls,2 chicken pieces,Coke and chips at $10");
    }


}
