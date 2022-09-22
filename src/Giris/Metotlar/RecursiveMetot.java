package Giris.Metotlar;
import java.sql.SQLOutput;
import java.util.Scanner;

public class RecursiveMetot {
         static void UsHesaplama()             // parametre almayan ve geri deger döndürmeyen metotla yaptık .
         {
             int Tsayisi, Ussayisi ,sonuc=1 ;
             Scanner scanner = new Scanner(System.in);
             System.out.print("Taban degeri giriniz : ");
             Tsayisi = scanner.nextInt();
             System.out.print("Üs degeri giriniz : ");
             Ussayisi = scanner.nextInt();
             if (Ussayisi==0)
             {
                 System.out.print("Sonuc : " + sonuc);
             }
             else
             {
                 for (int i = 1 ; i<=Ussayisi ; i++) {
                     sonuc *= Tsayisi;
                 }
                 System.out.print("Sonuc : " + sonuc);
             }
         }


         static int UsHesaplama(int Tsayisi , int usSayisi)
         {  int Sonuc = 1 ;
           if (usSayisi==0)
           {
               System.out.print("Sonuc : " + Sonuc);
           }
           else
           {
               for (int i = 1 ; i<=usSayisi ; i++)
               {
                   Sonuc *= Tsayisi;
               }
               System.out.print("Sonuc : " + Sonuc);
           }
           return Sonuc;
         }

    public static void main(String[] args) {

             UsHesaplama();
             int Tsayisi , usSayisi ;
             Scanner scanner = new Scanner(System.in);
             System.out.println(" Lütfen taban sayısı giriniz : ");
             Tsayisi = scanner.nextInt();
             System.out.println(" Lütfen us sayısı giriniz : ");
             usSayisi= scanner.nextInt();
             UsHesaplama(Tsayisi,usSayisi);
    }
}
