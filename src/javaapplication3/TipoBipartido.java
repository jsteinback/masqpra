package javaapplication3;

public class TipoBipartido implements TipoGrafo {

    protected int[] aux;
    protected int[][] matriz;

    public String tipoGrafo(int[][] matriz) {
        init(matriz);
        TipoGrafo tipoGrafo = new TipoMultigrafo();
        String multigrafo = tipoGrafo.tipoGrafo(matriz);
        if (multigrafo != null) {
            return null;
        }
        this.matriz = matriz;
        boolean bipartido = grafoBipartido();
        if (!bipartido) {
            return null;
        }
        return "Bipartido,";
    }

    protected boolean grafoBipartido() {
        for (int x = 0; x < aux.length; ++x) {
            if (aux[x] == -1) {
                if (!booleanaux(x, 0)) {
                    return false;
                }
            }
        }
        return true;
    }

    protected void init(int[][] matriz) {
        aux = new int[matriz.length];
        for (int x = 0; x < matriz.length; x++) {
            aux[x] = -1;
        }
    }

    protected boolean booleanaux(int v, int c) {
        aux[v] = c;
        for (int p = v; p < aux.length; p++) {
            if (aux[p] == -1) {
                if (!booleanaux(p, 1 - c)) {
                    return false;
                }
            } else if (aux[p] == c) {
                return false;
            }
        }
        return true;
    }

}
