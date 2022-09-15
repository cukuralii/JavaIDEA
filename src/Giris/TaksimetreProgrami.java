package Giris;
import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {

        float kmBasinaUcret = 2.20f;
        float gidilenYol ;
        float minimumTaksimetreUcreti = 20.0f;
        float taksimetreAcilisUcreti= 10.0f;
        float cimriMusteri = minimumTaksimetreUcreti + taksimetreAcilisUcreti ;
        float Ucret;

        Scanner Km = new Scanner(System.in);
        gidilenYol = Km.nextFloat();
        Ucret = (gidilenYol*kmBasinaUcret);

        if (Ucret >= 20.0)
        {
            System.out.print("Taksimetre Ucreti : ");
            System.out.println(Ucret);
        }
        else
        {
            System.out.println("Taksimetre Minimum Ücret ve Taksimetre Acılıs Ücreti : ");
            System.out.println(minimumTaksimetreUcreti);
            System.out.print(taksimetreAcilisUcreti);
            System.out.println("  odenecek toplam ucret : ");
            System.out.print(cimriMusteri);


        }





    }
}
