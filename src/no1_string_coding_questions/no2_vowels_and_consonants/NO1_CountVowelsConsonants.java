package no1_string_coding_questions.no2_vowels_and_consonants;

import java.util.Scanner;

public class NO1_CountVowelsConsonants {

    public static void main(String[] Args)
    {
        System.out.println("Enter The String:");
        Scanner sc = new Scanner(System.in);
        String str=  sc.nextLine().toLowerCase();

        int vowels =0,consonants=0;

        for (int i = 0; i < str.length(); i++) {
            int ch=str.charAt(i);
            if ( ch>='a'&& ch<='z')     // ch>=97 and ch<=122
            {
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
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
