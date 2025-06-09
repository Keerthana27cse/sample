interface Bird
{
   void eat();
   default void sleep()
   {
    System.out.println("Sleeping");
   }
   void makeSound();
}

interface flying
{
    void fly();
}

interface  nonflying
{
    void nonfly();
}

class  Sparrow implements Bird,flying{

    @Override
    public void eat() {
        System.out.println("Sparrow is pecking at seeds!");        
    }

    @Override
    public void makeSound() {
        System.out.println("Sparrow is chirping...");        
    }
    public void fly() {
        System.out.println("Sparrow is flying across the garden!");        
    }
}
class Swifts implements Bird,nonflying
{

    @Override
    public void eat() {
        System.out.println("Swift is eating insects..!");        
    }

    @Override
    public void makeSound() {
        System.out.println("Switf is chirping");        
    }

    @Override
    public void nonfly() {
        System.out.println("Swoft can't walk");        
    }
    
}
class BirdStation {
    static public  Bird getBird(String Birdtype)
    {
        Bird b1=null;
        if(Birdtype.equals("Sparrow"))
        {
            b1=new Sparrow();
        }
        else if (Birdtype.equals("Swifts"))
        {
            b1=new Swifts();
        }
        else
        {
            System.out.println("invalid");
        }
        return b1;

    }
}

public class Pure {
    public static void main(String[] args) 
    {
        Bird b1=BirdStation.getBird("Sparrow");
        b1.eat();
        b1.sleep();
        b1.makeSound();
        ((flying) b1).fly();


    }
    
}
