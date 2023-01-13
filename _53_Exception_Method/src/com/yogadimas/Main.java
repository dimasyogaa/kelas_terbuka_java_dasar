package com.yogadimas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] arrayData = {0,1,2,3};

        Scanner userInput = new Scanner(System.in);
        System.out.print("data ke-: ");
        int indexInput = userInput.nextInt();

        // Exception biasa
        System.out.println("Exception biasa\n=====================");
        try {
            System.out.printf("data dari array ke-%d adalah %d", indexInput, arrayData[indexInput]);
        } catch (Exception e) {
            System.out.println(e);
        }

        // Exception di dalam fungsi
        System.out.println("\n\nException dalam fungsi\n=====================");
        int data = ambilDataDariArray(arrayData, indexInput);
        System.out.printf("data dari array ke-%d adalah %d", indexInput, data);

        // Exception throws by method
        System.out.println("\n\nException throws by method\n=====================");
        int data2 = 0;
        try {
            data2 = ambilData(arrayData, indexInput);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.printf("data dari array ke-%d adalah %d", indexInput, data2);


        System.out.println("\n\nakhir dari program");

    }


    private static int ambilData(int[] array, int index) throws Exception {
        // method yang melempar exception, sehingga data yang diterima dari method ini harus di dalam block try catch
        int hasil = array[index];
        return hasil;
    }

    private static int ambilDataDariArray(int[] array, int index) {
        int hasil = 0;
        try {
            hasil = array[index];
        } catch (Exception e) {
            System.out.println(e);
        }

        return hasil;
    }


}
