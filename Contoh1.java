package com.company;
import java.util.Scanner;
public class Contoh1 {

    public static void main(String[] args) {
	// wriTe your code here
        Scanner userInput = new Scanner(System.in);
        int a;
        System.out.println(" Masukkan bilangan : ");
        a = userInput.nextInt();
        if (a> 10){
            System.out.println(" bilangan tersebut lebih dari 10");
        }
        else if (a<=10){
            System.out.println(" Bilangan tersebut kurang dari 10 ");
            if (a % 2 == 0)
                System.out.println(" Bilangan ini genap");
            else {
                System.out.println(" Bilangan ini ganjil ");
            }
        }
    }
}
