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
        this.equipos = new ArrayList<>();
    }

    public abstract ArrayList<Equipo> getEquiposQueAvanzan();

    public abstract void addPartido(Partido partido);

    public abstract void mostrarEtapa();

    public abstract void mostrarClasificados();

    protected void addEquipo(Equipo equipo){
        if(!equipoYaExistente(equipo)){
            getEquipos().add(equipo);
        }
    }

    private boolean equipoYaExistente(Equipo equipo){
        boolean existe = false;
        int i = 0;
        while(!existe && i < getEquipos().size()){
            if(equipo == getEquipos().get(i)){
                existe = true;
            }
            i++;
        }
        return existe;
    }

    protected ArrayList<Partido> getPartidos(){
        return this.partidos;
    }

    public ArrayList<Equipo> getEquipos(){
        return this.equipos;
    }

    protected void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    protected void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }

    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }
}
