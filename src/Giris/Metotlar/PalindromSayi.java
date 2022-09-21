package Giris.Metotlar;
import  java.util.Scanner;
public class PalindromSayi {
    static boolean isPalindrom(int number){
        int temp = number, lastNumber , reverseNumber=0;

        while (temp!=0)
         {
             lastNumber = temp%10 ; // son rakama ulastık
             reverseNumber = reverseNumber*10 + lastNumber; // burda son rakamı almak için dusunup olusturduk .
             temp /= 10;
         }
        if (number==reverseNumber)
        {
            return true ;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        int sayi;
        Scanner sc = new Scanner(System.in); // kullanıcıdan bir sayı aldık daha sonra printte metot yerine onu
        // yerlestirdik.
        System.out.print("Lütfen bir sayı giriniz : ");
        sayi = sc.nextInt();
        System.out.print(isPalindrom(sayi) ? sayi + " sayısı bir polindrom sayısıdır " : sayi + "sayısı polindrom " +
                "sayısı degildir");

    }
}