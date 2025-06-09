import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class StaticMethodRef {
        public static void greet(String name) 
        {
        System.out.println("Hello, " + name);
    }
  }


public class Functions{
    public static void main(String[] args) 
    {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(9);
        l1.add(8);
        l1.add(7);
        l1.add(13);
        Predicate <Integer> isPrime= num ->
        {
              if(num<=1)
              {
                return false;
              }
              else 
              {
                for(int i=2;i<=Math.sqrt(num);i++)
                {
                   if(num%i==0)
                      return false;;
                }
              }
              return true;
        };
        l1.stream().filter(isPrime).forEach(n -> System.out.println(n));
        long n=l1.stream().filter(isPrime).count();
        System.out.println(n);

        Consumer<String> c = b -> System.out.println("Hello " + b);
        c.accept("Keerthana");

        Function<Integer, Integer> m = v -> { return v*v;}; // return the input or any other value
        System.out.println("Returned: " + m.apply(5));  // You can pass any value
        
        
        Consumer<String> con = StaticMethodRef::greet;
        con.accept("Keerthana");
        
    
      };
}

