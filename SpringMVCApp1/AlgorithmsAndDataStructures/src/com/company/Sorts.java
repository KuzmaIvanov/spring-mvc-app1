package com.company;

public class Sorts {

    private static int indexOfSmallest(int[] array, int startIndex) {
        int index=startIndex;
        int min=array[index];
        for(int i=startIndex;i<array.length;i++) {
            if(array[i]<min) {
                min=array[i];
                index=i;
            }
        }
        return index;
    }
    public static void sortByInsertion(int[] array) {
        int buff;
        for(int i=0;i<array.length;i++) {
            int smallestIndex=indexOfSmallest(array,i);
            buff=array[i];
            array[i]=array[smallestIndex];
            array[smallestIndex]=buff;
        }
    }
    private static int partition(int[]array,int begin, int end) {
        int leftIndex=begin;
        int rightIndex=end;
        int pivot=array[(leftIndex+rightIndex)/2];
        while(leftIndex<=rightIndex) {
            while (array[leftIndex]<pivot)
                leftIndex++;
            while (array[rightIndex]>pivot)
                rightIndex--;
            if(leftIndex<=rightIndex) {
                int buf=array[leftIndex];
                array[leftIndex]=array[rightIndex];
                array[rightIndex]=buf;
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
    public static void quickSort(int[] array, int begin, int end) {
        if(begin<end) {
            int partitionIndex=partition(array,begin,end);
            quickSort(array,begin,partitionIndex-1);
            quickSort(array,partitionIndex,end);
        }
    }
    private static int maxValueInArray(int[] array) {
        int max = array[0];
        for(int i=0;i<array.length;i++) {
            if(array[i]>max)
                max=array[i];
        }
        return max;
    }
    private static int minValueInArray(int[] array) {
        int min = array[0];
        for(int i=0;i<array.length;i++) {
            if(array[i]<min)
                min =array[i];
        }
        return min;
    }
    public static void countSort(int[]array) {
        int maxVal = maxValueInArray(array);
        int minVal = minValueInArray(array);
        int k = maxVal-minVal+1;
        int[] count = new int[k];
        for(int now : array) {
            count[now-minVal]+=1;
        }
        int nowPos=0;
        for (int val = 0; val < count.length; val++)
            for (int i = 0; i < count[val]; i++) {
                array[nowPos] = val + minVal;
                nowPos += 1;
            }
    }
}
