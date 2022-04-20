package com.company;

public class PrefixSum {
    public static int[] makePrefixSum(int[] nums) {
        System.out.println("Do not about overflow!");
        int[] prefixSum = new int[nums.length+1];
        for(int i=1;i<prefixSum.length;i++) {
            prefixSum[i]=prefixSum[i-1]+nums[i-1];
        }
        return prefixSum;
    }
    public static int rsq(int[]prefix, int L, int R) {
        System.out.println("R not included!");
        return prefix[R]-prefix[L];
    }
}
