package com.yogadimas;

import java.io.FileInputStream;
import java.io.IOException;

public class Contoh {

    // lebih simple, karena yang menangani exception adalah jvm(java base)
    // sebaiknya diambil juga dengan try catch
    public static void main(String[] args) throws IOException {

        String pathFile = "E:\\Project\\Courses\\KELASTERBUKA\\JAVADASAR\\IDE\\_53_Exception_Method\\";

        FileInputStream inputFile = new FileInputStream(pathFile + "input.txt");

        System.out.println((char)inputFile.read());

    }

}
