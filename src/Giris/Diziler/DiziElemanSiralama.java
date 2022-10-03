package Giris.Diziler;
import java.util.Arrays;
import java.util.Scanner;

public class DiziElemanSiralama {
    public static void main(String[] args) {
        int diziBoyutu ,deger;

        Scanner sc = new Scanner(System.in);
        System.out.println("Kac adet deger gireceginizi belirleyiniz : ");
        diziBoyutu =sc.nextInt();

        if (diziBoyutu>0)
        {
            int[] dizi = new int[diziBoyutu];
            for (int i = 0; i <diziBoyutu ; i++) {
                System.out.printf("%d. elemani giriniz:",i+1);
                 dizi[i]=sc.nextInt();
            }
            System.out.println("Siralanmamis dizi: "+ Arrays.toString(dizi));

            // büyükmü kücükmü diye kontrol yapılan kısım
            for (int i = 0; i < diziBoyutu; i++) {
                for (int j = 0; j <diziBoyutu ; j++) {
                    if (dizi[i]>dizi[j])
                    {
                        deger=dizi[i];
                        dizi[i]=dizi[j];
                        dizi[j] = deger;
                    }
                }
            }
            System.out.println("Sıralanmıs dizi : " + Arrays.toString(dizi));

        }
        else
        {
            System.out.println("Birseyler yanlıs gitti");
        }

    }
}
