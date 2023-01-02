package com.yogadimas;

public class Main {
    public static void main(String[] args) {

        /* Matematika
        x = 10
        Fungsi -> y = ( x + 2 ) * x
        persamaan matematika ditulis seperti ini:
        y = f(x)
        f(x) = (x + 2) * x (mendefinisikan fungsi)
        f(10) = (10 + 2) * 10
        = 120
        */

        /* psedocode
        f(x) = ( x + 2 ) * x
        y = f(x)
        y = f(x) = ( x + 2 ) * x
        y = hasil
        x = input
        int hitung ( input ) {
            int hasil = (input + 2) * input
            return hasil
        }
        a b (c d) {
         e = d * d
        return e
        }
        a = tipe nilai kembalian
        b = nama fungsi
        c = tipe parameter
        d = nama parameter yang akan dinputkan nilai argument ketika pemanggilan fungsi
        e = mengembalikan nilai sesuai dengan tipe kembalian
         */

        int y, x;
        x = 5;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);

        x = 20;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);

        x = 40;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);


    }

    private static int hitung(int input) {
        int hasil;
        // hasil = (input + 2) * input;
        hasil = input * input;
        return hasil;
    }
}
