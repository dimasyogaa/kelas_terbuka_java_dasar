package com.yogadimas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //objek scanner untuk mengambil input
        // membuat objek scanner yang bernama userInput
        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, tinggi, volume;
        //mengambil inputan bertipe integer
//        int input = userInput.nextInt();
//        System.out.println("input = " + input);
//
//        int input2 = userInput.nextInt();
//        System.out.println("input2 = " + input2);
        // Membuat perhitungan menghitung luas persegi panjang
        // luas = panjang * lebar

        System.out.println("MENGHITUNG LUAS");
        System.out.print("panjang = ");
        panjang = userInput.nextInt();

        System.out.print("lebar = ");
        lebar = userInput.nextInt();

        int luas = panjang * lebar;
        System.out.println("Luas = " + luas);

        System.out.println("MENGHITUNG VOLUME");
        System.out.print("tinggi = ");
        tinggi = userInput.nextInt();
        volume = luas * tinggi;
        System.out.println("Volume = " + volume);

    }
}
