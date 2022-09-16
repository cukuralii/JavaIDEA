package Giris;
import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        // Degiskenleri tanımladık

        float armutkg,elmakg,domateskg,muzkg,patlicankg;
        float armutFiyat = 2.14f ;
        float elma = 3.67f;
        float domates = 1.11f;
        float muz = 0.95f;
        float patlican = 5.00f;



        // Scanner sınıfından yardım alıyoruz

        Scanner Manav = new Scanner(System.in);

        System.out.print("Kaç kilo armut : ");
        armutkg = Manav.nextFloat();
        armutFiyat= armutkg*armutFiyat;

        System.out.print("Kaç kilo Elma : ");
        elmakg = Manav.nextFloat();
        elma = elmakg*elma;

        System.out.print("Kaç kilo Muz : ");
        muzkg = Manav.nextFloat();
        muz = muz*muzkg;

        System.out.print("Kaç kilo Patlıcan : ");
        patlicankg = Manav.nextFloat();
        patlican   = patlican*patlicankg;

        System.out.print("Kaç kilo Domates : ");
        domateskg = Manav.nextFloat();
        domates = domateskg*domates;

        float toplam = domateskg+patlicankg+muzkg+elmakg+armutkg;
        float toplamUcret = domates+patlican+muz+elma+armutFiyat;
        System.out.println("Toplam Kg : " + toplam + " Kg " + "Belinize dikkat :) ");
        System.out.println("Toplam Tutar : " + toplamUcret + " TL " + " Afiyet olsun ");







    }
}
