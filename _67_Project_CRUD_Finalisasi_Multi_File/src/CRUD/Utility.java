package CRUD;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Year;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Utility {

    static Long ambilEntryPerTahun(String penulis, String tahun) throws IOException {
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        long entry = 0;
        String data = bufferInput.readLine();
        Scanner dataScanner;
        String primaryKey;

        while (data != null) {
            dataScanner = new Scanner(data);
            dataScanner.useDelimiter(",");
            primaryKey = dataScanner.next();
            dataScanner = new Scanner(primaryKey);
            dataScanner.useDelimiter("_");

            penulis.replaceAll("\\s+", "");

            if (penulis.equalsIgnoreCase(dataScanner.next()) && tahun.equalsIgnoreCase(dataScanner.next())) {
                entry = dataScanner.nextInt();

            }
            data = bufferInput.readLine();
        }
        bufferInput.close();
        fileInput.close();


        return entry;
    }

    // default access modifier
    static boolean cekBukuDiDatabase(String[] keywords, boolean isDisplay) throws IOException {

        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        String data = bufferInput.readLine();
        boolean isExist = false; // buku ada = true, buku ga ada = false
        int nomorData = 0;

        if (isDisplay) {
            System.out.println("\n| No |\tTahun |\tPenulis               |\tPenerbit              |\tJudul Buku");
            System.out.println("-----------------------------------------------------------------------------------------------------");
        }

        while (data != null) {

            // cek keywords di dalam baris
            isExist = true;


            for (String keyword : keywords) {
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());

            }


            // jika keywordsnya cocok maka tampilkan

            if (isExist) {

                if (isDisplay) {
                    nomorData++;
                    StringTokenizer stringToken = new StringTokenizer(data, ",");

                    stringToken.nextToken();
                    System.out.printf("| %2d ", nomorData);
                    System.out.printf("|\t%4s  ", stringToken.nextToken());
                    System.out.printf("|\t%-20s  ", stringToken.nextToken());
                    System.out.printf("|\t%-20s  ", stringToken.nextToken());
                    System.out.printf("|\t%s  ", stringToken.nextToken());
                    System.out.print("\n");
                } else {
                    break;
                }

            }

            data = bufferInput.readLine();

        }

        if (isDisplay) {
            System.out.println("-----------------------------------------------------------------------------------------------------");
        }

        bufferInput.close();
        fileInput.close();

        return isExist;

    }

    protected static String ambilTahun() throws IOException {
        boolean tahunValid = false;
        Scanner terminalInput = new Scanner(System.in);
        String tahunInput = terminalInput.nextLine();

        while (!tahunValid) {
            try {
                Year.parse(tahunInput);
                tahunValid = true;
            } catch (Exception e) {
                System.out.println("! Format tahun yang anda masukan salah, format = (YYYY)");
                System.out.print("Silakan masukan tahun terbit lagi : ");
                tahunInput = terminalInput.nextLine();
            }
        }
        return tahunInput;
    }

    public static boolean getYesOrNo(String message) {
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n" + message + " (y/n)? ");
        String pilihanUser = terminalInput.next();

        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
            System.err.println("Pilihan anda bukan y atau n");
            System.out.print("\n" + message + " (y/n)? ");
            pilihanUser = terminalInput.next();
        }

        return pilihanUser.equalsIgnoreCase("y");
    }

    public static void clearScreen() {
        // jalankan out production com.yogadimas.Main menggunakan cmd bawaan windows
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                // masuk ke cmd, /c : command, perintahnya cls
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // selain windows
                System.out.print("\033\143");
            }
        } catch (Exception e) {
            System.err.println("tidak bisa clear screen");
        }
    }
}
