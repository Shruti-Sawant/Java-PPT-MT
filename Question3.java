/*
 *  Write a Java program to calculate the average of a list of numbers using a do-while loop.*
 */



public class Question3 {
    public static void main(String []args)
    {
        int a[]={31,23,35,48,55};
        int i=0;
        int sum=0;
        float avg;
        
        do{
         
            sum+=a[i];
            i++;
            
        }while(i<5);
        System.out.println(sum);
        avg=(float)sum/5;
        System.out.println("Average of the lidt of 5 numbers:"+avg);

    }
}
