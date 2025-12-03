
package no100_learning;

import java.util.Scanner;

public class BalancedNumberCheck {

    public static void main(String[] args) {
        int num = 1234006;
        String s = String.valueOf(num);

        // Step 1: Check odd length
        if (s.length() % 2 == 0) {
            System.out.println("Not Balanced");
            return;
        }

        int mid = s.length() / 2;
        int leftSum = 0, rightSum = 0;

        // Step 2: Calculate sums
        for (int i = 0; i < mid; i++) {
            leftSum += s.charAt(i) - '0';
            rightSum += s.charAt(s.length() - 1 - i) - '0';
        }

        // Step 3: Compare
        if (leftSum == rightSum) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
