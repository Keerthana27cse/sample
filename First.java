class Person
{
    private String name;
    private int age;
    
    static 
    {
        System.out.println("heloo");
    }
    Person()
    {

    }

    Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    public  String getName()
    {
           return name;
    }
    public int getAge()
    {
        return age;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }

}
class Cow extends Person
{

    static
    {
        System.out.println("welcome**");
    }
}
public class First 
{
    public static void main(String[] args)
    {
        Person p1=new Person("kee",4);
        System.out.println(p1.getName()+ " is "+ p1.getAge());

        Person p2=new Person("ram",9);
        //Cow b1= new Cow();
        System.out.println(p2.getName()+ " is "+ p2.getAge());

        p1.setName("gagu");
        p1.setAge(8);
        System.out.println(p1.getName()+" is "+ p1.getAge());
    }
}