package mundial;

import java.util.ArrayList;

public abstract class EtapaMundial {
    private String descripcionEtapa;
    private ArrayList<Partido> partidos;

    public EtapaMundial(){
        this.partidos = new ArrayList<>();
    }

    public EtapaMundial(String descripcionEtapa){
        setDescripcionEtapa(descripcionEtapa);
        this.partidos = new ArrayList<>();
    }

    public void addPartido(Partido partido){
        this.partidos.add(partido);
        partido.getLocal().addPartido(partido);
        partido.getVisitante().addPartido(partido);
    }

    protected ArrayList<Partido> getPartidos(){
        return this.partidos;
    }

    public abstract ArrayList<Equipo> getEquiposQueAvanzan();

    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }

    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }
}
