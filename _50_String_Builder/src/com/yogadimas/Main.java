package com.yogadimas;

public class Main {

    // string builder : memudahkan pembuatan sebuah kalimat panjang
    // string builder tidak membuat memory baru ketika terjadi modifikasi pada string
    // secara memory lebih efektif
    // setiap proses pengubahan, penambahan, dan penghapusan itu tidak membuat memory baru
    public static void main(String[] args) {


        StringBuilder builder = new StringBuilder("halo");
        printData(builder);


        // append
        // hampir sama seperti concat, bedanya concat membuat memory baru. Sedangkan append tidak membuat memory baru
        builder.append(" semuanya");
        printData(builder);

        builder.append(" warga Surabaya");
        printData(builder);

        // insert : menyisipkan pada index tertentu
        builder.insert(19, " Kota");
        printData(builder);

        // delete : menghapus pada range index tertentu,
        // delete(19,24) : (menghapus index 19 hingga index (24-1) = 23)
        builder.delete(19,24);
        printData(builder);

        // edit (setCharAt()) : mengubah pada index tertentu
        builder.setCharAt(14, 'W');
        printData(builder);

        // replace : mengubah pada range index tertentu
        // replace(20,28, "Bandung") : (mangganti karakter pada index 20 hingga index (28-1) = 27)
        builder.replace(20,28, "Bandung");
        printData(builder);

        // casting menjadi string
        String kalimat = builder.toString();
        int addressString = System.identityHashCode(kalimat);
        System.out.println("address = " + Integer.toHexString(addressString)); // memori baru
        // setelah menjadi string, baru bisa dilakukan operasi string seperti equality, compare, dan sebagainya


    }

    private static void printData(StringBuilder dataBuilder) {
        System.out.println("data = " + dataBuilder);
        System.out.println("panjang = " + dataBuilder.length());
        // default kapasitas = 16
        // capacity() = akan otomatias selalu lebih besar dari length()
        System.out.println("kapasitas = " + dataBuilder.capacity());

        int addressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("address = " + Integer.toHexString(addressBuilder));
        System.out.print("\n");

    }

}
