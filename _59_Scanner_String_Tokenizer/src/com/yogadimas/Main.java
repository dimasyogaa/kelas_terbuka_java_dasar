package com.yogadimas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        String pathFile = "E:\\Project\\Courses\\KELASTERBUKA\\JAVADASAR\\IDE\\_59_Scanner_Sting_Tokenizer\\";

        FileReader fileInput =new FileReader(pathFile + "input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);

        Scanner scanner = new Scanner(bufferedReader);

        //  ini untuk cek ada kata selanjutnya atau tidak
        System.out.println(scanner.hasNext()); // true

        // untuk membaca kata, dengan pemisah(delimiter) spasi
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());

        System.out.println(scanner.hasNext()); // false

        System.out.print("\n");

        // menggunakan delimeter tertentu
        FileReader fileInput2 = new FileReader(pathFile + "input2.txt");
        bufferedReader = new BufferedReader(fileInput2);
        bufferedReader.mark(200);

        scanner = new Scanner(bufferedReader);
        scanner.useDelimiter(",");

        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        // menggunakan String tokenizer
        System.out.print("\nString Tokenizer\n============\n");

        bufferedReader.reset();


        String data = bufferedReader.readLine();
        System.out.print("\nbaris 1\n");
        System.out.println(data);
        System.out.print("============\n");

        StringTokenizer stringToken = new StringTokenizer(data, ",");

        while (stringToken.hasMoreTokens()) {
            System.out.println(stringToken.nextToken());
        }

        // baris kedua
        data = bufferedReader.readLine();
        System.out.print("\nbaris 2\n");
        System.out.println(data);
        System.out.print("============\n");

        stringToken = new StringTokenizer(data, ",");

        while (stringToken.hasMoreTokens()) {
            System.out.println(stringToken.nextToken());
        }






    }

}
