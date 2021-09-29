package practico7;

import java.util.*;
import javax.swing.JOptionPane;

public class Alumno {

    private int legajo;
    private String nombre, apellido;

    HashSet<Materia> materias = new HashSet<>();
    
    public Alumno(int legajo, String nombre, String apellido) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void agregarMateria(Materia m){
        if(materias.add(m)==false){   
           JOptionPane.showMessageDialog(null, "Materia duplicada");
        }
        else{
            JOptionPane.showMessageDialog(null, "Se inscribio a la materia correctamente");
        }
    }
    
    public int cantidadMaterias(){
        return materias.size();
    }

    @Override
    public String toString() {
        return apellido + ", " + nombre;
    }

}
