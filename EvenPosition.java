package com.bridgelabz;

public class EvenPosition {
    public static void main(String[] args) {
        int[] a={10,30,45,67,89,39,28,1};
        for (int i = 0; i <a.length; i++) {
            if (i%2==0){
                System.out.println(a[i]);
            }
        }

    }
}
