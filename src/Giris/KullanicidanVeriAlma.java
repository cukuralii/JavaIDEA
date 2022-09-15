package Giris;
import  java.util.Scanner;


public class KullanicidanVeriAlma {
    public static void main(String[] args) {

        /**
         * İlk adım olarak nereden baslıycagını söyledik main metotdu kullanılarak
         * scanner kullanıcagımız için veri alıcaz import kullanıp scanner sınıfımıızı projemize dahil ettik
         * Daha sonra scanner sınıfından bir nesne örneği aldık nextInt() int kullandıgımız için böyle.
         *
         * */

       int mat, fizik , edebiyat , tarih , cografya ;
       Scanner Not = new Scanner(System.in);
        System.out.println("matemetik sınavınız");
         mat = Not.nextInt() ;
        System.out.println("fizik sınavınız");
        fizik = Not.nextInt() ;
        System.out.println("edebiyat sınavınız");
        edebiyat  = Not.nextInt() ;
        System.out.println("tarih sınavınız");
        tarih = Not.nextInt() ;
        System.out.println("cografya sınavınız : ");
        cografya = Not.nextInt() ;

         int toplam = (mat+fizik+edebiyat+tarih+cografya)/(5);
        System.out.println(toplam);


    }

}
