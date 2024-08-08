package com.project;

public class LinearSearch {

    public void search(int[] arr, int searchElement) {
        System.out.println("Linear Searching technique is applying");
        int stepCount = 0;
        for (int i=0; i<arr.length; i++) {
            stepCount++;
            if(arr[i]==searchElement) {
                System.out.println("Element found at index "+i);
                System.out.println("Number of steps it took: "+ stepCount);
                return;
            }
        }
        System.out.println("Required element is not present on the given array!");
        System.out.println("Number of steps it took: "+ stepCount);
    }
}
