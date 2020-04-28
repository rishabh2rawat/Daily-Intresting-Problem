import java.util.Scanner;

public class Answer24April2020 {

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string ");
        String str=scan.nextLine();
        scan.close();
        str=str+" ";
        int s=0;
        int e=str.length()-2;
        int counter=0;
        int c1=0;
        while(s!=e)
        {
            if(str.charAt(s)==str.charAt(e))
            {
                if(checkPalindrome(str.substring(s, e+1)))
                {
                    c1=1;
                    break;
                }
            }
            else{
                if(counter ==0)
                {
                    e--;
                    counter=1;
                }
                else
                {
                
                    s++;
                    e++;
                    counter=0;
                }
            }
        }
        if(c1==1)
        {
            System.out.println("The longest palindrome substring is :");
            System.out.println(str.substring(s, e+1));
        }
        {
            System.out.println("No palindome found of more then 1 character");
        }

    

    }

    private static boolean checkPalindrome(String str) {

        int s=0;
        int e=str.length()-1;

        while(s<=e)
        {
            if(str.charAt(s)!=str.charAt(e))
            {
                return false;
                
            }
            else
            {
                s++;
                e--;
            }
            
        }

        return true;
    }

}