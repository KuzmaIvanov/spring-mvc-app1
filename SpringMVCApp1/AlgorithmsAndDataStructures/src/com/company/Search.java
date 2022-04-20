package com.company;

import java.util.ArrayDeque;
import java.util.TreeMap;

public class Search {
    public static int binarySearch(int[] array, int item) {
        int mid, guess;
        int low = 0;
        int high = array.length-1;
        while(low<=high) {
            mid=(low+high)/2;
            guess=array[mid];
            if(guess==item)
                return mid;
            if(guess<item)
                low=mid+1;
            if(guess>item)
                high=mid-1;
        }
        return -1;
    }

}
