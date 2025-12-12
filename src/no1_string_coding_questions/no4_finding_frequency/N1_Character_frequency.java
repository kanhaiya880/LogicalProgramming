package no1_string_coding_questions.no4_finding_frequency;

import java.util.HashMap;
import java.util.Map;

public class N1_Character_frequency {
    public static void main(String[] args) {
        String inputString="hellokanhaiya";
        char[] InputArray=inputString.toCharArray();
        Map<Character,Integer> map=new HashMap<>();

        for(char c : InputArray)
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        System.out.println(map);






    }
}
