package no1_string_coding_questions.no3_remove_dublicates;

public class N1_remove_dublicates {

    public static void main(String[] args) {
        String str="programming";
        StringBuilder result= new StringBuilder("");
        for (char ch:str.toCharArray())
        {
            /*
            if string is not found in result then indexof function return -1 then
            we are going to add it in result in this way we remove dublicates
             */
            if (result.indexOf(String.valueOf(ch))==-1)
            {

                    result.append(ch);
            }

        }

        System.out.println(str);
        System.out.println(result.toString());
    }
}
