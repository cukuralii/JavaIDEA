package Giris;
import java.util.Scanner;
public class DaireAlaniVeCevresi {
    public static void main(String[] args) {
        double daireAlan;
        double daireCevre;
        double derece ;
        double pi = 3.14 ;
        int yariCap ;
        double daireDilimiAlani;

        Scanner r = new Scanner(System.in);
        System.out.println("Yari cap ve merkez acisinin olcusunu yaziniz");
        yariCap = r.nextInt();
        derece = r.nextDouble();
        daireCevre = (int)(2*pi*yariCap);
        daireAlan = (yariCap*yariCap*pi);
        daireDilimiAlani = (pi*(yariCap*yariCap)*derece)/(360);
        System.out.print("Dairenin Alanı :  " + daireAlan);
        System.out.println("\n Daire Cevresi : " + daireCevre);
        System.out.println("\n Daire dilimi alanı : " + daireDilimiAlani);





    }
}
