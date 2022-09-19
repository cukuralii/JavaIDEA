package Giris.JavaGirisPratikler;
import java.util.Scanner;

public class HesapMakinesiSwitchCase {
    public static void main(String[] args) {
        int s1 , s2 , select ;
        System.out.println("Lütfen islem yapmak için sayıları giriniz : ");
        Scanner sayi = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz  : ");
        s1 = sayi.nextInt();
        System.out.println("İkinci sayıyı giriniz  : ");
        s2 = sayi.nextInt();

if (s1>s2)
{
    System.out.println("1- Toplama \n2- Cıkarma \n3- Carpma \n4- Bolme");
    System.out.println("Seciminiz : ");
    select = sayi.nextInt();

    switch(select)
    {
        case 1 :
            System.out.println("Toplam : " + (s1 + s2));
            break;
        case 2 :
            System.out.println("Cıkarma : " + (s1 - s2));
            break;
        case 3 :
            System.out.println("Carpma : " + (s1 * s2));
            break;
        case 4 :
            if (s1 != 0 && s2 != 0) {
                System.out.println("Bölme : " + (double) (s1 / s2));
                break;
            }
            else {
                System.out.println("Birsayı 0 ' a bölünemez");
            }
        default:
            System.out.println("Yalnıs giden bişiler oldu kontrol et");
    }

}
else
{
    System.out.println("İlk girdiğiniz sayı ikinci sayıdan büyük olmalı");
}
    }
}
