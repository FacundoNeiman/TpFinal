import java.util.ArrayList;
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

        // Equipo qatar = new Equipo("Qatar");
        // Equipo paisesBajos = new Equipo("Países Bajos");
        // Equipo ecuador = new Equipo("Ecuador");
        // Equipo senegal = new Equipo("Senegal");
        // Equipo inglaterra = new Equipo("Inglaterra");
        // Equipo estadosUnidos = new Equipo("Estados Unidos");
        // Equipo iran = new Equipo("Irán");
        // Equipo gales = new Equipo("Gales");
        Equipo argentina = new Equipo("Argentina");
        Equipo polonia = new Equipo("Polonia");
        Equipo arabia = new Equipo("Arabia Saudita");
        Equipo mexico = new Equipo("México");
        Equipo francia = new Equipo("Francia");
        Equipo dinamarca = new Equipo("Dinamarca");
        Equipo australia = new Equipo("Australia");
        Equipo tunez = new Equipo("Tunez");
        // Equipo espana = new Equipo("España");
        // Equipo japon = new Equipo("Japon");
        // Equipo costaRica = new Equipo("Costa Rica");
        // Equipo alemania = new Equipo("Alemania");
        // Equipo croacia = new Equipo("Croacia");
        // Equipo marruecos = new Equipo("Marruecos");
        // Equipo belgica = new Equipo("Belgica");
        // Equipo canada = new Equipo("Canada");
        // Equipo brasil = new Equipo("Brasil");
        // Equipo suiza = new Equipo("Suiza");
        // Equipo camerun = new Equipo("Camerún");
        // Equipo serbian = new Equipo("Serbia");
        // Equipo portugal = new Equipo("Portugal");
        // Equipo ghana = new Equipo("Ghana");
        // Equipo corea = new Equipo("Corea");
        // Equipo uruguay = new Equipo("Uruguay");
        
        Grupo grupoC = new Grupo();
        Date fecha = new Date(2022, 11, 20);
        grupoC.addPartido(new Partido(fecha, argentina, arabia, new Resultado(1,2)));
        grupoC.addPartido(new Partido(fecha,mexico,polonia, new Resultado(0,0)));
        grupoC.addPartido(new Partido(fecha,mexico, argentina,new Resultado(0,2)));
        grupoC.addPartido(new Partido(fecha,arabia,polonia,new Resultado(0,2)));
        grupoC.addPartido(new Partido(fecha,argentina,polonia,new Resultado(2,0)));
        grupoC.addPartido(new Partido(fecha,arabia,mexico,new Resultado(1,2)));

        Grupo grupoD = new Grupo();
        grupoD.addPartido(new Partido(fecha, dinamarca, tunez, new Resultado(0,0)));
        grupoD.addPartido(new Partido(fecha, francia, australia, new Resultado(4,1)));
        grupoD.addPartido(new Partido(fecha, tunez, australia, new Resultado(0,1)));
        grupoD.addPartido(new Partido(fecha, francia, dinamarca, new Resultado(2,1)));
        grupoD.addPartido(new Partido(fecha, tunez, francia, new Resultado(1,0)));
        grupoD.addPartido(new Partido(fecha, australia, dinamarca, new Resultado(1,0)));

        ArrayList<Equipo> clasificadosGrupoC =  grupoC.getEquiposQueAvanzan();
        ArrayList<Equipo> clasificadosGrupoD =  grupoD.getEquiposQueAvanzan();

        Llave llaveA = new Llave("Semifinales");
        llaveA.addPartido(new Partido(fecha, clasificadosGrupoC.get(0), clasificadosGrupoD.get(1), new Resultado(2,1)));
        llaveA.addPartido(new Partido(fecha, clasificadosGrupoC.get(1), clasificadosGrupoD.get(0), new Resultado(0,3)));
    }
}
