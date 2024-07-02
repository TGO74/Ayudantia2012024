package model;

public class Libro extends Texto {
    private int numeroPaginas;

    public Libro(String titulo, Autor autor, String pais, String ciudadOrigen, int copiasImpresas, int numeroPaginas) {
        super(titulo, autor, pais, ciudadOrigen, copiasImpresas);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}
