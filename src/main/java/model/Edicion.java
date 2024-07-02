package model;



import java.util.ArrayList;
import java.util.List;

public class Edicion {
    private int numero;
    private List<Localizacion> localizaciones;

    public Edicion(int numero) {
        this.numero = numero;
        this.localizaciones = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public List<Localizacion> getLocalizaciones() {
        return localizaciones;
    }

    public void addLocalizacion(Localizacion localizacion) {
        localizaciones.add(localizacion);
    }
}
