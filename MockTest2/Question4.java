package MockTest2;
/*
 * Create an interface called Drawable with a method draw() that has no implementation.
 *  Implement this interface in classes Circle and Rectangle.
 *  Write a program that creates objects of Circle and Rectangle and calls the draw() method on each object
 */
interface Drawable
{
    void draw();
}

class Rectangle1 implements Drawable
{
    public void draw()
    {
        System.out.println("Implements in Rectangle class");
    }
}

class Circle1 implements Drawable
{
    public void draw()
    {
        System.out.println("Implements in circle class");
    }
}
public class Question4 {
    public static void main(String []args)
    {
        Drawable c=new Circle1();
       c.draw();
        Rectangle1 r=new Rectangle1();
        r.draw();
    } 
}


