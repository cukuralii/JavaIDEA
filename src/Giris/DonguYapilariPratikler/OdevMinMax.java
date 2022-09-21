package Giris.DonguYapilariPratikler;

import java.util.Scanner;

public class OdevMinMax {
    public static void main(String[] args) {
          int nsayi , bsayi =1 , ksayi=1 ;
          int sayi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen kaç sayı gireceginizi yazınız : ");
        nsayi = sc.nextInt();

            for (int i = 1; i<=nsayi ; i++)
            {
                System.out.print(i + ". Sayıyı yazını : " );
                sayi = sc.nextInt();

                if (i==1)
                {
                    bsayi = sayi;
                    ksayi = sayi;
                }
                if (bsayi<sayi)
                {
                   bsayi= sayi;
                }
                if (sayi<ksayi)
                {
                    ksayi=sayi;
                }

            }
        System.out.println("En büyük sayı : " + bsayi);
        System.out.println("En kücük sayı : " + ksayi);









    }
}
