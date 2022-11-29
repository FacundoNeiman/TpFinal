package mundial;

import java.util.ArrayList;

public class Llave extends EtapaMundial{

    public Llave() {
        super();
    }

    public Llave(String descripcionEtapa){
        super(descripcionEtapa);
    }

    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan() {
        ArrayList<Equipo> ganadores = new ArrayList<>();
        for (Partido partido : super.getPartidos()) {
            if(partido.getResultado().ganoLocal()){
                ganadores.add(partido.getLocal());
            }
            else{
                ganadores.add(partido.getVisitante());
            }
        }

        return ganadores;
    }
}
