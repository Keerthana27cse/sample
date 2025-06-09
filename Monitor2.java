import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class program1
{
    public void write(String context,String filename)
    {
      try {
        FileWriter fw= new FileWriter(filename);
        fw.write(context);
        fw.close();
        System.out.println("✅ File written successfully.");
      } catch (IOException e) {
        e.printStackTrace();
    }
    }

      public void read1(String filename)
    {
       try {
        FileReader fr=new FileReader(filename);
        int r;
        while((r=fr.read())!=-1)
        {
           System.out.print((char)r);
        }
        fr.close();
        System.out.println("\n✅ File read complete.");

       } catch (IOException e) {
        e.printStackTrace();
       }
    }
}
class WriterThread extends Thread
{
      program1 m;
      String context;
      
      public WriterThread(program1 m, String context)
      {
            this.m=m;
            this.context=context;
      }
      @Override
      public void run()
      {
           m.write(context,"output1.txt");
      }


}
class ReaderThread extends Thread 
{
    program1 m;
    public ReaderThread(program1 m)
    {
         this.m=m;
    }
    public void run()
    {
        m.read1("output1.txt");
    }
}
class Monitor2
{
    public static void main(String[] args) 
    {
        program1 p=new program1();
        WriterThread t1=new WriterThread(p,"hiiiiii");
        ReaderThread t2=new ReaderThread(p);
        t1.start();
        t2.start();
    }
}