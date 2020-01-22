package Bubble_Sort;

import java.util.Scanner;

public class Bubble_Sort_With_Recursion {

	static void Bubble_Sort(int a[], int n) 
    { 
       
        if (n == 1) 
            return; 
        for (int i=0; i<n-1; i++) {
            if (a[i] > a[i+1]) 
            { 
                
                int temp = a[i]; 
                a[i] = a[i+1]; 
                a[i+1] = temp; 
            } 
        }
    
        Bubble_Sort(a, n-1); 
    } 
	public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
        Bubble_Sort_With_Recursion bs1 = new Bubble_Sort_With_Recursion();
    	System.out.println("Enter the length of the array:-");
    	int n=sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array:-");
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        }
        System.out.println("Array before sorting:-");
        for(int i=0;i<n;i++) {
        	System.out.print(a[i]+" ");
        }
        System.out.println();
        bs1.Bubble_Sort(a,n);
        System.out.println("Sorted array");
        for(int i=0;i<n;i++) {
        	System.out.print(a[i]+" ");
        }
       
    }
}
