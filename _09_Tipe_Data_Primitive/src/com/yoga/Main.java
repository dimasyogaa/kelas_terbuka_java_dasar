package com.yoga;

public class Main {

    public static void main(String[] args) {
        // strings data high level, bukan data primitive karena ukurannya bisa berubah ubah
        // tipe data primitive di java :
        // nilai max dan min fixed/tetap (ukuran tetap)
        // integer, byte, short, long, double, float, char, boolean

        // integer (satuan/bilangan bulat)
        int i = 10;
        System.out.println("=====INTEGER====");
        System.out.println("nilai integer i = " + i);
        System.out.println("nilai max = " + Integer.MAX_VALUE);
        System.out.println("nilai min = " + Integer.MIN_VALUE);
        System.out.println("Besar bytes = " + Integer.BYTES + " bytes");
        System.out.println("Besar size = " + Integer.SIZE + " bit\n");

        // byte (satuan/bilangan bulat)
        byte b = 10;
        System.out.println("=====BYTE====");
        System.out.println("nilai byte b = " + b);
        System.out.println("nilai max = " + Byte.MAX_VALUE);
        System.out.println("nilai min = " + Byte.MIN_VALUE);
        System.out.println("Besar bytes = " + Byte.BYTES + " bytes");
        System.out.println("Besar size = " + Byte.SIZE + " bit\n");

        // short (satuan/bilangan bulat)
        short s = 10;
        System.out.println("=====SHORT====");
        System.out.println("nilai short s = " + s);
        System.out.println("nilai max = " + Short.MAX_VALUE);
        System.out.println("nilai min = " + Short.MIN_VALUE);
        System.out.println("Besar bytes = " + Short.BYTES + " bytes");
        System.out.println("Besar size = " + Short.SIZE + " bit\n");

        // long (satuan/bilangan bulat)
        long l = 10L;
        System.out.println("=====LONG====");
        System.out.println("nilai long l = " + l);
        System.out.println("nilai max = " + Long.MAX_VALUE);
        System.out.println("nilai min = " + Long.MIN_VALUE);
        System.out.println("Besar bytes = " + Long.BYTES + " bytes");
        System.out.println("Besar size = " + Long.SIZE + " bit\n"); // long (satuan/bilangan bulat)

        // double (koma, bilangan real)
        double d = 8.5d;
        System.out.println("=====DOUBLE====");
        System.out.println("nilai double d = " + d);
        System.out.println("nilai max = " + Double.MAX_VALUE);
        System.out.println("nilai min = " + Double.MIN_VALUE);
        System.out.println("Besar bytes = " + Double.BYTES + " bytes");
        System.out.println("Besar size = " + Double.SIZE + " bit\n");

        // float (koma, bilangan real)
        float f = -8.5f;
        System.out.println("=====FLOAT====");
        System.out.println("nilai float f = " + f);
        System.out.println("nilai max = " + Float.MAX_VALUE);
        System.out.println("nilai min = " + Float.MIN_VALUE);
        System.out.println("Besar bytes = " + Float.BYTES + " bytes");
        System.out.println("Besar size = " + Float.SIZE + " bit\n");  // float (koma, bilangan real)

        // char (karakter) berdasarkan ASCI
        char c = 'c';
        System.out.println("=====CHAR====");
        System.out.println("nilai char c = " + c);
        System.out.println("nilai max = " + Character.MAX_VALUE);
        System.out.println("nilai min = " + Character.MIN_VALUE);
        System.out.println("Besar bytes = " + Character.BYTES + " bytes");
        System.out.println("Besar size = " + Character.SIZE + " bit\n");  // float (koma, bilangan real)

        // boolean (nilai true atau false
        boolean val = true;
        System.out.println("=====BOOLEAN====");
        System.out.println("nilai boolean val = " + f);
        System.out.println("nilai true = " + Boolean.TRUE);
        System.out.println("nilai false = " + Boolean.FALSE);
        //size = 1 bit, pada komputer tidak ada 1 bit, minimal 8 bit


    }

}
