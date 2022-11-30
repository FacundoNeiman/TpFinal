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
        //TODO
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
}
