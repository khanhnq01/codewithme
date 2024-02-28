package org.example.Java.Arrays;

import java.util.Arrays;

public class UnitOne {
    public static void main(String[] args) {
        int[] nums = {378, 27, 5, 13, 99};
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("Mang sau khi sap xep la: " + Arrays.toString(nums));
    }
}
