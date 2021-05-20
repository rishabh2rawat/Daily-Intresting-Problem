package Arrays;

import java.util.Arrays;

public class Sort012 {

    public static void main(String[] args) {
        int [] array=new int[]{1,0,2,1,2,0};
        printArray(array);
        array=sortArray(array);
        printArray(array);

    }

    public static int[] sortArray(int [] array)
    {
        int start=0;
        int end=array.length-1;
        for(int i=0;i<=end;i++)
        {
            if(array[i]==1)
            {
                continue;
            }
            else if(array[i]==0)
            {
                array[i]=array[start];
                array[0]=0;
                start += 1;
            }
            else if(array[i]==2)
            {
                array[i]=array[end];
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
