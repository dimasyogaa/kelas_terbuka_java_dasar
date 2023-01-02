package com.yogadimas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Fungsi Recursive / Rekursif
        /*
        fungsi (parameter) {
        return fungsi (parameter)
        }
        parameter = 5
        fungsi_print (parameter) {
        print(parameter)
        parameter--
        if (parameter == 0) return;
        return fungsi_print(parameter)
        }
         */

        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = userInput.nextInt();
        System.out.println("Anda memasukkan nilai = " + nilai);

        printNilai(nilai);

        int jumlah = jumlahNilai(nilai);
        System.out.println("jumlah = " + jumlah);

        int faktorial = hitungFaktorial(nilai);
        System.out.println("hasil faktorial = " + faktorial);
    }

    // fungsi rekursif sederhana

    private static int jumlahNilai(int parameter) {
        System.out.println("Parameter Jumlah = " + parameter);
        if (parameter == 0) return parameter;
        return parameter + jumlahNilai(parameter -1);
    }

    private static int hitungFaktorial(int parameter) {
        System.out.println("Parameter Faktorial = " + parameter);
        if (parameter == 1) return parameter;
        return parameter * hitungFaktorial(parameter -1);
    }

    public static void printNilai(int parameter) {
        System.out.println("nilai =  " + parameter);
        if (parameter == 0) return;
        parameter--;
        printNilai(parameter);
    }

}
