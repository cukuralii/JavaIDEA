package Giris.Metotlar;

import java.util.Scanner;

public class RecursiveMethodAsalSayi {

    static void AsalSayi(int deger , int i)
    {
        if (deger==i)
        {
            System.out.print(deger + "" + " Sayısı asaldır");
            return;
        }
        else if(deger%i==0)
        {
            System.out.println(deger + "Sayısı asal degildir");
            return;
        }
        AsalSayi(deger , i+1);
    }
    public static void main(String[] args) {
        int sayi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : " );
        sayi = scanner.nextInt();
        AsalSayi(sayi , 2);
    }
}
