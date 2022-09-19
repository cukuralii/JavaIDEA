package Giris.DonguYapilariPratikler;
import java.util.Scanner;

public class TekSayilarinToplami {
    public static void main(String[] args) {
        int sayi ;
        int total = 0 ;

        do {
            Scanner veri = new Scanner(System.in);
            System.out.print("Lütfen deger giriniz : ");
            sayi = veri.nextInt();
            if (sayi%4==0 && sayi%2==0)
            {
                total += sayi;
                System.out.print("Sayı toplamı : " + total + " " );
            }
        }
        while (sayi%2==0);



    }
}
