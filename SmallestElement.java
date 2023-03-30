package com.bridgelabz;

public class SmallestElement {
    public static void main(String[] args) {
        int[] a={10,30,45,67,89,39,28,1};
        int small=a[0];
        for (int i = 0; i <a.length; i++) {
            if (small>a[i]){
                small=a[i];
            }
        }
        System.out.println(small);
    }
}
