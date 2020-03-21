package binary_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Link to problem: https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1148/
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list, and each
 * element in the array contain a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 *
 * Input: [1,2,3] Output: [1,2,4] Explanation: The array represents the integer 123. Example 2:
 *
 * Input: [4,3,2,1] Output: [4,3,2,2] Explanation: The array represents the integer 4321.
 *
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {

        List<Integer> newDigitsList = new ArrayList<>();

        // If the last digit does not equal 9
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }

        // If the last digit equals 9
        if (digits[digits.length - 1] == 9) {
            int firstNonNineIndex = -1;
            for (int index = digits.length - 1; index >= 0; index--) {
                if (digits[index] != 9) {
                    firstNonNineIndex = index;
                    break;
                }
            }
            // If all numbers were nines
            if (firstNonNineIndex == -1) {
                newDigitsList.add(1);
                for (int digit : digits) {
                    newDigitsList.add(0);
                }

                // convert list of Integers back to int array
                return convertListIntToIntArray(newDigitsList);
            }


            // normal scenarios enter here
            for (int index = 0; index <= digits.length - 1; index++) {
                //all numbers will be 0 after the first 9 from left to right
                if (index > firstNonNineIndex) {
                    newDigitsList.add(0);
                } else if (index == firstNonNineIndex) { //increment the number before the first 9 by one
                    newDigitsList.add(digits[index] + 1);
                } else { //add all the non affected numbers back to the list
                    newDigitsList.add(digits[index]);
                }
            }
            return convertListIntToIntArray(newDigitsList);
        }

        return new int[]{-1};
    }

    private static int[] convertListIntToIntArray(List<Integer> newDigitsList) {
        int[] arr = new int[10];
        int count = 0;
        for (Integer x : newDigitsList) {
            int i = x;
            if (arr.length == count) arr = Arrays.copyOf(arr, count * 2);
            arr[count++] = i;
        }
        arr = Arrays.copyOfRange(arr, 0, count);
        return arr;
    }
}
