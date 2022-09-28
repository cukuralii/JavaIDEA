package Giris.Diziler;
import java.util.Arrays;
import java.util.Scanner;

public class maksMinDizi {
    public static void main(String[] args) {
        int[] n = {1, 56, 798, 4, 6, 7, -65, -5, 75, -3};
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        int girilenDeger = sc.nextInt();
        int minDeger = n[0];
        int maxDeger = n[0];

        Arrays.sort(n);
        for (int i : n)
        {
            if (girilenDeger == i)
            {
                System.out.println("Dizideki sayılardan farklı bir sayı giriniz ");
            }
            if (i<girilenDeger)
            {
                minDeger = i;
            }
            if (i>girilenDeger)
            {
                maxDeger = i;
                break;
            }
        }
        System.out.println("Bir önceki min deger : " + minDeger);
        System.out.println("Bir sonraki max deger : " + maxDeger);

    }
}
