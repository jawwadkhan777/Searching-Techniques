package com.project;

public class Main {
    public static void main(String[] args) {
        int [] arr = {2,5,7,8,12,19,25,50}; //initialize array
        int searchElement = 12; //initialize searching value

        //creating object for LinearSearch class
        LinearSearch linearSearch = new LinearSearch();
        linearSearch.search(arr, searchElement); //calling method for linear search

        //creating object for BinarySearch class
//        BinarySearch binarySearch = new BinarySearch();
//        binarySearch.search(arr, searchElement); //calling method for binary search
    }
}