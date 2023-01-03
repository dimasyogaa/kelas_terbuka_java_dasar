package com.yogadimas;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*
        Array

        kumpulan data primitif
        teralokasi di heap memory(tersimpan secara dinamis dan fleksibel)
        jika variabel biasa teralokasi di stack memory(tersimpan secara berurutan)

        tipe_data [] nama = { komponen-komponen }
        int[] arrayAngka = {2, 3, 4}\

         */

        // Assignment
        // tipedata[] nama = {komponen-komponen}

        System.out.println("Assignment Array");

        //            index = 0  1  2  3
        //                    |  |  |  |
        int[] arrayInteger = {1, 2, 3, 4};
        // System.out.println(arrayInteger);

        // elemen pada index ke 0 diubah nilainya menjadi 21
        arrayInteger[0] = 21;

        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);

        // Deklarasi
        // tipedata[] nama = new int[jumlahArray];
        // default bernilai 0 tiap elemen jika belum diisi nilainya

        System.out.println("Declaration Array");
        float[] arrayFloat = new float[5];

        arrayFloat[3] = 11.6f;
        arrayFloat[1] = 8; // int - auto casting jadi float oleh java

        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);
        System.out.println(arrayFloat[4]);

        // helper class for array
        // import java.util.Arrays;
        // library untuk mengubah array menjadi string
        System.out.println("Helper Class Array");
        System.out.println(Arrays.toString(arrayInteger));
        System.out.println(Arrays.toString(arrayFloat));



    }

}
