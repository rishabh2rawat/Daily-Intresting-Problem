package Arrays;

import java.util.Arrays;

public class Sort012 {

    public static void main(String[] args) {
        int [] array=new int[]{1,0,2,1,2,0};
        printArray(array);
        array= sortArray(array);
        printArray(array);

    }

    public static int[] sortArray(int [] array)
    {
        int start=0;
        int end=array.length-1;
        int current =0;
        while(current<end)
        {
            if(array[current]==1)
            {
                current++;
            }
            else if(array[current]==0)
            {
                array[current]=array[start];
                array[0]=0;
                start += 1;
            }
            else if(array[current]==2)
            {
                array[current]=array[end];
                array[end]=2;
                end -= 1;
            }

        }

        return array;
    }

    public static void printArray(int [] array)
    {
        Arrays.stream(array).forEach(x-> System.out.print(x+" "));
        System.out.println();
    }
}
