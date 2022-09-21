package Giris.DonguYapilariPratikler;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi gir : ");
        int a = inp.nextInt();
        int top=0;
        for (int i=1; i<a; i++){
            if (a%i==0){
                top+=i;
            }
        }
        if (top==a) System.out.println(a+" Mukemmel sayidir.");
        else System.out.println(a+" o kadar da mukemmel bi sayi degil!");
    }
}
