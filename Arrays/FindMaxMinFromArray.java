package Arrays;

import java.util.Arrays;

public class FindMaxMinFromArray {

    static int max;
    static int min;

    public static void main(String[] args) {

        int []array= new int[]{-2,2,3,40,5,6,7,8};
        printArray(array);                          //printing initial array
        calculateMaxMin(array);                     //fCalculating max and min from the array
        System.out.println("Max Element = " + max);
        System.out.println("Min Element = " + min);

    }
    public static void calculateMaxMin(int [] array)
    {
       min=array[0];                                //Calculating min and max using Traditional method
       max=array[0];
        for(int x :array)
        {
            if(x>max)
                max=x;
            if(x<min)
                min=x;
        }


        /*                                              //Calculating max and min Using Stream
             max= Arrays.stream(array).max().getAsInt();
             min= Arrays.stream(array).min().getAsInt();
        */

    }

    public static void printArray(int [] array)
    {
        Arrays.stream(array).forEach(x-> System.out.print(x+" "));
        System.out.println();
    }
}

