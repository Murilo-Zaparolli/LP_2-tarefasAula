public class AtividadesRoberta {

    static MetodosGerais chave = new MetodosGerais();
    
    static void exercicio1_somaDosElementosDaMatriz(int[][] matriz) {
        if (matriz.length != 5 || matriz[0].length != 5) {
            System.out.println("matriz invalida, recomeçe o codigo para tentar de novo");
            return;
        }
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                soma += matriz[i][j];
            }
        }

        System.out.printf("Exercicio 1: soma dos elementos da matriz - resultado : %d\n", soma);
    }

    static void exercicio2_somaDosElementosDaDiagonalPrincipal(int[][] matriz) {
        // if (matriz.length != 6 || matriz[0].length != 6) {
        //     System.out.println("matriz invalida, recomeçe o codigo para tentar de novo");
        //     return;
        // }

        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i==j) {
                    soma += matriz[i][j];
                }
            }
        }
        int aux;
        for (int i = 0; i < matriz.length; i++) {
            aux = matriz[i][i];
            matriz[i][i] = matriz[i][matriz.length - 1 - i];
            matriz[i][matriz.length - 1 - i] = aux;
        }

        System.out.printf("Exercicio 2: soma dos elementos da diagonal principal - resultado : %d\n", soma);
    }

    static void exercicio3_somaDosElementosDaDiagonalSecundaria(int[][] matriz) {
        if (matriz.length != 6 || matriz[0].length != 6) {
            System.out.println("matriz invalida, recomeçe o codigo para tentar de novo");
            return;
        }
        
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (j == matriz.length - 1 - i) {
                    soma += matriz[i][j];
                }
            }
        }

        System.out.printf("Exercicio 3: soma dos elementos da diagonal secundaria - resultado : %d\n", soma);
    }

    static void exercicio4_somaDosElementosDaColuna3eLinha4(int[][] matriz) {
        if (matriz.length != 7 || matriz[0].length != 6) {
            System.out.println("matriz invalida, recomeçe o codigo para tentar de novo");
            return;
        }
        
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == 5 || j == 3) {
                    soma += matriz[i][j];
                }
            }
        }

        System.out.printf("Exercicio 4: soma dos elementos da linha 5 e coluna 3 - resultado : %d\n", soma);
    }

    static void exercicio5_MenorValorDasDiagonalSecundaria(int[][] matriz) {
        if (matriz.length != 6 || matriz[0].length != 6) {
            System.out.println("matriz invalida, recomeçe o codigo para tentar de novo");
            return;
        }

        int menorValor = Integer.MAX_VALUE;;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (j == matriz.length - 1 - i) {
                    if (matriz[i][j] < menorValor) {
                        menorValor = matriz[i][j];
                    }
                }
            }
        }

        System.out.printf("Exercicio 5: menor elemento da diagonal secundaria - resultado : %d\n", menorValor);
    }

    static void exercicio6_MatrizFormadaDeElementosDivididosDoMaiorElementoDeOutraMatriz(int[][] matriz) {
        if (matriz.length != 8 || matriz[0].length != 8) {
            System.out.println("matriz invalida, recomeçe o codigo para tentar de novo");
            return;
        }

        int maiorValor = Integer.MIN_VALUE;;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (j == matriz.length - 1 - i) {
                    if (matriz[i][j] > maiorValor) {
                        maiorValor = matriz[i][j];
                    }
                }
            }
        }

        double[][] matrizB = new double[8][8];

        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                matrizB[i][j] = matriz[i][j] / (double) maiorValor;
            }
        }

        System.out.printf("Exercicio 6: matriz formada de elementos divididos pelo maior elemento da diagonal secundaria de outra matriz - resultado :\n");

        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                System.out.printf("[%d][%d] -> [%.1f]\n", i, j, matrizB[i][j]);
            }
        }
    }

    static void exercicio7_ProdutoMatricial(int[][] matrizA, int[][] matrizB) {
        int[][] matrizC = new int[matrizA.length][matrizB[0].length];

        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[0].length; j++) {
                for (int k = 0; k < matrizB.length; k++) {
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        System.out.printf("Exercicio 7: matriz formada de uma multiplicação de matrizes - resultado :\n");

        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC.length; j++) {
                System.out.printf("[%d][%d] -> [%d]\n", i, j, matrizC[i][j]);
            }
        }
    }

    static void exercicio8_MatrizMultiplicadaPorUmValorReal(int[][] matriz, int valor) {
        int[] vetor = new int[matriz.length*matriz[0].length];
        int index = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                vetor[index] = matriz[i][j] * valor;
            }
        }

        System.out.printf("Exercicio 8: vetor formado por uma matriz multiplicada por um valor real - resultado :\n");

        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("[%d] -> [%d]\n", i, vetor);
        }
    }

    static void exercicio9_TrocasEmUmaMatriz(int[][] matriz) {
        int aux;

        for (int i = 0; i < matriz.length; i++) {
            aux = matriz[2][i];
            matriz[2][i] = matriz[8][i];
            matriz[8][i] = aux;
        }

        for (int i = 0; i < matriz.length; i++) {
            aux = matriz[i][4];
            matriz[i][4] = matriz[i][10];
            matriz[i][10] = aux;
        }

        for (int i = 0; i < matriz.length; i++) {
            aux = matriz[i][i];
            matriz[i][i] = matriz[i][matriz.length - 1 - i];
            matriz[i][matriz.length - 1 - i] = aux;
        }

        for (int i = 0; i < matriz.length; i++) {
            aux = matriz[5][i];
            matriz[5][i] = matriz[i][10];
            matriz[i][10] = aux;
        }

        System.out.printf("Exercicio 9: troca de posições de uma matriz - resultado :\n");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("[%d][%d] -> [%d]\n", i, j, matriz[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        chave.lerMatriz(matriz);

        exercicio2_somaDosElementosDaDiagonalPrincipal(matriz);
    }
}

