package dasz;

public class Solution {
    public static double solution(int[] arr1, int[] arr2) {
        int[] results = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            results[i] = (int) Math.pow((arr2[i] - arr1[i]), 2);
        }
        double result = 0;
        for (int i = 0; i < arr1.length; i++) {
            result = result + results[i];
        }
        return result / arr1.length;
    }
}