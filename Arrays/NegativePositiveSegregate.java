    package Arrays;

    import java.util.Arrays;

    public class NegativePositiveSegregate {

        public static void main(String[] args) {
            int [] array=new int[]{1,2,-3,4,-1,-2,-3,5,6};
            printArray(array);          //printing initial array
            segregateArray(array);      //Segregating array
            printArray(array);          //Printing final array
        }

        private static void segregateArray(int[] array) {
            int start=0;
            int end=array.length-1;
            int current=start;

            while(current<end)
            {
                if(array[current]<0)
                {
                    current++;
                }
                else if(array[current]>=0)
                {
                    int temp=array[current];
                    array[current]=array[end];
                    array[end]=temp;
                    end--;
                }
            }
        }

        private static void printArray(int[] array) {
            Arrays.stream(array).forEach(x-> System.out.print(x+" "));
            System.out.println();
        }
    }
