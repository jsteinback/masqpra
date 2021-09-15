package javaapplication3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jéssica Aline Steinback e Leonardo Rafael Conceição
 */
public class TeoriaGrafos {

    private List<TipoGrafo> tipoGrafo = new ArrayList<>();

    protected void init() {
        tipoGrafo.add(new TipoBipartido());
        tipoGrafo.add(new TipoCompleto());
        tipoGrafo.add(new TipoDirigido());
        tipoGrafo.add(new TipoMultigrafo());
        tipoGrafo.add(new TipoNaoDirigido());
        tipoGrafo.add(new TipoNulo());
        tipoGrafo.add(new TipoRegular());
        tipoGrafo.add(new TipoSimples());
    }

    public TeoriaGrafos() {
        init();
    }

    public String tipoDeGrafo(int[][] matrix) {
        StringBuilder stringBuilder = new StringBuilder();
        for (TipoGrafo tipoGrafo : tipoGrafo) {
            String retorno = tipoGrafo.tipoGrafo(matrix);
            if (retorno != null && !retorno.isEmpty()) {
                stringBuilder.append(retorno);
            }
        }
        return stringBuilder.toString();
    }

    public String arestasDoGrafo(int[][] matrix) {
        int count = 0;
        StringBuilder builder = new StringBuilder();
        for (int x = 0; x < matrix.length; x++) {
            for (int y = x; y < matrix.length; y++) {
                int value = matrix[x][y];
                if (value != 0) {
                    count++;
                    builder.append("Aresta: " + x + "->" + y + ";");
                    matrix[y][x] = 0;
                }
            }
        }
        StringBuilder parse = new StringBuilder();
        parse.append("Número de Arestas: " + count + "\n");
        parse.append(builder.toString());
        return parse.toString();
    }

    public String grauDoVertice(int[][] matrix) {
        StringBuilder builder = new StringBuilder();
        for (int x = 0; x < matrix.length; x++) {
            int grau = 0;
            for (int y = 0; y < matrix.length; y++) {
                grau += matrix[x][y];
            }
            builder.append("Vértice:" + x + ",Grau:" + grau + ";");
        }
        return builder.toString();
    }

}
