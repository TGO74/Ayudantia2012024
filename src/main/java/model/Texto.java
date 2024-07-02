package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Texto {
    private String titulo;
    private Autor autor;
    private String pais;
    private String ciudadOrigen;
    private int copiasImpresas;
    private int ventasRealizadas;
    private List<Edicion> ediciones;

    public Texto(String titulo, Autor autor, String pais, String ciudadOrigen, int copiasImpresas) {
        this.titulo = titulo;
        this.autor = autor;
        this.pais = pais;
        this.ciudadOrigen = ciudadOrigen;
        this.copiasImpresas = copiasImpresas;
        this.ventasRealizadas = 0;
        this.ediciones = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getPais() {
        return pais;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public int getCopiasImpresas() {
        return copiasImpresas;
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public List<Edicion> getEdiciones() {
        return ediciones;
    }

    public void addEdicion(Edicion edicion) {
        ediciones.add(edicion);
    }

    public void venderCopias(int cantidad) {
        ventasRealizadas += cantidad;
    }

    public String getVentas() {

        return "Ventas: " + ventasRealizadas;

    }
}
