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
        ArrayList<Equipo> equipos = new ArrayList<>();
        for (Partido partido : super.getPartidos()) {
            Equipo local = partido.getLocal();
            Equipo visitante = partido.getVisitante();

            if(partido.getResultado().ganoLocal()){
                
            }
        }

        return equiposQueAvanzan;
    }
}
