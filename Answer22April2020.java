import java.io.*;
import java.util.*;

public class Answer22April2020 {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the no of steps in the staircase");
        int n=scan.nextInt();                                     // no of steps in the staircase                         
        
        if(n==0)
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(findsteps(n)+" No of ways ");
        }

    }

     public static int findsteps(int n)
     {
        int a=0;
        int b=1;
        int c=0;
       
        for(int i=1;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
    
        
        return c;

     }

}