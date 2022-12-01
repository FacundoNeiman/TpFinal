package mundial;

import java.util.ArrayList;

public class Grupo extends EtapaMundial{


    public Grupo(){
        super();
    }

    public Grupo(String descripcionEtapa){
        super(descripcionEtapa);
    }

    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan() {
        ArrayList<Equipo> equiposQueAvanzan = new ArrayList<>();
        Equipo e1 = new Equipo("");
        Equipo e2 = new Equipo("");
        for (Equipo equipo : super.getEquipos()) {
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
        super.addEquipo(partido.getLocal());
        super.addEquipo(partido.getVisitante());
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
        System.out.println(super.getDescripcionEtapa() + ": " + super.getEquipos());
        
    }
}
