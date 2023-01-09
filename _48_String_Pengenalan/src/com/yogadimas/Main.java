package com.yogadimas;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // membuat array
        // string lebih efektif dibanding char array, karena ada proses reusable dari memory di string pool
        String kataString = "Hallo";
        char[] kataChar = {'h', 'a', 'l', 'l', 'o'};

        // menampilkan string
        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));

        // mengakses komponen dari string
        System.out.println("komponen pertama dari char[] = " + kataChar[0]);
        System.out.println("komponen pertama dari String = " + kataString.charAt(0));

        // mengubah komponen dari String
        // itu tidak bisa.. kenapa?, karena string di java itu immutable
        // immutable lebih safe pada multithreading
        kataChar[0] = 'c';
        // kataString[0] - "c"; <---------- tidak bisa
        // kataString.CharAt[0] = "c"; <------------- tidak bisa
        System.out.println(Arrays.toString(kataChar));

        // kita bisa mengubah komponen secara tidak langsung
        // subString(index awal, batas akhir)
        // sebetulnya bukan mengubah, tapi membuat address variabel baru
        printAddress("kataString",kataString);
        kataString = "c" + kataString.substring(1,5);
        System.out.println(kataString);
        printAddress("kataString",kataString);

        // memory dari string (String Pool : satu slot memory untuk string)
        // java menyediakan memory sendiri pada string
        // sehingga string reusable
        String str_1 = "Hallo";
        String str_2 = "test";
        String str_3 = "testing";


        printAddress("str_1", str_1);
        printAddress("str_2", str_2);
        printAddress("str_3", str_3);

        // alamatnya berbeda dengan str_2 diatas, meskipun isinya sama dengan str_2 diatas
        // membuat pool sendiri, karena kita mengambil dengan substring sehingga tidak menyimpan di string pool
        str_3 = str_3.substring(0,4);
        printAddress("str_3", str_3);

        String str_4 = "callo";
        printAddress("str_4", str_4);

        kataString = "callo";
        printAddress("kataString", kataString);

        /*
        Kesimpulan
        1. String di java itu immutable
        2. String yang berada di string pool itu akan reusable, memorynya lebih efisien
        3. membuat string dengan method baru, maka dia akan ditaro di memory lain, bukan di string pool
         */

        // liat lebih dalam
        // a akan disimpan di memory heap, bukan string pool
        String a = new String("Hallo");
        printAddress("a", a);

    }

    private static void printAddress(String nama, String data) {
        int address = System.identityHashCode(data);
        System.out.println(nama + " = " + data + "\t|| address = " + Integer.toHexString(address));

    }

}

/*
Memory di java ada 3
1. heap : array
2. stack : tipe data primitive (int, boolean, ...)
3. string pool : string
 */
