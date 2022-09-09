package com.yogadimas;

public class Main {
    public static void main(String[] args) {

        // do {
        //     aksi
        // } while (kondisi);


        System.out.println("ini adalah awal dari program");

        int a = 0;
        boolean kondisi = true;

        do {

            //minimal menjalankan satu kali
            a++;
            System.out.println("do while ke-" + a);
            if (a == 10) {
                kondisi = false;
            }
        } while (kondisi);

        System.out.println("ini adalah akhir program");

    }
}
