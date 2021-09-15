package javaapplication3;

import java.util.ArrayList;
import java.util.List;

public class TipoRegular implements TipoGrafo {

    private List<Integer> collections = new ArrayList<>();

    public String tipoGrafo(int[][] matriz) {
        List<Integer> graus = new ArrayList<>();
        collections.clear();
        TipoGrafo grafo = new TipoMultigrafo();
        String aux = grafo.tipoGrafo(matriz);
        if (aux != null) {
            return null;
        }
        for (int x = 0; x < matriz.length; x++) {
            int grau = 0;
            for (int y = x; y < matriz.length; y++) {
                grau += matriz[x][y];
            }
            graus.add(grau);
        }
        collections.addAll(graus);
        for (Integer integer : graus) {
            boolean retorno = equals(integer);
            if (!retorno) {
                return null;
            }
        }
        return "Regular,";
    }

    protected boolean equals(Integer x) {
        for (Integer integer : collections) {
            if (!integer.equals(x) || integer == 0) {
                return false;
            }
        }
        return true;
    }

}
