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
        if (matriz.length != 6 || matriz[0].length != 6) {
            System.out.println("matriz invalida, recomeçe o codigo para tentar de novo");
            return;
        }

        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i==j) {
                    soma += matriz[i][j];
                }
            }
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

        chave.imprimirMatriz(matriz);
    }

    static void exercicio7_ProdutoMatricial(int[][] matrizA, int[][] matrizB) {
        if (matrizA.length != 4 || matrizA[0].length != 6 && matrizB.length != 6 || matrizB[0].length != 4) {
            System.out.println("matriz(es) invalida(s), recomeçe o codigo para tentar de novo");
            return;
        }

        int[][] matrizC = new int[matrizA.length][matrizB[0].length];

        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[0].length; j++) {
                for (int k = 0; k < matrizB.length; k++) {
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        System.out.printf("Exercicio 7: matriz formada de uma multiplicação de matrizes - resultado :\n");

        chave.imprimirMatriz(matrizC);
    }

    static void exercicio8_MatrizMultiplicadaPorUmValorReal(int[][] matriz, int valor) {
        if (matriz.length != 6 || matriz[0].length != 6) {
            System.out.println("matriz invalida, recomeçe o codigo para tentar de novo");
            return;
        }

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
        if (matriz.length != 10 || matriz[0].length != 10) {
            System.out.println("matriz invalida, recomeçe o codigo para tentar de novo");
            return;
        }

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

        chave.imprimirMatriz(matriz);
    }

    static void exercicio10_SomaDosElementosDasLinhasParesDeUmaMatriz(int[][] matriz) {
        if (matriz.length != 9 || matriz[0].length != 9) {
            System.out.println("matriz invalida, recomeçe o codigo para tentar de novo");
            return;
        }

        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i%2 == 1) {
                    break;
                }

                soma += matriz[i][j];
            }
        }

        System.out.printf("Exercicio 10: soma dos elementos das linhas pares de uma matriz - resultado : %d\n", soma);
    }

    static void exercicio11_MultiplicaçãoDasLinhasDeUmaMatrizPeloDaDiagonalPrincipalDaLinha(int matriz[][]) {
        if (matriz.length != 6 || matriz[0].length != 6) {
            System.out.println("matriz invalida, recomeçe o codigo para tentar de novo");
            return;
        }

        int valorDiagonalL;

        for (int i = 0; i < matriz.length; i++) {
            valorDiagonalL = matriz[i][i];

            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] *= valorDiagonalL;
            }
        }

        System.out.printf("Exercicio 11: multiplicação das linhas de uma matriz pelo valor da diagonal principal da linha - resultado :\n");
        chave.imprimirMatriz(matriz);
    }

    static void exercicio12_MediaAritmeticaDosElementosAbaixoDaDiagonalPrincipalDeUmaMatriz(int[][] matriz) {
        if (matriz.length != 12 || matriz[0].length != 12) {
            System.out.println("matriz invalida, recomeçe o codigo para tentar de novo");
            return;
        }

        double resultado = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (j < i) {
                    resultado += matriz[i][j];
                }
            }
        }

        resultado /= (double) (matriz.length * matriz[0].length);

        System.out.printf("Exercicio 12: média aritmética dos elementos abaixo da diagonal principal de uma matriz - resultado: %.1f\n", resultado);
    }

    static void exercicio13_SomaDosElementosAcimaDaDiagonalPrincipalDeUmaMatriz(int[][] matriz) {
        if (matriz.length != 10 || matriz[0].length != 10) {
            System.out.println("matriz invalida, recomeçe o codigo para tentar de novo");
            return;
        }

        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (j > i) {
                    soma += matriz[i][j];
                }
            }
        }

        System.out.printf("Exercicio 13: soma dos elementos acima da diagonal principal de uma matriz - resultado: %d\n", soma);
    }

    public static void main(String[] args) {
        System.out.println("Olá, para selecionar o exercicio solicitado, digite o numero do exercicio, eles são:\n");
        System.out.println("Exercicio 1: soma dos elementos da matriz;");
        System.out.println("Exercicio 2: soma dos elementos da diagonal principal;");
        System.out.println("Exercicio 3: soma dos elementos da diagonal secundaria;");
        System.out.println("Exercicio 4: soma dos elementos da linha 5 e coluna 3;");
        System.out.println("Exercicio 5: menor elemento da diagonal secundaria;");
        System.out.println("Exercicio 6: matriz formada de elementos divididos pelo maior elemento da diagonal secundaria de outra matriz;");
        System.out.println("Exercicio 7: matriz formada de uma multiplicação de matrizes;");
        System.out.println("Exercicio 8: vetor formado por uma matriz multiplicada por um valor real;");
        System.out.println("Exercicio 9: troca de posições de uma matriz;");
        System.out.println("Exercicio 10: soma dos elementos das linhas pares de uma matriz;");
        System.out.println("Exercicio 11: multiplicação das linhas de uma matriz pelo valor da diagonal principal da linha;");
        System.out.println("Exercicio 12: média aritmética dos elementos abaixo da diagonal principal de uma matriz;");
        System.out.println("Exercicio 13: soma dos elementos acima da diagonal principal de uma matriz;");

        int exercicio;

        do {
            exercicio = chave.SCAN.nextInt();

            if (exercicio < 1 || exercicio > 13) {
                System.out.println("Esse exercicio não existe. Por favor, selecione um dos 13 exercicios mostrados anteriormente.");
                continue;
            }

            break;
        } while (true);

        switch (exercicio) {
            case 1:
                System.out.println("Exercicio 1: soma dos elementos da matriz - requerimentos:");
                System.out.println("Uma matriz com ordem 5x5");
                
                int[][] matrizEX1 = new int[5][5];
                chave.lerMatriz(matrizEX1);

                exercicio1_somaDosElementosDaMatriz(matrizEX1);
                break;
        
            case 2:
                System.out.println("Exercicio 2: soma dos elementos da diagonal principal - requerimentos:");
                System.out.println("Uma matriz com ordem 6x6");

                int[][] matrizEX2 = new int[6][6];
                chave.lerMatriz(matrizEX2);
                break;

            case 3:
        }
    }
}

/*
2 2 2 2 2 2 2 2 2 2 2 2
2 2 2 2 2 2 2 2 2 2 2 5
2 2 2 2 2 2 2 2 2 2 5 5
2 2 2 2 2 2 2 2 2 5 5 5
2 2 2 2 2 2 2 2 5 5 5 5
2 2 2 2 2 2 2 5 5 5 5 5
2 2 2 2 2 2 5 5 5 5 5 5
2 2 2 2 2 5 5 5 5 5 5 5
2 2 2 2 5 5 5 5 5 5 5 5
2 2 2 5 5 5 5 5 5 5 5 5
2 2 5 5 5 5 5 5 5 5 5 5
2 5 5 5 5 5 5 5 5 5 5 5
*/