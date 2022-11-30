package mundial;

import java.util.ArrayList;

public abstract class EtapaMundial {
    private String descripcionEtapa;
    private ArrayList<Partido> partidos;
    private ArrayList<Equipo> equipos;

    public EtapaMundial(){
        this.partidos = new ArrayList<>();
        this.equipos = new ArrayList<>();
    }

    public EtapaMundial(String descripcionEtapa){
        setDescripcionEtapa(descripcionEtapa);
        this.partidos = new ArrayList<>();
    }

    public abstract void addPartido(Partido partido);

    protected ArrayList<Partido> getPartidos(){
        return this.partidos;
    }

    protected ArrayList<Equipo> getEquipos(){
        return this.equipos;
    }

    public abstract ArrayList<Equipo> getEquiposQueAvanzan();

    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }

    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }
}
