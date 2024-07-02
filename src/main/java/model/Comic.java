package model;



public class Comic extends Texto {
    private int numeroVinetas;

    public Comic(String titulo, Autor autor, String pais, String ciudadOrigen, int copiasImpresas, int numeroVinetas) {
        super(titulo, autor, pais, ciudadOrigen, copiasImpresas);
        this.numeroVinetas = numeroVinetas;
    }

    public int getNumeroVinetas() {
        return numeroVinetas;
    }
}
