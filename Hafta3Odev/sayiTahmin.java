package Hafta3Odev;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;

public class sayiTahmin {
    public static void main(String[] args) {
        int max=100;
        int min = 0;
        int sayi;
        int rastgele = (int)(Math.random()*(min+max));
        System.out.println("1 ve 100 arasında sayı girininiz");
        System.out.println(rastgele);
        Scanner girdi = new Scanner(System.in);
        int sayac=1;
        sayi=0;
        while(sayac!=5 && sayi != rastgele){
            sayac++;
            sayi = girdi.nextInt();
            if(sayi==rastgele){
                System.out.println("Tebrikler Doğru Bildiniz sayı."+rastgele);
            }
            else if(sayi>rastgele){
                System.out.println("Girdiğiniz sayı rastgele sayıdan büyük");
            }
            else if(sayi<rastgele){
                System.out.println("Girdiğiniz sayı rastgele sayıdan küçük.");
            }
        }
        if(sayi!=rastgele)
            System.out.println("Bilemediniz sayı."+rastgele);
        }
    }
