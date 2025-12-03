package no3_number_based_questions;

public class no1_addtion_of_even_digit {

    public static void main(String[] args) {
        int num=123456;
        int rem=0;
        int evenDigit=0;
        int digitSum=0;

        while (num>0)
        {
            rem=num%10;
            num=num/10;
            if (rem%2==0)
            {
                evenDigit=(evenDigit*10)+rem;
                digitSum+=rem;
            }

        }
        System.out.println("even digits are : "+evenDigit);
        System.out.println("sum of digit :"+digitSum);
    }
}
