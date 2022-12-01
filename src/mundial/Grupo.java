package mundial;

import java.util.ArrayList;

public class Grupo extends EtapaMundial{

    private ArrayList<Equipo> equipos;

    public Grupo(){
        super();
        this.equipos = new ArrayList<>();
    }

    public Grupo(String descripcionEtapa){
        super(descripcionEtapa);
        this.equipos = new ArrayList<>();
    }

    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan() {
        ArrayList<Equipo> equiposQueAvanzan = new ArrayList<>();
        Equipo e1 = new Equipo("");
        Equipo e2 = new Equipo("");
        for (Equipo equipo : this.getEquipos()) {
            if(equipo.getPuntaje() > e1.getPuntaje()){
                e2 = e1;
                e1 = equipo;
            }
            else if (equipo.getPuntaje() > e2.getPuntaje()) {
                e2 = equipo;
            }
        }
        equiposQueAvanzan.add(e1);
        equiposQueAvanzan.add(e2);
        return equiposQueAvanzan;
    }

    @Override
    public void addPartido(Partido partido) {
        super.getPartidos().add(partido);
        partido.getLocal().addPartido(partido);
        partido.getVisitante().addPartido(partido);
        this.addEquipo(partido.getLocal());
        this.addEquipo(partido.getVisitante());
    }

    @Override
    public void mostrarClasificados(){
        System.out.println(super.getDescripcionEtapa() + ": ");
        String aux = "[";
        aux += this.getEquiposQueAvanzan().get(0).getNombre() + " " + this.getEquiposQueAvanzan().get(0).getPuntaje() + ", "; 
        aux += this.getEquiposQueAvanzan().get(1).getNombre() + " " + this.getEquiposQueAvanzan().get(1).getPuntaje();
        aux += "]";
        System.out.println(aux);
    }

    @Override
    public void mostrarEtapa() {
        System.out.println(super.getDescripcionEtapa() + ": " + this.getEquipos());
        
    }

    private void addEquipo(Equipo equipo){
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

    public ArrayList<Equipo> getEquipos(){
        return this.equipos;
    }
}
