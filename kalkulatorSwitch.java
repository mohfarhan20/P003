package com.company;
import java.util.*;
public class kalkulatorSwitch {
    public static void main (String [] args){
        Scanner gip;
        float a,b,hasil;
        String operator;

        gip = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama : ");
        a = gip.nextFloat();
        System.out.print("Masukkan bilangan kedua : ");
        b = gip.nextFloat();
        System.out.print("Masukkan operator hitung : ");
        operator = gip.next();
        System.out.println( + a+ " " + operator + " " +  b);
        switch (operator){
            case "+":
                hasil = a+b;
                System.out.println(" Hasilnya adalah = " + hasil);
                break;
            case "-":
                hasil = a-b;
                System.out.println(" Hasilnya adalah = " + hasil);
                break;
            case "*":
                hasil = a*b;
                System.out.println(" Hasilnya adalah = " + hasil);
                break;
            case "/":
                hasil = a/b;
                System.out.println(" Hasilnya adalah = " + hasil);
                break;
            default:
                System.out.println(" Operasi tak dapat dilakukan oleh program ");
        }



    }
}
