package Giris.JavaGirisPratikler;
import  java.util.Scanner;

public class PratikKdvHesaplama {
    public static void main(String[] args) {

        float Fiyat ;
        float KdvliFiyat ;
        float KdvTutari;
        float Kdv = 0.18f;

        Scanner FiyatBilgisi = new Scanner(System.in);
        Fiyat = FiyatBilgisi.nextFloat();
        System.out.print("Kdv oranı : ");
        System.out.print(Kdv);
        KdvTutari = (Fiyat*Kdv);
        KdvliFiyat = ((Fiyat*Kdv)+Fiyat);
        System.out.print("Kdv Tutarı : ");
        System.out.println(KdvTutari);
        System.out.print("Kdv dahil ürün fiyati : ");
        System.out.print(KdvliFiyat);

    }

}
