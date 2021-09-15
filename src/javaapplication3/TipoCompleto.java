package javaapplication3;

public class TipoCompleto implements TipoGrafo {

    public String tipoGrafo(int[][] matriz) {
        TipoGrafo tipoGrafo = new TipoSimples();
        String retorno = tipoGrafo.tipoGrafo(matriz);
        if (retorno == null) {
            return null;
        }
        for (int x = 0; x < matriz.length; x++) {
            for (int y = x; y < matriz.length; y++) {
                if (y != x) {
                    int value = matriz[x][y];
                    if (value == 0) {
                        return null;
                    }
                }
            }
        }
        return "Completo,";
    }

}
