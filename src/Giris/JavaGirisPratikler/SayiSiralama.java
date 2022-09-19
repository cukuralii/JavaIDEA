package Giris.JavaGirisPratikler;

import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        System.out.println("Lütfen sayıları giriniz :) ");

        // VERİLERİMİZİ TANIMLADIK.
        Scanner verilendeger = new Scanner(System.in);
        int sayi ,sayi2 ,sayi3 ;
        System.out.print("Birinci sayi : " );
        sayi = verilendeger.nextInt();
        System.out.print("Ikinci sayi : " );
        sayi2= verilendeger.nextInt();
        System.out.print("Ucuncu sayi : " );
        sayi3= verilendeger.nextInt();

         // KOSULLARIMIZI OLUSTURDUK
        if (sayi>sayi2 && sayi>sayi3)
        {
            if (sayi2>sayi3) {
                System.out.println("Sayılarımızın büyükten kücüge sıralanısı : " + sayi + ">" + sayi2 + ">" + sayi3);
            }
            else {System.out.println("Sayılarımızın büyükten kücüge sıralanısı : " + sayi + ">" + sayi3 + ">" + sayi2);}
        }
        if (sayi2>sayi && sayi2>sayi3)
        {
            if (sayi>sayi3) {
                System.out.println("Sayılarımızın büyükten kücüge sıralanısı : " + sayi2 + ">" + sayi + ">" + sayi3);
            }
            else {System.out.println("Sayılarımızın büyükten kücüge sıralanısı : " + sayi2 + ">" + sayi3 + ">" + sayi);}
        }
        if (sayi3>sayi2 && sayi3>sayi)
        {
            if (sayi>sayi2) {
                System.out.println("Sayılarımızın büyükten kücüge sıralanısı : " + sayi3 + ">" + sayi + ">" + sayi2);
            }
            else {System.out.println("Sayılarımızın büyükten kücüge sıralanısı : " + sayi3 + ">" + sayi2 + ">" + sayi);}
        }

    }
}
