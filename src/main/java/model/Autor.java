package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Autor extends Participante {
    private List<String> seudonimos;

    public Autor(String nombre, LocalDate fechaNacimiento) {
        super(nombre, fechaNacimiento);
        this.seudonimos = new ArrayList<>();
    }

    public List<String> getSeudonimos() {
        return seudonimos;
    }

    public void addSeudonimo(String seudonimo) {
        seudonimos.add(seudonimo);
    }
}
