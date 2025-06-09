import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Ex1
{
   BufferedImage img;
   public BufferedImage ReadImg(String sourcepath)
   {
    try {
        img=ImageIO.read(new File(sourcepath));
        System.out.println("✅ Image read successfully.");
     } catch (IOException e) {
        e.printStackTrace();
    }
    return img;
   }
}
public class Image {
    public static void main(String[] args) {
        Ex1 p=new Ex1();
        BufferedImage image =p.ReadImg("C:\\Users\\KEERTHANA\\Downloads\\Untitled Diagram.drawio.png");
            
            if (image!= null) {
            System.out.println("✅ Image loaded successfully.");

            // Create window (JFrame)
            JFrame frame = new JFrame("Image Viewer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Wrap BufferedImage in an ImageIcon and JLabel
            JLabel label = new JLabel(new ImageIcon(image));

            // Add label to frame and adjust size
            frame.getContentPane().add(label);
            frame.pack(); // auto sizes window
            frame.setVisible(true); // show window
        } else {
            System.out.println("❌ Failed to load image.");
        }
    }
}



