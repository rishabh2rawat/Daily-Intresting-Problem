package Others;

public class HarmonicSeries {
    public static void main(String[] args) {
        System.out.println("Harmonic Series");
        printHarmonicSeries(5 ,5,5);
    }

    public strictfp static void printHarmonicSeries(int noOfElement , int a, int d)
    {
        float currentElement=0;
        float sum=0;
        for(int i =0; i < noOfElement ; i++)
        {

            currentElement = (float) 1/(a+i*d);
            sum += currentElement;
            System.out.println(currentElement + "     1/" + (a+i*d));
        }
        System.out.println("sum : " + sum);
    }
}
