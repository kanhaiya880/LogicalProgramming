package no3_number_based_questions;

import java.util.Scanner;

public class no4_optimized_prime_number {
    public  static  void main(String[] args)
    {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime=true;

        if (num<=1)
        {
            isPrime=false;
        }
        else
        {
            for (int i=2;i<=Math.sqrt(num);i++)
            {
                if (num%i==0)
                {
                    isPrime=false;
                    break;
                }
            }
        }

        if (isPrime)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("not prime number");
        }

    }
}
