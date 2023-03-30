package com.bridgelabz;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] a={10,30,45,67,89,39,28,1,30,67};
        for (int i = 0; i <a.length; i++) {
            for (int j = i+1; j <a.length; j++) {
                if (a[i]==a[j] && i!=j){
                    System.out.println(a[i]);
                }
            }
        }
    }
}
