class One{
    <T>void display(T a)   {
        
        System.out.println(a);
    }
}
public class GenericMethod {
   public static void main(String[] args) 
   {
    One o1=new One();
    o1.display(100);
    o1.display("string");
   } 
}

