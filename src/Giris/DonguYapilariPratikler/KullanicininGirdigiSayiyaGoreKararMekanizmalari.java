package Giris.DonguYapilariPratikler;
import java.util.Scanner;
public class KullanicininGirdigiSayiyaGoreKararMekanizmalari {
    public static void main(String[] args) {
        int sayi ;
        Scanner veri = new Scanner(System.in);
        System.out.println("Lütfen bir deger giriniz : ");
        sayi = veri.nextInt();
        int deger;
        for (deger=0 ; deger<sayi ; deger++)
        {
            if (deger%3==0 && deger%4==0)
            {
                System.out.print(deger + " , ");
            }
        }
    }
}
