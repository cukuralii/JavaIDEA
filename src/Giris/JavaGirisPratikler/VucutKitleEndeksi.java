package Giris.JavaGirisPratikler;
import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {

        float boy ;
        float kilo ;
        float KitleIndeks;
        System.out.println("Hosgeldiniz vucüdunuz ne kadar sağlıklı bakalım :) ");
        System.out.println("Lütfen kilonuzu kg cinsinden giriniz  (85 kg) : " );
        System.out.println("Lütfen boyunuzu m cinsinden giriniz  (1,75 m)  : " );

        Scanner hesaplama = new Scanner(System.in);
        kilo = hesaplama.nextFloat();
        boy = hesaplama.nextFloat();
        KitleIndeks = (kilo/(boy*boy));

        System.out.println("Kilonuz : " + kilo+"kg");
        System.out.println("Boyunuz  : " + boy+"m");
        System.out.println("Vucüt Kitle Endeksiniz  : " + KitleIndeks);

        if (KitleIndeks < 18.3)
        {
            System.out.println(" İdeal kilonun altında");
        }
        else if (KitleIndeks > 18.3 || KitleIndeks<24.9)
        {
            System.out.println(" İdeal kiloda");
        }
        else if (KitleIndeks > 25.0 || KitleIndeks<29.9)
        {
            System.out.println(" İdeal kilonun cok üstünde");
        }
        else if (KitleIndeks > 30.0 || KitleIndeks<39.9)
        {
            System.out.println(" Obez ");
        }
        else
        {
            System.out.println(" Morbid Obez");
        }




    }
}
