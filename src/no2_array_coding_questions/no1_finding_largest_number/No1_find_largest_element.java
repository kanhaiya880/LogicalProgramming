package no2_array_coding_questions.no1_finding_largest_number;

public class No1_find_largest_element {

    int[] arr = {40, 500, 2, 300, 20, 50};


    public static  void main(String[] args)
    {
        int[] arr = {40,500,2, 300,700, 20, 50};
        int largest=0;

       largest=arr[0];
       for(int i=1;i<arr.length;i++)
       {
           if (largest<arr[i])
           {
               largest=arr[i];
           }
       }

        System.out.println(largest);
    }
}
