package com.yogadimas;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        String input;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Panggil Nama : ");
        input = inputUser.next();
        // ekspresinya berupa satuan (int,long,byte,short, String, atau enum)
        switch (input) {
            case "yoga" :
                System.out.println("saya yoga dan hadir Bos!!!");
                break;
            case "dimas" :
                System.out.println("saya dimas dan hadir Bos!!!");
                break;
            case "pambudi" :
                System.out.println("saya pambudi dan hadir Bos!!!");
                break;
            default:
                System.out.println(input + " tidak hadir Bos!!!");
        }
        System.out.println("selesai program");
    }
}
