public class Humburger {
    private String Bread_Roll_Type;
    private String meat ;
    private String Lettuce;
    private int price ;
    private String name;

    private String Sauce_Type;
    private String Tomatoe;
    private String Chillie;

    private String addition1;
    private int priceOfAddition1;

    private String addition2;
    private int priceOfAddition2;

    private String addition3;
    private int priceOfAddition3;

    private String addition4;
    private int priceOfAddition4;

    public Humburger(String bread_Roll_Type, String meat, int price) {
        Bread_Roll_Type = bread_Roll_Type;
        this.meat = meat;
        this.price=price;


    }
    public void firstAddition(String addition1,int priceOfAddition1)
    {this.addition1= addition1;
    this.priceOfAddition1=priceOfAddition1 ;


    }
    public void SecondAddition(String addition2,int priceOfAddition2)
    {this.addition2= addition2;
        this.priceOfAddition2=priceOfAddition2 ;


    }
    public void ThirdAddition(String addition3,int priceOfAddition3)
    {this.addition3= addition3;
        this.priceOfAddition3=priceOfAddition3 ;


    }
    public void FourthAddition(String addition4,int priceOfAddition4)
    {this.addition4= addition4;
        this.priceOfAddition4=priceOfAddition4 ;


    }

    public int BurgerPrice()
    {
        int humburgerPrice=this.price;

        if(this.addition1!=null)
        {   humburgerPrice += this.priceOfAddition1;
            System.out.println("Added " + this.addition1+ " cost " +"$"+this.priceOfAddition1);
        }
        if(this.addition2!=null)
        {   humburgerPrice += this.priceOfAddition2;
            System.out.println("Added " + this.addition2+ " cost " +"$"+this.priceOfAddition2);
        }
        if(this.addition3!=null)
        {   humburgerPrice += this.priceOfAddition3;
            System.out.println("Added " + this.addition3+ " cost " +"$"+this.priceOfAddition3);
        }
        if(this.addition4!=null)
        {   humburgerPrice += this.priceOfAddition4;
            System.out.println("Added " + this.addition4+ " cost " +"$"+this.priceOfAddition4);
        }
        //System.out.println("The cost of the Burgur is:");
        return humburgerPrice;
    }

}
