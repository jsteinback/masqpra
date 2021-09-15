package javaapplication3;

public class TipoSimples implements TipoGrafo {

    public String tipoGrafo(int[][] matriz) {
        for (int x = 0; x < matriz.length; x++) {
            for (int y = x; y < matriz.length; y++) {
                if (x == y) {
                    int value = matriz[x][y];
                    if (value != 0) {
                        return null;
                    }
                }
            }
        }
        return "Simples,";
    }
}
