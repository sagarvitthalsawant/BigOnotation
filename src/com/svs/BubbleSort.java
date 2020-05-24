package com.svs;

/*Bubble sort works by iterating first element to last element,
comparing two adjacent elements and swapping them if they are not in correct order.
Each iteration places next larger value to its correct place.*/

/*Best case:  O(n)
Average case:  O(n^2)
Worst case:  O(n^2)*/

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {100, 20, 15, 30, 5, 75, 40};
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1-i;j++)
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                System.out.print("Iteration "+(i+1)+": ");
                printArray(arr);
        }
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
