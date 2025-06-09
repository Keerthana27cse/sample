import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream
{
  public static void main(String[] args) {

    List<Integer>l1=Arrays.asList(6,0,1,2,3,4,5,90);
    l1.stream().map(a->a*2).forEach(a -> System.out.println(a));

    List <Integer>li =l1.parallelStream().collect(Collectors.toList());
    li.parallelStream().map(a->a*3);   
}
}