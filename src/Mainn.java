public class Mainn {
    public static void main(String[] args)
    {
        Humburger humburger=new Humburger("brown","chicken",50);
        humburger.firstAddition("Chicken Sauce",11);
        humburger.SecondAddition("lettuce",10);
        humburger.ThirdAddition("smoothie",5);
        int pricee= humburger.BurgerPrice();
        System.out.println(pricee);

        ChickenBurger chicken=new ChickenBurger("Coke","large");
        chicken.firstAddition("egg",5);
        System.out.println(chicken.BurgerPrice());

        BeefBurger beef=new BeefBurger("Pepsi","Chocolate Shake");
        beef.firstAddition("Chocolate",2);
        System.out.println(beef.BurgerPrice());





    }
}
