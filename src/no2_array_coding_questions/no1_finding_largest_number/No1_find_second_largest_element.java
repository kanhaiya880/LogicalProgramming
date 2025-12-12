package no2_array_coding_questions.no1_finding_largest_number;

public class No1_find_second_largest_element {
    public static void main(String[] args) {
        int[] arr= {300,10,20,500,60,100,30};
        int largest=arr[0];
        int second=arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if (largest<arr[i])
            {
                largest=arr[i];

            }
            else if(arr[i]!=largest &&  second<arr[i])
            {
                        second=arr[i];
            }


        }

        System.out.println("first largest element:"+largest);
        System.out.println("second largest elment:"+second);
    }
}
