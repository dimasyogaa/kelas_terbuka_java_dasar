package com.yogadimas;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3};

        Scanner userInput = new Scanner(System.in);
        System.out.print("nilai array ke : ");
        int index = userInput.nextInt();

        // exception handling (try, catch, finally)
        System.out.println("Handling out of bound\n============================");
        try {
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        // runtime error jika file tidak ada

        // mengambil sebuah file(buka file) input.txt
        FileInputStream fileInput = null;

        System.out.println("\n\nHandling IO not found\n============================");
        try {
            fileInput = new FileInputStream("input.txt");
        } catch (IOException e) {
            // err : biar warna teks berubah menjadi warna merah
            // System.err.println(e);
            System.out.println(e);
        }

        // menggabungkan dua exception
        System.out.println("\n\nMenggabungkan 2 buah Exception\n============================");
        try {
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
            fileInput = new FileInputStream("input.txt");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index yang anda masukan tidak sesuai dengan jumlah array");
        } catch (IOException e) {
            System.out.println("file tidak ditemukan");
        }


        // finally
        System.out.println("\n\nMenambahkan Finally\n============================");
        try {
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index yang anda masukan tidak sesuai dengan jumlah array");
        }finally {
            System.out.println("finally");
        }

        System.out.println("akhir dari program");

    }

}
