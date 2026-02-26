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

    void imprimirMatriz(float[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("[%d][%d] -> %.1f\n", i, j, matriz[i][j]);
            }
            System.out.println();
        }
    }

    void imprimirMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("[%d][%d] -> %.1f\n", i, j, matriz[i][j]);
            }
            System.out.println();
        }
    }

    void lerMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = SCAN.nextInt();
            }
        }
    }

    void lerMatriz(float[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = SCAN.nextFloat();
            }
        }
    }

    void lerMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = SCAN.nextDouble();
            }
        }
    }
}
