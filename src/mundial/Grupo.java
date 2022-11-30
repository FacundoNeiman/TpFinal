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
        for (Equipo equipo : super.getEquipos()) {
            
        }

        return equiposQueAvanzan;
    }

    @Override
    public void addPartido(Partido partido) {
        super.getPartidos().add(partido);
        partido.getLocal().addPartido(partido);
        partido.getVisitante().addPartido(partido);
        
    }
}
