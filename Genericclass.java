 class One<T1,T2>
 {
    T1 a;
    T2 b;

    One(T1 a,T2 b)
    {
        this.a=a;
        this.b=b;
    }
    void display()
    {
        System.out.println(a);
        System.out.println(b);
    }
 }
public class Genericclass {
    public static void main(String[] args) {
        One<String,String>e1=new One<String,String>("Madhu","keerii");
        e1.display();
    }
}
   