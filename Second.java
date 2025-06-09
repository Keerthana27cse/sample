class Dog
{
    private  String name;
    private String breed;
    
    Dog(String name, String breed)
    {
        this.name=name;
        this.breed=breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    
}


public class Second 
{
    public static void main(String[] args)
    {
    Dog d1=new Dog("puppy","country");
    Dog d2=new Dog("jackky","bomarion");

    System.out.println(d1.getName()+" " +d1.getBreed());
    System.out.println(d2.getName()+" "+d2.getBreed());
    d1.setName("keeri");
    d1.setBreed("fish");
    System.out.println(d1.getName()+" "+d1.getBreed());

    }
}
