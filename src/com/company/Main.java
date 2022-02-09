package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,3,5,7,9};
        a = deleteElement(a,3);
        for (int element:a
        ) {
            element = 3;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static int[] deleteElement(int[] arr,int index_del){
        int newArr[]=new int[arr.length-1];
        for (int i = 0; i < index_del; i++) {
            newArr[i]=arr[i];
        }
        for (int i = index_del; i <arr.length-1 ; i++) {
            newArr[i]=arr[i+1];
        }
        return newArr;
    }
}