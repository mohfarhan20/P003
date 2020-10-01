package com.company;
import java.util.Scanner;
public class jualanPulsa {
    public static void main (String [] args){
        int nominal,harga;
        harga = 0;
        String kartu;
        Scanner gipCell = new Scanner(System.in);

        System.out.println(" === Selamat Datang di Gip Cell ");
        System.out.println(" Silahkan masukkan operator kartu Anda ");
        kartu = gipCell.nextLine();
        System.out.println(" Silahkan masukkan nominal pulsa ");
        nominal = gipCell.nextInt();

        if (kartu.equalsIgnoreCase("Telkomsel")|| kartu.equalsIgnoreCase("Xl")) {
            if (nominal == 5000)
                harga = 7000;
            else if (nominal == 10000)
                harga = 12000;
            else if (nominal == 50000)
                harga = 50000;
            else if (nominal == 100000)
                harga = 100000;
        }
        else {
            if (nominal == 5000)
                harga = 7500;
            else if (nominal == 10000)
                harga = 13000;
            else if (nominal == 50000)
                harga = 52000;
            else if (nominal== 100000)
                harga = 101000;
        }
        System.out.println(" Harga yang harus Anda Bayar Adalah = " + harga);




    }
}
