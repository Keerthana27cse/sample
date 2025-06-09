class  Rectangle {

    private float width;
    private float height;
    



    Rectangle(float width,float height)
    {
        this.height=height;
        this.width=width;
    }
    public float getWidth(float width)
    {
        return width;
    }
    public  float getHeight(float height)
    {
        return height;
    }
    public void setHeight(float height)
    {
          this.height=height;
    }
    public void SetWidth(float width)
    {
        this.width=width;
    }
    public float getArea()
    {
        return height*width;
    }
    public float getPerimeter()
    {
        return 2*(height +width);
    }  
}
public class Third 
{
    public static void main(String[] args) 
    {
        Rectangle r1=new Rectangle(7,12);
         System.out.println(r1.getPerimeter());
         System.out.println(r1.getArea());
         r1.SetWidth(6);
         r1.setHeight(12);
         System.out.println(r1.getPerimeter());
         System.out.println(r1.getArea());

    }
}
