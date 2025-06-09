
import java.io.FileReader;
import java.io.IOException;

class Monitor 
{
   public void readFile(String filename) 
   {    try{
        FileReader fr=new FileReader(filename);
            int r;
            while((r=fr.read())!=-1)
            {
                System.out.print((char)r);
            }
            fr.close();
            } catch (IOException e) 
            {
               e.printStackTrace();        
            }
        }
}
class Thread1 extends Thread
{
    Monitor m;
    public Thread1(Monitor m)
    {
        this.m=m;
    }
    @Override
    public void run()
    {
         synchronized(m)
         {
            m.readFile("Pure.java");
         }
    }


}
class Thread2 extends Thread
{
    Monitor m;
    public Thread2(Monitor m)
    {
        this.m=m;
    }
    @Override
    public void run()
    {
           synchronized(m)
           {
            m.readFile("Read.java");
           }

}
}

public class Read1 
{
    public static void main(String[] args) {
        Monitor m=new Monitor();
        Thread1 t1=new Thread1(m);
        Thread2 t2=new Thread2(m);
        t1.start();
        t2.start();

        
    }
}
