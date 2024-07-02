package model;


public class Poema extends Texto {
    private int versosPorPagina;
    private int totalPaginas;

    public Poema(String titulo, Autor autor, String pais, String ciudadOrigen, int copiasImpresas, int versosPorPagina, int totalPaginas) {
        super(titulo, autor, pais, ciudadOrigen, copiasImpresas);
        this.versosPorPagina = versosPorPagina;
        this.totalPaginas = totalPaginas;
    }

    public int getVersosPorPagina() {
        return versosPorPagina;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }
}
