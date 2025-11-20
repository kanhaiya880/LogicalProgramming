package palindrome;

public class No2_palindromeUsingStringMethod {

    public static void main (String args[])
    {

        String value="1221";
        if (isPalindromeString(value))
        {
            System.out.println("it's palindrome");
        }
        else
        {
            System.out.println("it's not palindrome");
        }
    }

    public static boolean isPalindromeString(String inputString)
    {
     String reversedString=new StringBuilder(inputString).reverse().toString();

     return reversedString.equals(inputString);
    }
}
