package com.yogadimas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String kalimat = "Saya suka makan pisang";

        // Mengambil komponen dari string
        System.out.println(kalimat.charAt(5));

        // Substring
        String kata = kalimat.substring(10,15); // tidak ditaruh di string pool, di heap memory
        System.out.println(kata);

        // Concatenation (concat)
        String kalimat2 = kata + " bakwan"; // membuat string baru
        System.out.println(kalimat2);

        kata = kata + " cireng"; // disimpan di string pool
        System.out.println(kata);

        // concat dengan non string
        int jumlah = 20;
        String kalimat3 = kata + " " + jumlah; // casting (dari int menjadi string)
        System.out.println(kalimat3);
        System.out.println(kata + " " + jumlah);

        // Lowercase dan Uppercase
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());

        // replace
        String kalimat4 = kalimat.replace("pisang", "combro");
        System.out.println(kalimat);
        System.out.println(kalimat4);


        // Compare
        // membandingkan berdasarkan urutan huruf alphabet
        String motor1 = "royal enfield himalayan"; // r
        String motor2 = "kawasaki w175"; // k
        // jarak antara huruf k(motor2) dengan r (motor1)= 7
        System.out.println(motor1.compareTo(motor2)); // k l m n o p q r
        // jarak antara huruf r(motor1) dengan k (motor2)= -7
        System.out.println(motor2.compareTo(motor1));

        // huruf b dan a nya sama, sehingga yang dibandingkan huruf sebelah kanan yang berbeda antara gorengan1 dengan gorengan2
        String gorengan1 = "bakwan"; // k
        String gorengan2 = "bala-bala"; // l
        // jarak antara huruf l(gorengan2) dengan k (gorengan1) = -1
        System.out.println(gorengan1.compareTo(gorengan2));

        // equality ( persamaan )
        // String kataInput = new String("test"); // ini bukan string literal, dan tidak berada di string pool
        String kataInput = "test"; // ini ada di string pool
        String kataTest = "test"; // ini juga ada di di string pool

        System.out.println("\nPersamaan pada lokasi string pool");
        // kataInput == kataTest ----> mengecek addressnya apakah sama atau tidak
        if (kataInput == kataTest) {
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }

        // ketika mengambil input dari user, maka itu bukan string literal,jadi tidak berada di string pool, adanya di heap memory
        Scanner userInput = new Scanner(System.in);
        System.out.print("\nMemanggil input string dari user: ");
        kataInput = userInput.next(); // tidak di string pool
        System.out.println("ini adalah input user: " + kataInput);

        // kataInput.equals(kataTest) ----> mengecek nilai/datanya apakah sama atau tidak,
        // equals : berdasarkan value-nya (nilainya)
        // == : berdasarkan addressnya (alamatnya)
        if (kataInput.equals(kataTest)) {
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }



    }

}
