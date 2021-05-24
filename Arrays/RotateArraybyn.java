package Arrays;

import java.util.Arrays;

public class RotateArraybyn {
    public static void main(String[] args) {
        int [] array =new int[]{1,2,3,4,5,6,7};
        printArray(array);
        rotateArrayByOne(array);
        //array = rotateArray(array,2);
        printArray(array);

    }

    public static int[] rotateArray(int [] array , int noOfTimes)
    {
        noOfTimes=noOfTimes%array.length;
        int [] temp=new int[array.length];
        int startPointer=array.length - noOfTimes;
        for(int i=0;i<array.length;i++)
        {
            temp[i]=array[startPointer%array.length];
            startPointer++;

        }
        return temp;

    }

    public static void rotateArrayByOne(int [] array)
    {
        int temp=array[array.length-1];
        for(int i=0;i<array.length;i++)
        {
            int t=array[i];
            array[i]=temp;
            temp=t;

        }


    }
    public static void printArray(int []array)
    {
        Arrays.stream(array).forEach(x-> System.out.print(x + " "));
        System.out.println();
    }



}
