package com.bridgelabz;

public class LargestElement {
    public static void main(String[] args) {
        int[] a={10,30,45,67,89,39,28,19};
        int large=a[0];
        for (int i = 1; i <a.length; i++) {
            if (a[i]>large){
                large=a[i];
            }

        }
        System.out.println(large);
    }
}
