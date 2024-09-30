/* Buatlah Sebuah Program Java yang menerima dapat menerima masukan pengguna, 
terdiri dari nama, nim, alamat. Kemudian menampilkannya di layar. Contoh hasil Perkenalkan Nama saya Ronaldo, dengan nim 1321000, tinggal di 11 Baru, Pondok Biru. */

// 1321046 - Finti Sasa Sabila

import java.util.Scanner;

public class perkenalanJava {
    public static void main(String[] args) {
        String nama, alamat;
        int nim;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama: ");
        nama = input.nextLine();
        
        System.out.print("Masukkan alamat: ");
        alamat = input.nextLine();

        System.out.print("Masukkan NIM: ");
        nim = input.nextInt();
        
        System.out.println("Perkenalkan, nama saya " + nama + ", dengan NIM " + nim + ", tinggal di " + alamat + ".");
    }
}

