import java.util.Random;
import java.util.Scanner;

class Answer21April2020
{
    public static void main(String[] args) {
        int pointic=0;                              //points inside circle 
        
        Scanner scan=new Scanner(System.in); 
        System.out.println("ENTER THE NO OF INTANCE");
        long n=scan.nextLong();                       //no of random points 0....1
        long z=n;
        scan.close();

        float x_i=0;                                //x axis point for random variable 
        float x_y=0;                                //y axis point for random variable 
        
        
        while(n>0)
        {
            Random rand =new Random();
            x_i=rand.nextFloat();
            x_y=rand.nextFloat();
            
            float dis = ((x_i * x_i) + (x_y * x_y));
            if(dis<=1)
            {
                pointic++;
            }
            n--;
        }

        pointic*=4;
        double pi= (double)pointic/z;
        
        System.out.println(pi);



    }
}
