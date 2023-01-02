package com.yogadimas;

public class Main {

    public static void main(String[] args) {

        // break, continue, dan return

        // break : keluar dari looping, bawahnya tidak tereksekusi
        int a = 0;

        while (true) {
            // System.out.println("Aksi Awal");
           a++;
            if (a == 10) {
                break;
                // ini adalah keyword untuk memaksa keluar dari loop
            } else if (a == 5) {
                continue;
                // keyword untuk memaksa memulai aksi dari awal
            } else if ( a == 7) {
                return;
                // ditaruh dimanapun (tidak harus di looping, dia akan selesai dari method tempat ia berada, jadi program pada method tersebut akan selesai/berhenti ketika ada keyword return tereksekusi
            }
            System.out.println("looping ke - " + a);
        }
        System.out.println("akhir dari looping");
    }

}
