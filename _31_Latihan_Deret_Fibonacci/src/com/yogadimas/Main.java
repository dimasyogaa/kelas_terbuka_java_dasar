package com.yogadimas;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // menghitung nilai deret fibonacci ke-n
        int f_n, f_n_1, f_n_2, n;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("mengambil nilai fibonacci ke - : ");
        n = inputUser.nextInt();

        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println("nilai ke - " + i + " adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
        }

        // int j = 1;
        // while (j <= n) {
        //     System.out.println("nilai ke - " + j + " adalah " + f_n);
        //     f_n = f_n_1 + f_n_2;
        //     f_n_2 = f_n_1;
        //     f_n_1 = f_n;
        //     j++;
        //
        // }

        // do {
        //     System.out.println("nilai ke - " + j + " adalah " + f_n);
        //     f_n = f_n_1 + f_n_2;
        //     f_n_2 = f_n_1;
        //     f_n_1 = f_n;
        //     j++;
        // } while (j <= n);


    }
}

/*
Deret Fibonacci
 0 1 2 3 4 5 6 -> fn
 0 1 1 2 3 5 8 12 21 34

Rumus Fibonacci
fn = fn-1 + fn-2
f4 = f3 + f2
3 = 2 + 1

fn = fn-1 + fn-2
fn-2 = fn-1
fn-1 = fn

contoh :
iterasi pertama
fn-2 = 0
fn-1 = 1
fn = 1

iterasi kedua
fn-2 = 1
fn-1 = 1
fn = 2

iterasi ketiga
fn-2 = 1
fn-1 = 2
fn = 3

pattern / pola bisa diselesaikan dengan looping

 */



