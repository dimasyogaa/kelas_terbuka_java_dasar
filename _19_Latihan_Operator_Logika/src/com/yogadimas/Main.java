package com.yogadimas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // membuat objek untuk menangkap input dari user
        Scanner userInput = new Scanner(System.in);

        // sebuah program sederhana untuk menebak sebuah angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("masukan nilai tebakan anda: ");
        nilaiTebakan = userInput.nextInt();
        System.out.println("nilai tebakan anda adalah: " + nilaiTebakan);

        // operasi logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("tebakan anda: " + statusTebakan);

        // operasi aljabar boolean (and/or)
        System.out.print("masukan nilai diantara 4 dan 9: ");
        nilaiTebakan = userInput.nextInt();
        statusTebakan = (nilaiTebakan > 4 ) && (nilaiTebakan < 9);
        System.out.println("tebakan anda: " + statusTebakan);

    }
}
