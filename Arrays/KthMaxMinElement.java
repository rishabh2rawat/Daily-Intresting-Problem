package Arrays;

import java.util.Arrays;

public class KthMaxMinElement {

    static int max;
    static int min;
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,4,5,6,7,8};
        printArray(array);                      //printing array
        int k=4;
        try {
            calculateKthMaxMin(k, array);
            System.out.println(k + "th max Element = " + max);
            System.out.println(k + "th min Element = " + min);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(k+"th max min not possible");
        }



    }

    private static void calculateKthMaxMin( int k , int[] array) throws ArrayIndexOutOfBoundsException{
        max=array[0];
        min=array[0];
        int lastIndex=array.length-1;
        max = array[lastIndex - k + 1];
        min = array[k - 1];

    }


    public static void printArray(int [] array)
    {
        Arrays.stream(array).forEach(x-> System.out.print(x +" "));
        System.out.println();
    }
}
