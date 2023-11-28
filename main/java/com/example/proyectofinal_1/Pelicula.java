package com.example.proyectofinal_1;

import javafx.beans.property.*;

import java.time.LocalDate;

public class Pelicula {
    private StringProperty titulo = new SimpleStringProperty();
    private StringProperty protagonistas = new SimpleStringProperty();
    private StringProperty clasificacionEdad = new SimpleStringProperty();
    private ObjectProperty<LocalDate> fechaLanzamiento = new SimpleObjectProperty<>();
    private ObjectProperty<ListProperty<String>> genero = new SimpleObjectProperty<>();

    public ListProperty<String> getGenero() {
        return genero.get();
    }

    public ObjectProperty<ListProperty<String>> generoProperty() {
        return genero;
    }

    public void setGenero(ListProperty<String> genero) {
        this.genero.set(genero);
    }

    public String getTitulo() {
        return titulo.get();
    }

    public StringProperty tituloProperty() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo.set(titulo);
    }

    public String getProtagonistas() {
        return protagonistas.get();
    }

    public StringProperty protagonistasProperty() {
        return protagonistas;
    }

    public void setProtagonistas(String protagonistas) {
        this.protagonistas.set(protagonistas);
    }

    public String getClasificacionEdad() {
        return clasificacionEdad.get();
    }

    public StringProperty clasificacionEdadProperty() {
        return clasificacionEdad;
    }

    public void setClasificacionEdad(String clasificacionEdad) {
        this.clasificacionEdad.set(clasificacionEdad);
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento.get();
    }

    public ObjectProperty<LocalDate> fechaLanzamientoProperty() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento.set(fechaLanzamiento);
    }
}
