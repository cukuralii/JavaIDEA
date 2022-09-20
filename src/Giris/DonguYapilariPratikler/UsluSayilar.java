package Giris.DonguYapilariPratikler;

import java.util.Scanner;

public class UsluSayilar {
    public static void main(String[] args) {

        int a , b ;
        int sonuc = 1;
        Scanner veri = new Scanner(System.in);
        System.out.print("Lütfen sayıyı giriniz : ");
        a = veri.nextInt();
        System.out.print("Lütfen üssünü giriniz : ");
        b = veri.nextInt();

        for (int i=1 ; i<=b ; i++)
        {
            sonuc *= a ;
        }
        System.out.print(" Sonuc : " + sonuc );


    }
}
