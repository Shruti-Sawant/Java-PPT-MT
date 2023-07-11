package MockTest2;

/*  Create a superclass called Animal with a method makeSound() that prints the sound made by the animal.
    Implement subclasses Dog, Cat, and Cow that inherit from the Animal class.
    Implement the makeSound() method in each subclass to print the sound made by a dog, cat, and cow, respectively. */

class Animal
{
    public void makeSound(){
        System.out.println("Sounds made by animal");
    }
}

class Dog extends Animal
{
    public void makeSound()
    {
        System.out.println("Dog is barking like woof...");
    }
}

class Cat extends Animal
{
    public void makeSound()
    {
        System.out.println("Cat sounds meoww....");
    }
}

class Cow extends Animal
{
    public void makeSound()
    {
        System.out.println("Cow sounds mooo....");
    }
}


public class Question1 
{
    public static void main(String []args)
    {
        Animal a=new Animal();
        a.makeSound();
        Animal d=new Dog();
        d.makeSound();
        Animal c=new Cat(); 
        c.makeSound();
        Animal c1=new Cow();
        c1.makeSound();
    }
    
}
