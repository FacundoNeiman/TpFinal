package mundial;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Partido> partidosJugados;

    public Equipo(String nombre){
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
