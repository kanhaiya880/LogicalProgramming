package no2_factorial;

public class FactorialUsingRecursion {
    public static int factorial(int n)
    {
        if (n==0||n==1)
        {
            return 1; //base case
        }
      return n*factorial(n-1); // recursion
    }


    public static void main(String[] args) {

        System.out.println(factorial(5));
    }
}
