package Giris.JavaGirisPratikler;
import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {

        int head ;
        Scanner weather = new Scanner(System.in);
        System.out.print("Lütfen bir sıcaklık giriniz : ");
        head = weather.nextInt();

        if(head<5)
        {
            System.out.println("Hava acayip soguk bu havada seni kayak paklar :; ");
        }
        else if (head>5 && head<15 )
        {
            System.out.println("Kayakda yapabilrsinz aslında");
            System.out.println("Tam film izlemelik bir hava");
        } else if (head<=15 && head<25) {System.out.println("Piknik en iyisiii ");
        } else if (head>25) {System.out.println("hava yanıyo deniz iyidir");}

    }
}
