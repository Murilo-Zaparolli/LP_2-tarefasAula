public class AtividadesOda {
    static MetodosGerais chave = new MetodosGerais();

    static void definirMatrizAdição(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = 2*i + (int)Math.pow(j, 2);
            }
        }
    }

    static void definirMatrizParImpar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if ((i+j) % 2 == 0) {
                    matriz[i][j] = -1*(int)Math.pow(i, 2);
                } else {
                    matriz[i][j] = 2*i*j;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        definirMatrizParImpar(matriz);

        chave.imprimirMatriz(matriz);
    }
}
