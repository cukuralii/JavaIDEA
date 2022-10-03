package Giris.Diziler;

public class DiziTranspozBulma {
    public static void main(String[] args) {
        int[][] matris = {{2, 3, 4}, {5, 6, 4},};
        int[][] transpoz = new int[3][2];

        System.out.println("Matris: ");
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {

                System.out.print(matris[i][j] + " ");


            }
            System.out.println();
        }

        System.out.println("======================");
        System.out.println("Transpoz: ");
        for (int i = 0; i < transpoz.length; i++) {
            for (int j = 0; j < transpoz[i].length; j++) {

                transpoz[i][j] = matris[j][i];
                System.out.print(transpoz[i][j] + " ");


            }
            System.out.println();

        }
    }
}
