package Bubble_Sort;

import java.util.Scanner;

public class Bubble_Sort_Without_Recursion {

	void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
 
 
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
        Bubble_Sort_Without_Recursion bs = new Bubble_Sort_Without_Recursion();
    	System.out.println("Enter the length of the array:-");
    	int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:-");
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        System.out.println("Array before sorting:-");
        for(int i=0;i<n;i++) {
        	System.out.print(arr[i]+" ");
        }
        System.out.println();
        bs.bubbleSort(arr);
        System.out.println("Sorted array");
        for(int i=0;i<n;i++) {
        	System.out.print(arr[i]+" ");
        }
    }
}



