package com.yogadimas;

public class Main {

    public static void main(String[] args) {

        // looping bersarang

        // for(int i = 0; i < 5; i ++) {
        //     System.out.printf("loop i ke - %d ",i);
        //     for(int j = 0; j < 5; j ++) {
        //         System.out.print("* ");
        //     }
        //     System.out.print("\n");
        // }

        // segitiga
        // i == j , maka break
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        // segitiga terbalik
        // i + j == 4 , maka break
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if (i + j == 4) {
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        // segitiga gabung
        // i + j == 4 , maka break
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                } else if (i + j == 8) {
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        System.out.print("TUGAS");
        System.out.print("\n");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (j < 4 && (i + j) < 4) {
                    System.out.print("  ");
                    continue;
                } else if (j > 4 && (j - i) > 4) {
                    break;
                } else if (i > 4 && (i - j) > 4) {
                    System.out.print("  ");
                    continue;
                } else if (i > 4 && (i + j > 12)) {
                    break;
                }
                System.out.print("* ");


            }
            System.out.print("\n");
        }


        System.out.print("\n");
        System.out.print("TUGAS REF");
        System.out.print("\n");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if ((i + j) > 12) {
                    break;
                } else if ((j >= 4) && (j - i) > 4) {
                    break;
                } else if ((j <= 4) && (i + j) < 4) {
                    System.out.print("  ");
                    continue;
                } else if ((i >= 4) && (i - j) > 4) {
                    System.out.print("  ");
                    continue;
                }
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
}
