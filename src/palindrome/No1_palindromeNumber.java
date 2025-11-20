package palindrome;

import java.util.Scanner;

public class No1_palindromeNumber {

    public static void main (String args[])
    {
        // int num=1213;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();

        if (isPalindrom(num))
        {
            System.out.println(num+" is palindrome");
        }
        else
        {
            System.out.println(num+" is not palindrome");
        }

        sc.close();
    }

    public static boolean isPalindrom(int num)
    {
        int temp=num;
        int reversed=0;

        while (num>0)
        {
            int rem=num%10;
            num=num/10;
            reversed=reversed*10+rem;

        }
         return temp==reversed;
    }
}
