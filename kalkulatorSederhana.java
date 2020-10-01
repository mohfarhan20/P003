package com.company;
import java.util.*;
public class kalkulatorSederhana {
    public static void main (String [] args){
        Scanner gip = new Scanner(System.in);
        float a,b,hasil;
        char operator;


        System.out.println(" === INI ADALAH PROGRAM KALKULATOR SEDERHANA ===");
        System.out.print(" Masukkan bilangan pertama : ");
        a = gip.nextFloat();

        System.out.print(" Masukkan bilangan kedua : ");
        b = gip.nextFloat();

        System.out.println(" Masukkan Operator Hitung Anda : ");
        operator = gip.next().charAt(0);

        System.out.println(" Input anda adalah " + a+ " "+ operator+ " " + b);

        if (operator == '+'){
            hasil = a+b;
            System.out.println(" Hasil nya adalah = " + hasil);
        }
        else if (operator == '-'){
            hasil = a-b;
            System.out.println(" Hasil nya adalah = " + hasil);
        }
        else if (operator == '*'){
            hasil = a*b;
            System.out.println(" Hasil nya adalah = " + hasil);
        }
        else if (operator == '/'){
            if (b==0){
                System.out.println(" Hasil nya tak terdefinisi");
            }
                else  {
                    hasil = a/b;
            }
        }



    }

}
