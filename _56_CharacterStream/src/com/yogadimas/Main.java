package com.yogadimas;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        String pathFile = "E:\\Project\\Courses\\KELASTERBUKA\\JAVADASAR\\IDE\\_56_CharacterStream\\";

        // Membuka File

        // byte stream => FileInputStream
        // character stream =>  FileReader

        FileInputStream byteFileInput = new FileInputStream(pathFile + "input.txt");
        FileReader      charFileInput = new FileReader(pathFile + "input.txt");

        FileOutputStream byteFileOutput = new FileOutputStream(pathFile + "outputByte.txt");
        FileWriter charFileOutput = new FileWriter(pathFile + "outputChar.txt");

        // Membaca File

        // byte file
        int buffer = byteFileInput.read();
        while (buffer != -1) {
            System.out.print((char) buffer);
           byteFileOutput.write(buffer);
           buffer = byteFileInput.read();
        }

        System.out.println("\n");

        // char file
        buffer = charFileInput.read();

        while (buffer != -1) {
            System.out.print((char) buffer);
            charFileOutput.write(buffer);
            buffer = charFileInput.read();
        }

        // Menutup File

        byteFileInput.close();
        charFileInput.close();
        byteFileOutput.close();
        charFileOutput.close();

        /*
        Kesimpulan
        karakter internasional seperti japan, korea, arab dan sebagainya
        gunakan character stream (reader dan writer)
        tetapi cara char dan byte stream masih kurang efektif, karena data yang dikirimkan satu per satu,
        charstream dan bytestream disebut unbuffered io karena datanya dari input disalin/dikirim satu per satu ke outputnya, semuanya tidak disimpan ke dalam memory terlebih dahulu sehingga kurang efektif
         */

    }

}
