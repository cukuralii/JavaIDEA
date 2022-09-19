package Giris;
import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        // Degiskenlerimizi tanımladık .
        int km , musteriDogumTarihi, musteriYasi , yonTercihi;
        double kmTutar;

        Scanner veri = new Scanner(System.in);
        // Kullanıcıdan verilerimizi alalım ;
        System.out.print("Lütfen gitmek istediğiniz mesafeyi Km cinsinden yaziniz Minimum 750 : ");
        km = veri.nextInt();
        System.out.print("Lütfen dogum tarihinizi Yıl ( 1996,2005 vb. ) cinsinden yaziniz  : ");
        musteriDogumTarihi = veri.nextInt();
        musteriYasi = 2022 - musteriDogumTarihi ;
        System.out.println("Lütfen Yolculuk tipini seciniz \n 1-Tek yön \n 2-Gidis-Donus ");
        yonTercihi=veri.nextInt();
        // kosullarımızı olusturduk .

        if (km>=750 && musteriYasi>0 && (yonTercihi==1 || yonTercihi==2))
        {
            // indirimleri direk uyguladık burda.
            kmTutar = (km*0.1)*yonTercihi;
            if (musteriYasi<=12)
            {
                kmTutar *=0.5;
            }
            if (musteriYasi<24)
            {
                kmTutar *=0.9;
            }
            if (musteriYasi>64)
            {
                kmTutar =0.7;
            }
            if (yonTercihi==2)
            {
                kmTutar *= 0.80;
            }
            System.out.print("Bizi tercih ettiginiz icin tesekkürler :) Toplam Ücret  : "+ kmTutar + "TL" );
        }
        else {
            System.out.print("Lütfen bilgilerinizi kontrol ediniz ");
        }


    }
}
