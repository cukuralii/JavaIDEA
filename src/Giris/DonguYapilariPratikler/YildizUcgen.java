package Giris.DonguYapilariPratikler;
import java.util.Scanner;

public class YildizUcgen {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);
        System.out.print("Enter any number:     ");
        int a = veri.nextInt();
        for (int i = 1; i <= a; i++) {                    // durumun kaç kere döndürülecegi hesaplanır .
            for (int j = 0; j < (a - i); j++) {          // soldan ne kadar boşluk verileceği düşünülür.
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {      // yıldızları istenilen duruma göre yerleştirme yapılır.
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i=0;i<=a;i++){
            for (int j=a; j>(a-i);j--){
                System.out.print(" ");
            }
            for (int k=1; k<=(2*(a-i)-1);k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }



    }
}
