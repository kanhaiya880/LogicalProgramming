package no100_learning;

public class Test {

    public static void main(String[] args) {
        
        int[] a={20,30,40,50,60};
        int[] b = new int[5];
        
        System.arraycopy(a,0,b,0,a.length);
        for (int i = 0; i < 5; i++) {
            System.out.println(b[i]);
        }


    }
}
