package Giris.Metotlar;
import java.util.Scanner;

public class MetotCalculator {
    static void Sum()
    {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }
    static void Minus()
    {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result -= number;
        }
        System.out.println("Sonuç : " + result);
    }
    static void Multiply()
    {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void Divide()
    {
        Scanner scan = new Scanner(System.in);
        double number ,result = 0.0;
        int counter = scan.nextInt();
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç : " + result);
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;

        String Menu =
                "\n1 - Toplama islemi \n"
                +"2 - Cıkarma islemi \n"
                +"3 - Bolme islemi \n"
                +"4 - Carpma islemi \n"
                +"5 - Uslu sayı islemi \n"
                +"6 - Dikdortgen Alan ve Cevre islemi \n"
                +"7 - Mod alma islemi \n"
                +"8 - Cıkıs Yap islemi ";

         while (true) {
             {
                 System.out.println(" Lütfen yapmak istediğiniz islemi seciniz : \n ****  *******  ****  " + Menu);
                 System.out.println("********************************************");
                 select = sc.nextInt();

                 if (select == 0) {
                     break;
                 }
                 switch (select) {
                     case 1:
                         Sum();
                         break;
                     case 2:
                         Minus();
                         break;
                     case 3:
                         Divide();
                         break;
                     case 4:
                         Multiply();
                         break;
                     case 5:
                         break;
                     case 6:
                         break;
                     case 7:
                         break;
                     case 8:
                         break;

                     default:
                         System.out.println("Yalnıs bir deger girdiniz. ");

                 }
             }

         }

        System.out.println("Güle güle :)");

    }
}
