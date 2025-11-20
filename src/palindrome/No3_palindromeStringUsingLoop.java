package palindrome;

public class No3_palindromeStringUsingLoop {

    public static void main(String[] args) {
        String inputString="madam";
        String newString="";

        for (int i = inputString.length()-1 ; i >=0; i--) {
            newString+=inputString.charAt(i);
        }

        System.out.println(newString.equals(inputString) ? "String is palindrome" : "String is not palindrome");
    }
}
