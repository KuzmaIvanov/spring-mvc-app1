package com.company;

public class Recursion {
    public static int sumArray(int[] array, int length) {
        if(length==0)
            return 0;
        else
            return array[length-1]+sumArray(array,length-1);
    }
    public static int quantityElementsArray(int[] array, int length) {
        if(length==0)
            return 0;
        else return 1+quantityElementsArray(array,length-1);
    }
    public static int maxElementArray(int[]array, int length, int max) {
        if(length==0)
            return max;
        else {
            if(array[length-1]>max)
                return maxElementArray(array,length-1,array[length-1]);
            else
                return maxElementArray(array,length-1,max);
        }
    }
}
