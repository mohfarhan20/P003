package com.company;
import java.util.Scanner;
public class kartuBelanja {
    public static void main (String [] args) {
        int totalBelanja, diskon, harga;
        String jawaban;
        Scanner belanja = new Scanner(System.in);
        System.out.println(" ====== Selamat datang di GipStore ======");
        System.out.print(" Apakah ANDA memiliki kartu member kami ? ");
        jawaban = belanja.nextLine();
        System.out.print(" Masukkan Total Belanjaan Anda = ");
        totalBelanja = belanja.nextInt();

        if (jawaban.equalsIgnoreCase("ya")) {
            if (totalBelanja > 500000) {
                diskon = 50000;
            } else if (totalBelanja > 100000) {
                diskon = 15000;
            } else {
                diskon = 0;
            }
        } else {
           if (totalBelanja > 100000)
               diskon = 10000;
           else
               diskon =0;

        }
        harga = totalBelanja - diskon;
        System.out.println(" Harga  Yang Harus Anda Bayar Adalah " + harga);
    }
    }