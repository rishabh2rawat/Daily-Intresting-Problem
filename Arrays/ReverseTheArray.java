package Arrays;


import java.util.Arrays;

public class ReverseTheArray {

    public static void main(String[] args) {
        int []array= new int[]{1,2,3,4,5,6,7,8,9,10};

        printArray(array);          // printing Initial Array
        array= reverseArray(array); // reversing array
        printArray(array);          // printing updated array



    }

    public static int[] reverseArray(int[] array)
    {
        int start=0;
        int end=array.length-1;
        while(start<=end)
        {
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;

        }
        return array;
    }

    public static void printArray(int array[])
    {
        Arrays.stream(array).forEach((x)-> System.out.print(x+" "));
        System.out.println();
    }
}
