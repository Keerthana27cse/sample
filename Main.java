import java.util.Scanner;

abstract class  Animal
{
    void  eat()
    {
        System.out.println("Eating");
    }
    void  sleep()
    { 
        System.out.println("Sleeping");

    }
    abstract void makeSound();
}
class Bird extends Animal{

    @Override
    void makeSound() {
        System.out.println("chirping!!");
    }
}
class Dog extends Animal {
    @Override
    void makeSound()
    {
        System.out.println("Barkkkk");
    }
}
class Petstation {
    static Animal getPet(String animaltype)
    {
        Animal pet=null;
        if(animaltype.equals("dog"))
        {
            pet= new Dog();
        }
        else
        {
            pet= new Bird();
        }
        return pet;
    }
}


public class Main {
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);  
        System.out.println("Pet Animals list!");
        System.out.println("DOG");
        System.out.println("CAT");
        System.out.println("GOAT");
        System.out.println("Which animal you want?");
        String animaltype=scan.next();
        
        Animal pet=Petstation.getPet(animaltype);
        pet.makeSound();
        pet.eat();
        pet.sleep();
    }
}