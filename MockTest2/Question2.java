package MockTest2;

/* Create a superclass called Shape with an abstract method calculateArea() that returns 
   the area of the shape. Implement subclasses Rectangle, Circle, and Triangle that inherit from the Shape class.
   Implement the calculateArea() method in each subclass to calculate and return the area of a rectangle, circle, and triangle, respectively.
   Then, create a class called ShapeCalculator with a method printArea(Shape shape) that accepts an object of type Shape and prints its area.
   Demonstrate polymorphism by passing instances of different subclasses to the printArea() method. */

abstract class Shape
{
    double l=4, b=4,r=3,h=3;
    abstract public double calculateArea();
   
}

class Rectangle extends Shape
{
    @Override
    public double calculateArea()
    {
       return l*b;

    }
}

class Circle extends Shape
{
    public double calculateArea()
    {
        return 3.14*r*r;
    }
}

class Triangle extends Shape
{
    public double calculateArea()
    {
        return 0.5*h*b;
    } 
}

class ShapeCalculator
{
     
    public void printArea(Shape shape)
    {
       System.out.println(shape.calculateArea());

    }
}
public class Question2 {
    public static void main(String []args)
    {
        Shape rec=new Rectangle();
        Shape cir=new Circle();
        Shape tri=new Triangle();
        ShapeCalculator sc=new ShapeCalculator();
        sc.printArea(tri);
        sc.printArea(cir);
        sc.printArea(rec);
    }
}
