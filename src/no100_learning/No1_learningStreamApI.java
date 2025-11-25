package no100_learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No1_learningStreamApI {
    public static void main(String[] args) {
        List<Integer> lst1= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> lst2=new ArrayList<>();


//        lst2=lst1.clone();

        System.out.println(lst2);
         lst1.add(1,100);
        System.out.println(lst2);



    }
}
