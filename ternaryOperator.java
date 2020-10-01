package com.company;
import java.sql.SQLOutput;
import java.util.*;
public class ternaryOperator {
    public static void main (String [] args){
        String pilihan,TI,SI;
        Scanner gip = new Scanner(System.in);
        System.out.println(" Pilih TI atau SI");
        pilihan = gip.nextLine();

        pilihan = (pilihan.equals("TI")) ? ("Anda beruntung") : ("Coba Lagi");
        System.out.println(pilihan);

    }
}
