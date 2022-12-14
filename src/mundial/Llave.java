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

    @Override
    public void addPartido(Partido partido) {
        if(!partido.getResultado().empate()){
            super.getPartidos().add(partido);
            partido.getLocal().addPartido(partido);
            partido.getVisitante().addPartido(partido);
        }
        else{
            System.out.println("No puede haber empate en un partido de Llave");
        }
    }

    @Override
    public void mostrarEtapa() {
        System.out.println(super.getDescripcionEtapa() + ": \n" +super.getPartidos());
        
    }

    @Override
    public void mostrarClasificados() {
        System.out.println(this.getEquiposQueAvanzan());
        
    }
}
