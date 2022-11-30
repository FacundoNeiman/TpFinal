package mundial;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Partido> partidosJugados;
    private int puntaje;

    public Equipo(String nombre){
        this.partidosJugados = new ArrayList<>();
        setNombre(nombre);
        setPuntaje();
    }

    public void addPartido(Partido partido){
        this.partidosJugados.add(partido);
    }

    public void addPuntaje(int puntaje){
        this.puntaje += puntaje;
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

    public int getPuntaje() {
        return puntaje;
    }
    
    private void setPuntaje() {
        this.puntaje = 0;
    }
    
    @Override
    public String toString() {
        return getNombre() + " - " + getPuntaje();
    }
}
