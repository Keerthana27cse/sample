import java.io.FileReader;
import java.io.IOException;

class Monitor {
public void readfile(String filename)
        {
        try{
        FileReader fr=new FileReader(filename);
        int r;
        while((r=fr.read())!=-1)
        {
            System.out.print((char)r);
        }
         fr.close();
    }
   
    catch (IOException e)
    {
        e.printStackTrace();
    }
}
}
public class Read2
{
    public static void main(String[] args) {
        Monitor n=new Monitor();
        n.readfile("Pure.java");
    }
}
