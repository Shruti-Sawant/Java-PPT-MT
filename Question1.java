/*  
    Write a Java program to check whether a given number is positive, negative, or zero using an if-else statement.
*/

import java.util.*;

public class Question1{
    public static void main(String []args)
    {
            Scanner scan = new Scanner(System.in); 
            System.out.println("Please enter the number");
            int n=scan.nextInt();
            if(n>0)
            {
                System.out.println("Entered number is positive number");
            }
            else if(n<0)
            {
                System.out.println("Entered number is negative number");
            }
            else if(n==0)
            {
                 System.out.println("Entered number is Zero");
            }
            else{
                 System.out.println("Enter valid number");
            }
        }


    
}