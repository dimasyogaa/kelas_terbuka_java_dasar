package com.yogadimas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String pathFile = "E:\\Project\\Courses\\KELASTERBUKA\\JAVADASAR\\IDE\\_55_ByteStream_FileInputOutput\\";

        FileInputStream fileInput = null;
        FileOutputStream fileOutput = null;

        // tambahanFileInputStream(fileInput, pathFile);

        // membuka file
        fileInput = new FileInputStream(pathFile + "input.txt");

        // membaca file
        int data = fileInput.read();
        while (data != -1) {
            System.out.println((char) data);
            data = fileInput.read();
        }

        // menutup file
        fileInput.close();


        // salah satu contoh skenario program pembukaan file
        try {
            // membuka file
            fileInput = new FileInputStream(pathFile + "input2.txt");
            fileOutput = new FileOutputStream(pathFile + "output2.txt");

            // membaca file
            int buffer = fileInput.read();


            while (buffer != -1) {
                // menulis file
                fileOutput.write(buffer);
                buffer = fileInput.read();

            }


        } finally {
            // tidak perlu catch, karena sudah ada throws sehingga ditangkap oleh javanya sendiri
            if (fileInput != null) {
                fileInput.close();
            }
            if (fileOutput != null) {
                fileOutput.close();
            }
        }

        // yang terakhir (try with resources)
        // tidak perlu close pada file input/output stream, sudah otomatis close ketika selesai
        try (
                FileInputStream in = new FileInputStream(pathFile + "input.txt");
                FileOutputStream out = new FileOutputStream(pathFile + "output.txt")
                ) {

            // membaca file
            int data2 = in.read();
            while (data2 != -1) {
                out.write(data2);
                System.out.print((char) data2);
                data2 = in.read();
            }

        }


    }

    private static void tambahanFileInputStream(FileInputStream fileInput, String pathFile) throws IOException {

        System.out.println("file input bernilai = " + fileInput);

        fileInput = new FileInputStream(pathFile + "input.txt");
        System.out.println("file input bernilai = " + fileInput);

        fileInput.close(); // biar lebih safe, biar kosong dulu, menghindari resource dan memory leaked

        System.out.println("file input bernilai = " + fileInput);

        fileInput = new FileInputStream(pathFile + "input2.txt");
        System.out.println("file input bernilai = " + fileInput);

    }

}

/*
bytestream : aliran byte, jadi data yang dikirimkan per karakter, yang mana per karakter memiliki ukuran 1 byte atau 8 bit di dalam memori komputer, sehingga tiap byte dikirikam satu per satu dari inputstream agar tampil ke console ataupun outputstream
*/
