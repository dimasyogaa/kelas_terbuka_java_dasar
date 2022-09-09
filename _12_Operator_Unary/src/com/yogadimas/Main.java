package com.yogadimas;

public class Main {

    public static void main(String[] args) {

        // Unary : operasi yang dilakukan pada satu variabel
        // Unary +,-,x++,x--,++x,--x,!

        // Unary + dan -
        int angka = 1;
        System.out.printf("unary '+', %d menjadi %d\n", angka, +angka);
        System.out.printf("unary '-', %d menjadi %d\n", angka, -angka);

        // Unary decrement(dikurang 1) dan increment(ditambah 1)
        int angka2 = 10;
        angka2++; //increment
        angka2++;
        System.out.println("nilai dengan '++' menjadi = " + angka2);

        //decrement
        int angka3 = 10;
        angka3--; //increment
        angka3--;
        System.out.println("nilai dengan '--' menjadi = " + angka3);

        //prefix(++x)
        int a = 5;
        //langsung ditambahkan
        System.out.printf("nilai a = %d\n",a);
        System.out.printf("nilai dengan '++a' prefix menjadi = %d\n",++a);
        System.out.printf("nilai dengan 'a' menjadi = %d\n",a);

        //postfix(x++)
        //dipanggil dulu baru ditambahkan
        System.out.printf("nilai dengan 'a++' postfix menjadi = %d\n",a++);
        System.out.printf("nilai dengan 'a' menjadi = %d\n",a);

        // Unary boolean dengan !(bang sign/not) untuk negasi
        boolean ucup = true;
        System.out.println("nilai boolean = " + ucup);
        System.out.println("nilai boolean = " + !ucup);



    }
}
