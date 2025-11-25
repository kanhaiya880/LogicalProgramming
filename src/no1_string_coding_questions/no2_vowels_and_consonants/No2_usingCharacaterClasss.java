package no1_string_coding_questions.no2_vowels_and_consonants;

import java.util.Scanner;

public class No2_usingCharacaterClasss {

    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();
        int vowels=0;
        int consonants=0;
        String vowelsSet="aeiou";

        for (char ch:str.toCharArray())
        {
            if (Character.isLetter(ch))
            {
               if (vowelsSet.contains(ch+""))
               {
                   vowels++;
               }
               else
               {
                   consonants++;
               }
            }

        }
        System.out.println("Vowels :"+vowels+"\nConsonants :"+consonants);


    }
}
