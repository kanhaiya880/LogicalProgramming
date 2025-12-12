package no1_string_coding_questions.no4_finding_frequency;

import java.util.*;

public class N2_Character_frequency {
    public static void main(String[] args) {
        String inputString="kanhaiya chaudhari";
        Map<Character,Integer> map= new TreeMap<>();

        for (int i = 0; i < inputString.length(); i++) {
            if (' '!= inputString.charAt(i))
            {
                map.put(inputString.charAt(i), map.getOrDefault(inputString.charAt(i),0)+1);
            }


        }
        System.out.println(map);


        for (Character ch:map.keySet())
        {
            System.out.println(ch+"="+map.get(ch));
        }
    }
}
