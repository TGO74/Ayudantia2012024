package model;


import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String nombre;
    private String pais;
    private boolean esConglomerado;
    private List<Texto> textosDisponibles;
    private List<Texto> textosSolicitados;

    public Agencia(String nombre, String pais, boolean esConglomerado) {
        this.nombre = nombre;
        this.pais = pais;
        this.esConglomerado = esConglomerado;
        this.textosDisponibles = new ArrayList<>();
        this.textosSolicitados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public boolean isEsConglomerado() {
        return esConglomerado;
    }

    public List<Texto> getTextosDisponibles() {
        return textosDisponibles;
    }

    public List<Texto> getTextosSolicitados() {
        return textosSolicitados;
    }

    public void addTextoDisponible(Texto texto) {
        textosDisponibles.add(texto);
    }

    public void addTextoSolicitado(Texto texto) {
        textosSolicitados.add(texto);
    }
}
