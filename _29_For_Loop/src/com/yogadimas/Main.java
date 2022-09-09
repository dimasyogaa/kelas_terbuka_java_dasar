package com.yogadimas;

public class Main {
    public static void main(String[] args) {

        // for (inisialisasi; kondisi; step_nilai) {
        //     aksi;
        // }

        System.out.println("ini adalah awal program");

        System.out.println("\nloop pertama");

        for (int nilai = 0; nilai <= 10; nilai++) {

            System.out.println("for loop ke-" + nilai);

        }

        System.out.println("\nloop kedua");

        for (int nilai = 0; nilai < 10; nilai++) {

            System.out.println("for loop ke-" + nilai);

        }

        System.out.println("\nloop ketiga");

        for (int nilai = 10; nilai >= 5; nilai--) {

            System.out.println("for loop ke-" + nilai);

        }

        System.out.println("\nloop keempat");
        int nilai = 0;

        for (; nilai < 10; nilai++) {

            System.out.println("for loop ke-" + nilai);

        }

        System.out.println("\nloop kelima");
        int nilai2 = 0;

        for (; nilai2 < 10;) {

            System.out.println("for loop ke-" + nilai2);
            nilai2++;

        }

        System.out.println("ini adalah akhir program");

        // int infinity = 0;
        // System.out.println("\nloop keenam - infinity seperti while loop");
        // for (; true ;) {
        //
        //     System.out.println("for loop ke-" + infinity);
        //
        // }


    }
}
