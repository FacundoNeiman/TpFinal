import java.util.Date;

import mundial.*;
import sistemaGarage.*;
import sistemaGarage.vehiculos.Coche;
import sistemaGarage.vehiculos.Vehiculo;

public class Main {
    public static void main(String[] args) {
        // Garage garage = new Garage();
        // garage.abrirGarage(500,50);

        // Coche v1 = new Coche("MZK155", "Chevrolet", "Corsa Classic", 4, 50000, 4);
        
        // System.out.println(garage);

        Equipo argentina = new Equipo("Argentina");
        Equipo polonia = new Equipo("Polonia");
        Equipo arabia = new Equipo("Arabia Saudita");
        Equipo mexico = new Equipo("México");
        Grupo grupoC = new Grupo();
        Date fecha = new Date(2022, 11, 20);
        grupoC.addPartido(new Partido(fecha, argentina, arabia, new Resultado(1,2)));
        grupoC.addPartido(new Partido(fecha,mexico,polonia, new Resultado(0,0)));
        grupoC.addPartido(new Partido(fecha,mexico, argentina,new Resultado(0,2)));
        grupoC.addPartido(new Partido(fecha,arabia,polonia,new Resultado(0,2)));
        grupoC.addPartido(new Partido(fecha,argentina,polonia,new Resultado(2,0)));
        grupoC.addPartido(new Partido(fecha,arabia,mexico,new Resultado(1,2)));

        System.out.println(grupoC.getEquiposQueAvanzan());

        Llave op1 = new Llave("Octavos de Final");
        op1.addPartido(new Partido(fecha, argentina, mexico, new Resultado(1,0)));
        for (Equipo e : op1.getEquiposQueAvanzan()) {
            System.out.println(e.getNombre());
        }
    }
}
