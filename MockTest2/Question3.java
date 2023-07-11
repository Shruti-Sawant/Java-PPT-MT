package MockTest2;
/*
 * Create a class called Person with private properties like name, age, and address. 
 * Provide public getter and setter methods for these properties. Write a program that creates an instance of the Person class,
 *  sets values for its properties using the setter methods, and displays the values using the getter methods.
 */
class Person
{
    private String name;
    private int age;
    private String address;

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }

    public void setAddress(String address)
    {
        this.address=address;
    }
    public String getAddress()
    {
        return address;
    }

    public void displays()
    {
        System.out.println(name+" "+age+" "+address);
    }

   
}
public class Question3 {
    public static void main(String []args)
    {
        Person p1=new Person();
        p1.setName("vrushika");
        p1.getName();
        p1.setAge(19);
        p1.getAge();
        p1.setAddress("nikol");
        p1.getAddress();
        p1.displays();

    }
}
