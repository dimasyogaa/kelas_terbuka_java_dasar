package com.yogadimas;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*
        Memory Heap
         */
        // memori berbeda
        int[] arrayAngka1 = {1, 2, 3, 4, 5};
        int[] arrayAngka2 = new int[5];


        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);

        // memori sama
        // tidak menyalin, arrayAngka2 berpindah alamat yang sama dengan arrayAngka1
        // memberikan referencenya
        arrayAngka2 = arrayAngka1;

        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);

        System.out.println("Array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2 -> " + Arrays.toString(arrayAngka2));


        arrayAngka1[0] = 100;
        arrayAngka1[4] = 400;
        System.out.println("Array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2 -> " + Arrays.toString(arrayAngka2));


        ubahArray(arrayAngka1);
        System.out.println("Array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2 -> " + Arrays.toString(arrayAngka2));
    }

    // aware
    // method yang argumentnya adalah reference, pass by reference
    // bukan pass by value
    // jadi tidak menambah alokasi memori baru
    private static void ubahArray(int[] dataArray) {
        // parameter dataArray akan berpindah alamat yang sama dengan arrayAngka1
        // dataArray dan arrayAngka2 memiliki alamat yang sama dengan arrayAngka1
        dataArray[0] = 125;
    }

}

/*
data primitif
int a = 10
int b = 2
int c = 3
pass by value
int hitung(int x)return x + x;
x = pass by value
membuat alokasi memori baru,
memberikan nilainya

array
pass by reference
void ubahArray(int[] dataArray) { ... }
dataArray = pass by reference
tidak membuat alokasi memori baru
memberikan alamat addressnya, 

 */


