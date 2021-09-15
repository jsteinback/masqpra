package javaapplication3;

public class MainApp {

    public static void main(String[] args) {
        int[][] values = {{0, 0, 1, 1, 1}, {0, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}};
        TeoriaGrafos grafo = new TeoriaGrafos();
        String resultado = grafo.tipoDeGrafo(values);
        System.out.println("Tipo Grafo:" + resultado);
    }
}
