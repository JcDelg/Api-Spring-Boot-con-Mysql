package com.api.apidb.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
public class Concierto {
    // Getters y Setters
    @Setter
    private Long id;
    private String nombre;
    private LocalDate fecha;
    private LocalTime hora;
    private String lugar;
    private String urlImagen;

    // Constructores
    public Concierto() {
    }


    public Concierto(Long id, String nombre, LocalDate fecha, LocalTime hora, String lugar, String urlImagen) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.urlImagen = urlImagen;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    // Método adicional para manejar fechas como String
    public void setFecha(String fechaStr) {
        this.fecha = LocalDate.parse(fechaStr);
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    // horas en strings
    public void setHora(String horaStr) {
        this.hora = LocalTime.parse(horaStr);
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    // Método toString para representación legible
    @Override
    public String toString() {
        return "Concierto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", lugar='" + lugar + '\'' +
                ", urlImagen='" + urlImagen + '\'' +
                '}';
    }
}