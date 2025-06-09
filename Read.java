class Monitor extends Thread
{
    @Override
    public void run()
    {
       
        for(int i=0;i<10;i++)
       {
        System.out.println(i);
       }
        }
      
}
class Monitor2 extends Thread
{
    @Override
    public void run()
    {
       
        for(int i=10;i<20;i++)
        {
            System.out.println("monitor 2:\t"+i);
        }
    }
}

public class Read 
{
    public static void main(String[] args) 
    {

        Monitor m= new Monitor();
        m.start();
        try {
            m.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
                }
        Monitor2 m2= new Monitor2();
        m2.start();
    }
}