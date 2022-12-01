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

    public abstract ArrayList<Equipo> getEquiposQueAvanzan();

    public abstract void addPartido(Partido partido);

    public abstract void mostrarEtapa();

    public abstract void mostrarClasificados();

    public ArrayList<Partido> getPartidos(){
        return this.partidos;
    }

    protected void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }

    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }
}
