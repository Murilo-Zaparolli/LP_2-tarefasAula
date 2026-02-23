import java.util.Scanner;

public class MetodosGerais {
    final static Scanner SCAN = new Scanner(System.in);

    void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("[%d][%d] -> %d\n", i, j, matriz[i][j]);
            }
            System.out.println();
        }
    }
}
