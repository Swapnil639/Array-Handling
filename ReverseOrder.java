package com.bridgelabz;

public class ReverseOrder {
    public static void main(String[] args) {
        int[] a={10,30,45,67,89,39,28,1};
        System.out.print("Reverse order is :");
        for (int i = a.length-1; i >=0 ; i--) {
            System.out.print(a[i]+" ");
        }
    }
}
