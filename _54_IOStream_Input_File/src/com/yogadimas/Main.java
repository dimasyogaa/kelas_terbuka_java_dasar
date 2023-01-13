package com.yogadimas;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String pathFile = "E:\\Project\\Courses\\KELASTERBUKA\\JAVADASAR\\IDE\\_54_IOStream_Input_File\\";
        FileInputStream fileInput = new FileInputStream(pathFile + "input.txt");
        System.out.println((char) fileInput.read());
        System.out.println((char) fileInput.read());
        System.out.println((char) fileInput.read());
        System.out.println((char) fileInput.read());
        System.out.println((char) fileInput.read());

    }

}

/*
menjalankan via artifact jar
java -jar _54_IOStream_Input_File.jar
 */
