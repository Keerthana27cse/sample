class Outer
{
    static  class Inner  //static 
    {
        int m=10;
        static void display1()
        {
            System.out.println("Inner class");
        }
        void display2()
        {
            System.out.println(" inner Static method");
        }
        public int display3(int m)
        {
            return m;
        }
    }
    class Nstatic
    {
        int n;
        static void display1()
        {
            System.out.println("ns static method");
        }
        void display2()
        {
            System.out.println(" ns instance");
        }
        public int display3(int n)
        {
            
            return n;
        }

    }
    void display()
    {
        class methodclass
        {
         void display1()
        {
            System.out.println("method static method");
        }
        void display2()
        {
            System.out.println(" method instance");
        }
        public int display3(int n)
        {
            return n;
        }
    }
        methodclass cl=new methodclass();
        cl.display1();
        cl.display2();
        System .out.println(cl.display3(10)+"method");
    }
}
public  class InnerClass
{
    public static void main(String[] args)
    {
      Outer.Inner o1=new Outer.Inner();
      Outer.Inner.display1();
      o1.display2();
      System.out.println(o1.display3(40));
      Outer o=new Outer();
      Outer.Nstatic s1=o.new Nstatic();
      s1.display2();
      Outer.Nstatic.display1();
      System.out.println(s1.display3(40));
      o.display();
    }
}

