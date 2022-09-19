package Giris;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int tarih ;
        Scanner veri = new Scanner(System.in);
        System.out.print("Lütfen bir tarih giriniz : ");
        tarih=veri.nextInt();

        if (tarih%100==0 && (tarih%400 == 0))
        {
            System.out.print("verilen tarih artık yıldır : " + tarih);
        }
        else if (tarih%4==0 ) {
            System.out.print("verilen tarih artık yıldır : " + tarih);
        }
        else{
            System.out.print("verilen tarih artık yıl degildir : " + tarih);
        }

    }
}
