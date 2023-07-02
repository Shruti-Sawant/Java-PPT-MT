/*
   ****  Write a Java program to print the Fibonacci series up to a given number using a for loop.****

 */


 import java.util.*;
public class Question2 {

    public static int fibonacci(int n)
    {
       
        if(n==0 || n==1){
           return n;
        }

        return  fibonacci(n-1) +fibonacci(n-2);


    }
   
    
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Please enter the number");
        int n=scan.nextInt();

        for(int i=0;i<n;i++){
            System.out.print(fibonacci(i)+" ");
        }
        
    }
}
