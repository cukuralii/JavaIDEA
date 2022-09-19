package Giris.JavaGirisPratikler;
import java.util.Scanner;


public class UserLogin {
    public static void main(String[] args) {

        // Degiskenleri tanımladık
        String userName , password , secim;

        // Scanner sınıfından yararlandık kullanıcı adı ve  password verisini almak için
        Scanner veri = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = veri.nextLine();
        System.out.print("Kullanıcı adınızı giriniz : ");
        password = veri.nextLine();



        // Kosulu olusturduk .
        if (userName.equals("Lazzali") && password.equals("ali1234"))
        {
            System.out.println("Hosgeldiniz");
        }
        else{

            // İkinci bir durum oluşturuldu şifre unutulduysa static olusturduk .

            System.out.println("Kullanıcı bilgileri yalnıs, Sıfrenizi yenilemek ister misiniz ? \"yes\" or \"no\" " );
            secim = veri.nextLine();

            // Kullanıcı sifresini yenilemek isterse ;
            if (secim.equals("yes")) {
                String newpassword;
                System.out.println("Yeni sifrenizi giriniz ");
                newpassword = veri.nextLine();
                if (password.equals("ali1234") != newpassword.equals("ali345")) {
                    System.out.println("sifre değiştirildi");
                }
                else{
                    System.out.println("Sifre yenilenemedi eski sifrenizi giriyorsunuz .");
                }

            }
            // kullanıcı sifresini yenilemek istemezse ;
                else if (secim.equals("no"))
                {
                    System.out.println("Bi basaramadın login olmayı");
                }
        }
    }
}
