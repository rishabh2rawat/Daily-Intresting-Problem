package Arrays;

import java.util.Arrays;

public class UnionIntersectionOfSortedArray {
    int []unionArray;

    public static void main(String[] args) {
        int []array1=new int[]{1,5,9,12,15,16};
        int []array2=new int[]{3,4,15,16,17,18};



        printArray("First Array : " , array1);
        printArray("Second Array : ", array2);

        computeUnionIntersection(array1, array2);



    }

    public static void  computeUnionIntersection(int []array1, int []array2)
    {
        int l1=array1.length;
        int l2=array2.length;
        int start1=0;
        int start2=0;

        int unionCurrent=0;
        int intersactionCounter=0;
        int []unionArray=new int[l1+l2];
        int []intersactionArray =new int[l1>l2 ? l1 : l2 ];

        while(start1<l1 || start2<l2) {
          if ( start1<l1 ) {
              if( start2>= l2 || array1[start1] < array2[start2]) {
                  unionArray[unionCurrent++] = array1[start1];
                  start1++;
              }
            }
          if ( start2 <l2) {
             if( start1>=l1 || array1[start1] > array2[start2])
             {
                 unionArray[unionCurrent++] = array2[start2];
                 start2++;
             }

            }
          if ( start1<l1 && start2<l2) {
             if(array1[start1] == array2[start2])
             {
                 unionArray[unionCurrent++] = array1[start1];
                 intersactionArray[intersactionCounter++] =array1[start1];
                 start1++;
                 start2++;
             }
            }
        }

        printArray("Intersection : ", intersactionArray);
        printArray("Union  : " , unionArray);
    }
    public static void printArray(String msg , int [] array)
    {
        System.out.println(msg+ " ");
        Arrays.stream(array).filter(i-> i>0 ).forEach(x-> System.out.print(x+" "));
        System.out.println();

    }
}
