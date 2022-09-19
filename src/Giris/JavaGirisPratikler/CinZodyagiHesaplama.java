package Giris.JavaGirisPratikler;

import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        int dogumYili ;
        int zodyak;
        Scanner veri = new Scanner(System.in);
        System.out.println("Lütfen Dogum Yılınızı Giriniz Ornek : ( 1996 , 2005 )  : ");
        dogumYili = veri.nextInt();
        // Dogum yılının kalanını bulmak için degisken olusturduk .
        zodyak = dogumYili%12;
        if (dogumYili>11)
        {
            switch (zodyak) {
                case 0 -> System.out.println("Cin zodyagına gore Burcunuz : " + "Maymun");
                case 1 -> System.out.println("Cin zodyagına gore Burcunuz : " + "Horoz");
                case 2 -> System.out.println("Cin zodyagına gore Burcunuz : " + "Kopek");
                case 3 -> System.out.println("Cin zodyagına gore Burcunuz : " + "Domuz");
                case 4 -> System.out.println("Cin zodyagına gore Burcunuz : " + "Fare");
                case 5 -> System.out.println("Cin zodyagına gore Burcunuz : " + "Oküz");
                case 6 -> System.out.println("Cin zodyagına gore Burcunuz : " + "Kaplan");
                case 7 -> System.out.println("Cin zodyagına gore Burcunuz : " + "Tavsan");
                case 8 -> System.out.println("Cin zodyagına gore Burcunuz : " + "Ejderha");
                case 9 -> System.out.println("Cin zodyagına gore Burcunuz : " + "Yılan");
                case 10 -> System.out.println("Cin zodyagına gore Burcunuz : " + "At");
                case 11 -> System.out.println("Cin zodyagına gore Burcunuz : " + "Koyun");
                default -> System.out.println("Babacım dogum yılını mı bilmiyosun dogru yaz sunu :( ");
            }
        }
        else {
           System.out.println("Bilgilerin dogru degil :( ");
        }
    }
}
