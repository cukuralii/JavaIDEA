package Giris;
import java.util.Scanner;

public class NotOrtalamaHesaplama {
    public static void main(String[] args) {

        double mat , fizik, kimya , muzik , turkce ;

        Scanner not = new Scanner(System.in);

        double toplam;

        /* Kullanıcıdan değer almaya calıstıgımız bölüm */

        System.out.println("Gano hesaplama programına hosgeldiniz ");
        System.out.print("Lütfen Matematik notunuzu giriniz : ");
        mat = (double) (not.nextInt()) ;
        System.out.print("Lütfen Fizik notunuzu giriniz : ");
        fizik = (double) (not.nextInt()) ;
        System.out.print("Lütfen Kimya notunuzu giriniz : ");
        kimya = (double) (not.nextInt()) ;
        System.out.print("Lütfen Muzik notunuzu giriniz : ");
        muzik = (double) (not.nextInt()) ;
        System.out.print("Lütfen Turkce notunuzu giriniz : ");
        turkce = (double) (not.nextInt()) ;


        /* Yazılan notun 0 ile 100 arasnında olup olmadıgının kosulunu olusturduk*/

        int i = 0 ;
        double avarage = 0 ;
        if (mat>0 && mat<100)
        {
            i++;
            avarage += mat;
        }
        if (fizik>0 && fizik<100)
        {
            i = i+1;
            avarage += fizik;
        }
        if (kimya>0 && kimya<100)
        {
            i = i+1;
            avarage += kimya;
        }
        if (muzik>0 && muzik<100)
        {
            i = i+1;
            avarage += muzik;
        }
        if (turkce>0 && turkce<100)
        {
            i = i+1;
            avarage += turkce;
        }

        double ortalama = avarage/i;
        System.out.println("Gano ortalamanız : " + ortalama);

        if (ortalama>=55)
        {
            System.out.println("sınıfı geçtiniz");
        }
        else {
            System.out.println("sınıfta kaldınız daha gayretli olunuz ");
        }

    }
}
