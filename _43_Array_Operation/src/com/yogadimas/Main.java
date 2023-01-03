package com.yogadimas;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arrayAngka1 = {1, 2, 3, 4, 5};

        // mengubah array menjadi string
        System.out.println("\nMengubah Array menjadi String\n==========================");
        printArray(arrayAngka1);

        // menyalin (copy) array
        System.out.println("\nMengkopi Array\n==========================");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);

        System.out.println("\nCopy dengan Loop");
        for (int i = 0;  i < arrayAngka1.length ; i++) {
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);

        System.out.println("\nCopy dengan copyOf");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, 5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka3);

        // menyalin dari index berapa sampe ke berapa
        // Arrays.copyOfRange(arrayAngka1, mulaiDariIndexBerapa, IndexBatasAkhir);
        // jika IndexBatasAkhir itu 5, maka yang diambil adalah sebelum index ke 5, yaitu index ke 4
        // yang diambil IndexBatasAkhir - 1
        System.out.println("\nCopy dengan copyOfRange");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 2, 5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);

        // fill array
        System.out.println("\nFill Array\n==========================");
        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5, 5);
        printArray(arrayAngka5);

        // komparasi array
        System.out.println("\nKomparasi Array\n==========================");
        int[] arrayAngka6 = {1,2,3,4,5};
        int[] arrayAngka7 = {1,2,3,9,5};

        // equals
        System.out.println("\nMembandingkan Antara Dua Buah Array");
        if (Arrays.equals(arrayAngka6, arrayAngka7)) {
            System.out.println("Array ini sama");
        } else {
            System.out.println("Array ini beda");
        }

        // compare
        // compare(a,b)
        // 1 artinya a > b
        // 0 artinya a == b
        // -1 artinya a < b
        System.out.println("\nCek Array Yang Lebih Besar");
        System.out.println(Arrays.compare(arrayAngka6, arrayAngka7));

        // mismatch
        // mismatch(a,b)
        // -1 artinya tidak ada yang berbeda
        // selain -1, artinya pada index tersebut terjadi perbedaan nilai antara kedua array
        System.out.println("\nCek Index Yang Berbeda");
        System.out.println(Arrays.mismatch(arrayAngka6, arrayAngka7));

        // sort array
        System.out.println("\nSort Array\n==========================");
        int[] arrayAngka8 = {1,6,4,5,3,5,2,6};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);

        // search array
        // binarySearch bisa dilakukan setelah melakukan sorting pada array
        System.out.println("\nSearch Array\n==========================");
        printArray(arrayAngka8);
        int angka = 3;
        int posisi = Arrays.binarySearch(arrayAngka8, angka);
        System.out.println("Angka " + angka + " ada di index " + posisi);



    }

    private static void printArray(int[] dataArray) {
        System.out.println("Array = " + Arrays.toString(dataArray));
    }
}

/*
menyalin
- copyOf
- copyOfRange

mengisi data yang sama semua pada array
- fill

komparasi
- equals == : boolean
- compare >< : integer
- mismatch [x] : integer

Sort

Search
 */

















