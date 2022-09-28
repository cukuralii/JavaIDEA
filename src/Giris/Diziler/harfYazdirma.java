package Giris.Diziler;

public class harfYazdirma {
    public static void main(String[] args) {
        String [][] letter = new String[7][4];

        // birden fazla boyutlu dizilerde ilk satır sonra sütün içerisinde dönüyoruz . Satır sayısı kesinlikle
        // verilmesi gerekiyor.
        for (int i = 0; i < letter.length ; i++) {
            for (int j = 0; j <letter[i].length ; j++) {
                if (i==0 || i==6 || i==3 )
                {
                    letter[i][j]="* ";
                }
                else if (j==0 || j==3)
                {
                    letter[i][j] = "* " ;
                }
                else
                {
                    letter[i][j] = "   ";
                }

            }
        }

        // satır ve sutünların içinde dönüp consola bastırdık .
        for (String[] row : letter )
        {
            for (String col : row)
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
