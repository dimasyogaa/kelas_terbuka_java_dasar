package com.yogadimas;

public class Main {

    public static void main(String[] args) {

        // Operator Bitwise --> Operator untuk melakukan operasi pada nilai bit
        byte a = 3;
        byte b, c;
        String a_bits, b_bits, c_bits;

        // Operator SHIFT LEFT (geser ke kiri)
        System.out.println("==== SHIFT LEFT (<<) ====");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = (byte)(a << 1);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n\n",b_bits, b);


        // Operator SHIFT RIGHT (geser ke kanan)
        System.out.println("==== SHIFT RIGHT (>>) ====");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = (byte)(a >> 2);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n\n",b_bits, b);

        //Operator bitwise OR
        System.out.println("==== BITWISE OR (|) ====");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);
        System.out.println("-------- OR");
        c = (byte) (a | b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n\n",c_bits, c);

        //Operator bitwise AND
        System.out.println("==== BITWISE AND (&) ====");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);
        System.out.println("-------- AND");
        c = (byte) (a & b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n\n",c_bits, c);

        //Operator bitwise XOR
        System.out.println("==== BITWISE XOR (^) ====");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);
        System.out.println("-------- XOR");
        c = (byte) (a ^ b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n\n",c_bits, c);

        //Operator bitwise Negasi / Not
        System.out.println("==== BITWISE NOT (~) ====");
        a = 24;
        b = ( byte)(~a);
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b_bits = String.format("%8s", Integer.toBinaryString(b).substring(24));
        System.out.printf("%s = %d \n",b_bits, b);

        // mengapa menggunakan class helper dari integer? jawab di bawah
        // karena byte long dan integer ada di posisi nilai satuan dia sharing helper class yang sama yaitu integer...
        // dan toBinaryString itu adalah method untuk merubah data satuan ke bentuk bit-string yang "01011100"
        // Bitwise Digunakan dalam level bit
        // membuat tipe data boolean



    }
}
