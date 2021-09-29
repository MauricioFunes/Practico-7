package practico7;

import java.util.*;

public class Materia {

    private int idMateria, anio;

    private String nombre;

    public Materia(int idMateria, int anio, String nombre) {
        this.idMateria = idMateria;
        this.anio = anio;
        this.nombre = nombre;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public int getAnio() {
        return anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
