package Giris.DonguYapilariPratikler;
import java.util.Scanner;

public class ArmstrongSayi {
        public static void main(String[] args) {
            int number,adet = 0,total = 0;
            Scanner input = new Scanner(System.in);
            System.out.print("Bir Sayı Giriniz : ");
            number = input.nextInt();

            while(number != 0)
            {
                total +=  (number%10);
                number /= 10;
                ++adet;
            }
            System.out.println("basamak sayısı : " + adet);
            System.out.println("basamak toplamı : " + total);

        }
    }

