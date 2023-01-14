package com.yogadimas;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        String pathFile = "E:\\Project\\Courses\\KELASTERBUKA\\JAVADASAR\\IDE\\_58_Buffered_Character_Stream\\";

        // membaca file
        FileReader fileInput = new FileReader(pathFile + "input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);
        bufferedReader.mark(200);
        // membaca ke dalam string
        String data = bufferedReader.readLine();
        System.out.println(data);

        // membaca ke dalam char
        bufferedReader.reset();
        char[] dataChar = new char[25];
        bufferedReader.read(dataChar, 0 , 25);
        System.out.println(Arrays.toString(dataChar));

        bufferedReader.reset();
        System.out.println(bufferedReader.read());
        System.out.println((char) bufferedReader.read());

        // membaca baris
        bufferedReader.reset();
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());

        // menulis file
        FileWriter fileOutput = new FileWriter(pathFile + "output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileOutput);

        bufferedReader.reset();
        String baris1 = bufferedReader.readLine();

        bufferedWriter.write(baris1, 0, baris1.length());
        bufferedWriter.flush();

        // menambah new line, enter :
        bufferedWriter.newLine();

        String baris2 = bufferedReader.readLine();

        bufferedWriter.write(baris2, 0, baris2.length());
        bufferedWriter.flush();

        bufferedWriter.close();
        bufferedReader.close();
        fileInput.close();
        fileOutput.close();



    }

}

// BufferedReader = bisa membaca per baris, per karakter diubah menjadi integer
