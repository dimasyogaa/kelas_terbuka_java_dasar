package com.yoga;

public class Main {

    public static void main(String[] args) {

        // program untuk konversi tipe data

        int nilaiInt = 256; //32-bit
        System.out.println("nilai int = " + nilaiInt);

        // Memperluas rentang ke tipe data yang lebih besar (dikonversi ke tipe data yang memiliki rentang yang lebih besar)
        long nilaiLong = nilaiInt;
        System.out.println("nilai long = " + nilaiLong);

        // Memperkecil rentang ke tipe data yang lebih kecil menggunakan casting operator
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("nilai byte = " + nilaiByte);
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        // mengubah tipe data di luar rentang tipe data target maka akan kacau

        //casting pembagian
        float a = 10;
        int b = 4;
        float c  = a/b;

        // int / int = int
        // float / int = float
        // salah satu bagi float maka hasilnya float
        System.out.printf("%f / %d = %f \n",a,b,c);
        System.out.printf("%d / %f = %f \n",b,a,c);

        int x = 10;
        int y = 4;
        float z = (float)x/y;

        // float / int = float
        // salah satu bagi float maka hasilnya float
        System.out.printf("%d / %d = %f",x,y,z);
    }

}
