/*
 *  Write a Java program to find the largest of three numbers using nested if-else statements.
 */

import java.util.*;
public class Question4 {
    public static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int n1=scan.nextInt();

        System.out.println("Please enter the second number:");
        int n2=scan.nextInt();

        System.out.println("Please enter the third number:");
        int n3=scan.nextInt();

        if(n1>n2){
            if(n1>n3){
                System.out.println(n1+"is the largest number");
            }else {
                System.out.println(n3+"is the largest number");

            }

        }else if(n2>n1){
            if(n2>n3){
             System.out.println(n2+"is the largest number");
            }else{
                 System.out.println(n3+"is the largest number");
            }
        }else{
             System.out.println(n3+"is the largest number");
        }




    }
    
}
