package no3_number_based_questions;

public class no2_addition_of_even_digit_using_str_function {
    public static void main(String[] args)
    {
        int num=123456;
        String strNum=String.valueOf(num);
        int sum=0;
        char[] charArr=strNum.toCharArray();

        for (char ch : charArr)
        {
//            int digit = ch-'0';
            int digit = Character.getNumericValue(ch);

            if (digit%2==0)
            {
                sum+=digit;
            }

        }
        System.out.println("Sum of even digits: " + sum);
    }
}
