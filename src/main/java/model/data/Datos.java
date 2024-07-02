package model.data;


import model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Datos {
    private List<Autor> autores;
    private List<Editor> editores;
    private List<Texto> textos;
    private final List<Agencia> agencias;

    public Datos() {
        this.autores = new ArrayList<>();
        this.editores = new ArrayList<>();
        this.textos = new ArrayList<>();
        this.agencias = new ArrayList<>();

    }



 public void postAutores(Autor autor){

    autores.add(autor);}

    public void postEditores(Editor editor){
        editores.add(editor);
    }

    public void postTextos(Texto texto){
        textos.add(texto);
    }

    public void postAgencias(Agencia agencia){
        agencias.add(agencia);
    }

    public void postComic(Comic comic){
        textos.add(comic);
    }





    public List<Editor> getEditores() {
        return editores;
    }

    public void setEditores(List<Editor> editores) {
        this.editores = editores;
    }

    public List<Texto> getTextos() {
        return textos;
    }

    public void setTextos(List<Texto> textos) {
        this.textos = textos;
    }

    public List<Agencia> getAgencias() {
        return agencias;
    }



    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }


    public Texto getTexto(String titulo) {

        for (Texto texto : textos) {
            if (texto.getTitulo().equalsIgnoreCase(titulo)) {
                return texto;
            }
        }
        return null;
    }
}

