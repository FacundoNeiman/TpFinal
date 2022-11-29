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
        Date fechaAleatoria = new Date(2022, 11, 20);
        grupoC.addPartido(new Partido(fechaAleatoria, argentina, arabia, new Resultado(1,2)));
        grupoC.addPartido(new Partido(fechaAleatoria,mexico,polonia, new Resultado(0,0)));
        grupoC.addPartido(new Partido(fechaAleatoria,mexico, argentina,new Resultado(0,2)));
        grupoC.addPartido(new Partido(fechaAleatoria,arabia,polonia,new Resultado(0,2)));

        System.out.println(grupoC.getEquiposQueAvanzan());

        Llave op1 = new Llave("Octavos de Final");
        op1.addPartido(new Partido(fechaAleatoria, argentina, mexico, new Resultado(2,0)));
        for (Equipo e : op1.getEquiposQueAvanzan()) {
            System.out.println(e.getNombre());
        }
    }
}
