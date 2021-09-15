package javaapplication3;

public class TipoNaoDirigido implements TipoGrafo {

    public String tipoGrafo(int[][] matriz) {
        for (int x = 0; x < matriz.length; x++) {
            for (int y = x; y < matriz.length; y++) {
                int value = matriz[x][y];
                int inverse = matriz[y][x];
                if (value != inverse) {
                    return null;
                }
            }
        }
        return "Não Dirigido,";
    }
}
