package Giris.Diziler;

import java.util.Arrays;

public class diziPratik2 {

    public static void main(String[] args) {
        int[] dizi = {0,69,56,24,25,26,25,29,28,28,32,34,7,37,6,6};
        int tekrar = 0;
        for(int i=0;i<dizi.length;i++)
        {
            if(dizi[i] % 2 == 0){
                for(int k=0;k<dizi.length;k++)
                {
                    if(dizi[i] == dizi[k]) {
                        tekrar = dizi[k];
                        break;
                    }
                }
                System.out.println(tekrar);
            }
        }
    }

}
