package Giris;
import java.util.Scanner;


public class HipotenusJava {
    public static void main(String[] args) {

        double kenar1 , kenar2 , kenar3 ;
        double ucgenCevresi;
        double kesit ;
        double ucgenAlan;

         Scanner KenarUzunlugu = new Scanner(System.in);
          kenar1 = KenarUzunlugu.nextDouble();
          kenar2 = KenarUzunlugu.nextDouble();
          kenar3 = KenarUzunlugu.nextDouble();
          kesit = (kenar1+kenar2+kenar3)/2;
          ucgenCevresi = (2*kesit);
          ucgenAlan = Math.sqrt(kesit*(kesit-kenar1)*(kesit-kenar2)*(kesit-kenar3));
        System.out.print( " verilen değerlere gore ucgen alanı  : ");
        System.out.println(ucgenAlan);
        System.out.print( " verilen değerlere gore ucgen cevresi  : ");
        System.out.println(ucgenCevresi);












    }
}
