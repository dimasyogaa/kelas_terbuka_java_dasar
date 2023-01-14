package com.yogadimas;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        String pathFile = "E:\\Project\\Courses\\KELASTERBUKA\\JAVADASAR\\IDE\\_57_Buffered_Byte_Stream\\";

        long waktuStart, waktuFinish;

        // Membaca dari File
        FileInputStream byteInput = new FileInputStream(pathFile + "input.txt");
        // available : jumlah karakter
        System.out.println(byteInput.available());


        // menghitung waktu pembacaan
        waktuStart = System.nanoTime();
        System.out.println(byteInput.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("waktu = " + (waktuFinish - waktuStart));
        byteInput.close();

        // Membaca dari Memory
        FileInputStream byteInput2 = new FileInputStream(pathFile + "input.txt");
        BufferedInputStream bufferedInput = new BufferedInputStream(byteInput2);

        bufferedInput.mark(200);
        // menghitung waktu pembacaan
        waktuStart = System.nanoTime();
        System.out.println(bufferedInput.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("waktu = " + (waktuFinish - waktuStart));

        // baca ulang
        bufferedInput.reset();
        byte[] data = bufferedInput.readAllBytes();
        String dataString = new String(data);
        System.out.println(dataString);
        bufferedInput.close();
        byteInput2.close();

        // menulis dengan buffered output
        FileOutputStream byteOutput = new FileOutputStream(pathFile + "output.txt");
        BufferedOutputStream bufferedOutput = new BufferedOutputStream(byteOutput);

        // write data berupa byte
        bufferedOutput.write(data, 0, data.length);
        bufferedOutput.flush();

        bufferedOutput.close();
        byteOutput.close();




    }

}
