package mundial;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Partido> partidosJugados;

    public Equipo(String nombre){
        this.partidosJugados = new ArrayList<>();
        setNombre(nombre);
    }

    public void addPartido(Partido partido){
        this.partidosJugados.add(partido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Partido> getPartidosJugados() {
        return partidosJugados;
    }
}
