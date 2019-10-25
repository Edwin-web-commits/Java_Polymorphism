import java.util.Random;

class Car {
    private String name ;
    private String engine;
    private  int wheels;

    public Car(String name, String engine, int wheels) {
        this.name = name;
        this.engine = engine;
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }
    public String StartEngine()
    {return("The engine is starting");}
    public  String Accelerate()
    {return("you applied accelerator and your car speed is very high");}
    public  String brake()
    {return ("You applied brakes and now the car's speed is reducing");}


}
class BMW extends Car
{
    public BMW() {

        super("Bmw", "V12", 4);
    }
    public String StartEngine()
    {return("The BMW engine is starting");}
    public  String Accelerate()
    {return("you applied accelerator and your car speed is very high");}
    public String brake()
    {return ("The car is slowing down");}



}
class Benz extends Car
{
    public Benz() {
        super("Benz", "V8", 4);
    }
    public String StartEngine()
    {return("The Benz engine is starting");}
    public  String Accelerate()
    {return("you applied accelerator and your car speed is very high");}
    public String brake()
    {return ("The car is slowing down");}
}
class KIA extends Car
{
    public KIA() {
        super("Kia", "V20", 4);
    }
    public String StartEngine()
    {return("The KIA engine is starting");}
    public  String Accelerate()
    {return("you applied accelerator and your car speed is very high");}
    public String brake()
    {return ("The car is slowing down");}
}

 class Main {
     public static void main(String[] args) {

       for(int i=1 ;i<10;i++)
       {   Car car= Model();

           System.out.println("The random Car is:"+ car.getName()+"\n"+ "It has "+ car.getEngine()+ "engine"+"\n" + "Action is:"+car.StartEngine() +"\n"+car.Accelerate()+"\n"+car.brake());
       }
     }
    public static Car Model(){
     int Random = (int) (Math.random() * 3) + 1;
     System.out.println("The random generated number was:" + Random );
      switch(Random)

     {
         case 1:
             return new BMW();
         case 2:
             return new Benz();
         case 3:
             return  new KIA();
     }
     return null ;
     }
 }


