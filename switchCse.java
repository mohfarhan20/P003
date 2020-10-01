package com.company;
import java.util.Scanner;
public class switchCse {
    public static void main (String [] args){
        Scanner userInput = new Scanner(System.in);
        String hari;
        System.out.print(" Masukkan Hari Ini .....>");
        hari = userInput.nextLine();
        switch (hari){
            case "senin":
                System.out.println(" Hari Kerja");
                break;
            case "selasa" :
                System.out.println(" Hari Kerja");
                break;
            case "rabu" :
                System.out.println(" Hari Kerja");
                break;
            case "kamis" :
                System.out.println(" Hari Kerja");
                break;
            case "jumat" :
                System.out.println(" Hari Kerja");
                break;
            case "sabtu" :
                System.out.println(" Hari Libur");
                break;
            case "minggu" :
                System.out.println(" Hari Libur");
            default:
                System.out.println(" Input Salah");


        }

    }
}



