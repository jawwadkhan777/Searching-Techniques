package com.project;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {
    public void search(int[] arr, int searchElement) {
        System.out.println("Binary Searching technique is applying");
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        int stepCount = 0;

        while (start<=end) {
            stepCount++;
            int mid = (start+end)/2;
            if (arr[mid]==searchElement) {
                System.out.println("Element found at index "+mid);
                System.out.println("Number of steps it took: "+ stepCount);
                return;
            } else if (arr[mid]>searchElement) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        System.out.println("Required element is not present on the given array!");
        System.out.println("Number of steps it took: "+ stepCount);
    }
}
