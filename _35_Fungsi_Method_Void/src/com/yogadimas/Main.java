package com.yogadimas;

public class Main {

    public static void main(String[] args) {

        /* void : hampa
         void : tipe data kosong
         tidak perlu return
        */
        System.out.println(simpel());

        fungsiVoid("apapun");
        selamatPagi("emak");
        selamatPagi("abah");
    }


    private static void selamatPagi(String nama) {
        System.out.println("Selamat pagi " + nama);
    }

    // void : fungsi atau method tanpa kembalian
    // aksi aja yang delegasikan
    private static void fungsiVoid(String input) {
        System.out.println(input);
    }

    // fungsi atau method dengan kembalian
    // sehingga menggunakan return untuk
    // mengembalikan nilainya ( 10.0f)
    private static float simpel() {
        return 10.0f;
    }
}
