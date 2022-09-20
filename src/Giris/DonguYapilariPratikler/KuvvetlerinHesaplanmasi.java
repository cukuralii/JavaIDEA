package Giris.DonguYapilariPratikler;

import java.util.Scanner;

public class KuvvetlerinHesaplanmasi {
    public static void main(String[] args) {

        int sayi ;
        Scanner veri = new Scanner(System.in);
        System.out.println("Lütfen bir deger giriniz ");
        sayi = veri.nextInt();

        for (int i=1 ; i<sayi ; i*=4)
        {
            if (i%4==0)
            {
                System.out.println(" Sonuc : " + i + " ");

            }
        }
        for (int k=1 ; k<sayi ; k*=5)
        {
            if (k%5==0)
            {
                System.out.println("Sonuc : " + k + " ");

            }
        }

    }
}
