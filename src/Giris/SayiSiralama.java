package Giris;

import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        System.out.println("Lütfen sayıları giriniz :) ");

        Scanner verilendeger = new Scanner(System.in);
        int sayi ,sayi2 ,sayi3 ;
        System.out.print("Birinci sayi : " );
        sayi = verilendeger.nextInt();
        System.out.print("Ikinci sayi : " );
        sayi2= verilendeger.nextInt();
        System.out.print("Ucuncu sayi : " );
        sayi3= verilendeger.nextInt();

        if (sayi>sayi2 && sayi2>sayi3)
        {
            System.out.println("Sayılarımızın büyükten kücüge sıralanısı : "  + sayi + ">"+sayi2 +">"+sayi3 );
        }
        else if (sayi2>sayi && sayi>sayi3)
        {
            System.out.println("Sayılarımızın büyükten kücüge sıralanısı : "  + sayi2 + ">"+sayi +">"+sayi3 );
        }
        else if (sayi3>=sayi2 && sayi2>sayi)
        {
            System.out.println("Sayılarımızın büyükten kücüge sıralanısı : "  + sayi3 + ">"+sayi2 +">"+sayi );
        }

    }
}
