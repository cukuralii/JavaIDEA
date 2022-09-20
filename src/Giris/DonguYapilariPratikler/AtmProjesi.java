package Giris.DonguYapilariPratikler;
import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        String userName , password ;
        Scanner sc = new Scanner(System.in);
        int balance = 1500 ;
        int right = 3 ;
        int select ;
        int addCash ;

        // Kullanıcının sifresinin denenme kısmını yapıyoruz ilk bas login islemi ;

        while(right>0)
        {
            System.out.println("Lütfen kullanıcı adınızı giriniz : ");
            userName = sc.nextLine();
            System.out.println("Lütfen sifrenizi giriniz : ");
            password = sc.nextLine();
            if (userName.equals("Lazzali") && password.equals("ali123"))
            {
                System.out.print("Sisteme Giris yapıldı . Alibank'a Hosgeldiniz ");
                do {
                    System.out.println("Lütfen yapmak istediginiz islemi seciniz " +
                            "\n 1-Bakiye ogrenme "+
                            "\n 2-Para Cekme" +
                            "\n 3-Para yatırma " +
                            "\n 4-Cıkıs " +
                            " ");
                    select = sc.nextInt();
                    switch (select)
                    {
                        case 1 :
                            System.out.println("Bakiyeniz : " + balance + "$" );
                            break;
                        case 2 :
                            System.out.println("Cekmek istediğiniz tutarı yazınız : ");
                            addCash = sc.nextInt();
                            balance -= addCash;
                            System.out.println("Güncel bakiye : " + balance + "$");
                            break;
                        case 3 :
                            System.out.println("Yatırmak istediğiniz tutarı yazını : ");
                            addCash = sc.nextInt();
                            balance +=addCash;
                            System.out.println("Güncel bakiye : " + balance + "$");
                            break;
                    }
                }
                while (select != 4);
                {
                    System.out.println("Sistemden cıkıs yapılmıstır . ");
                }
            }
            else
            {
                System.out.println("Lütfen tekrar deneyiniz  Kalan hakkınız : "  + " " + --right );
            }
        }
        System.out.println("Kartınız bloke olmustur En kısa zamanda bizimle irtibata geciniz");




    }
}
