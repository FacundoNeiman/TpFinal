import java.time.LocalDate;
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

        Equipo paisesBajos = new Equipo("Países Bajos");
        Equipo ecuador = new Equipo("Ecuador");
        Equipo inglaterra = new Equipo("Inglaterra");
        Equipo argentina = new Equipo("Argentina");
        Equipo polonia = new Equipo("Polonia");
        Equipo mexico = new Equipo("México");
        Equipo francia = new Equipo("Francia");
        Equipo dinamarca = new Equipo("Dinamarca");   
        Equipo espana = new Equipo("España");
        Equipo alemania = new Equipo("Alemania");
        Equipo croacia = new Equipo("Croacia");
        Equipo belgica = new Equipo("Belgica");
        Equipo brasil = new Equipo("Brasil");
        Equipo suiza = new Equipo("Suiza");
        Equipo portugal = new Equipo("Portugal");
        Equipo uruguay = new Equipo("Uruguay");
        
        Grupo grupoA = new Grupo("Grupo A");

        grupoA.addPartido(new Partido(createRandomDate(), paisesBajos, ecuador, new Resultado(1,1)));
        grupoA.addPartido(new Partido(createRandomDate(),inglaterra,argentina, new Resultado(0,1)));
        grupoA.addPartido(new Partido(createRandomDate(),ecuador, argentina,new Resultado(0,2)));
        grupoA.addPartido(new Partido(createRandomDate(),inglaterra,paisesBajos,new Resultado(2,0)));
        grupoA.addPartido(new Partido(createRandomDate(),argentina,paisesBajos,new Resultado(2,0)));
        grupoA.addPartido(new Partido(createRandomDate(),ecuador,inglaterra,new Resultado(1,2)));

        Grupo grupoB = new Grupo("Grupo B");
        grupoB.addPartido(new Partido(createRandomDate(), polonia, mexico, new Resultado(0,0)));
        grupoB.addPartido(new Partido(createRandomDate(), francia, dinamarca, new Resultado(4,1)));
        grupoB.addPartido(new Partido(createRandomDate(), mexico, dinamarca, new Resultado(1,1)));
        grupoB.addPartido(new Partido(createRandomDate(), francia, polonia, new Resultado(2,1)));
        grupoB.addPartido(new Partido(createRandomDate(), mexico, francia, new Resultado(1,4)));
        grupoB.addPartido(new Partido(createRandomDate(), dinamarca, polonia, new Resultado(1,0)));

        Grupo grupoC = new Grupo("Grupo C");
        grupoC.addPartido(new Partido(createRandomDate(), espana, alemania, new Resultado(1,1)));
        grupoC.addPartido(new Partido(createRandomDate(), croacia, belgica, new Resultado(1,1)));
        grupoC.addPartido(new Partido(createRandomDate(), alemania, belgica, new Resultado(2,1)));
        grupoC.addPartido(new Partido(createRandomDate(), croacia, espana, new Resultado(2,3)));
        grupoC.addPartido(new Partido(createRandomDate(), alemania, croacia, new Resultado(1,0)));
        grupoC.addPartido(new Partido(createRandomDate(), belgica, espana, new Resultado(0,2)));

        Grupo grupoD = new Grupo("Grupo D");
        grupoD.addPartido(new Partido(createRandomDate(), brasil, suiza, new Resultado(2,0)));
        grupoD.addPartido(new Partido(createRandomDate(), portugal, uruguay, new Resultado(2,0)));
        grupoD.addPartido(new Partido(createRandomDate(), suiza, uruguay, new Resultado(0,0)));
        grupoD.addPartido(new Partido(createRandomDate(), portugal, brasil, new Resultado(0,2)));
        grupoD.addPartido(new Partido(createRandomDate(), suiza, portugal, new Resultado(1,3)));
        grupoD.addPartido(new Partido(createRandomDate(), uruguay, brasil, new Resultado(0,2)));

        System.out.println("Grupos: ");
        grupoA.mostrarEtapa();
        grupoB.mostrarEtapa();
        grupoC.mostrarEtapa();
        grupoD.mostrarEtapa();
        System.out.println();

        System.out.println("Clasificados: ");
        grupoA.mostrarClasificados();
        grupoB.mostrarClasificados();
        grupoC.mostrarClasificados();
        grupoD.mostrarClasificados();
        System.out.println();

        ArrayList<Equipo> clasificadosgrupoA =  grupoA.getEquiposQueAvanzan();
        ArrayList<Equipo> clasificadosgrupoB =  grupoB.getEquiposQueAvanzan();
        ArrayList<Equipo> clasificadosgrupoC =  grupoC.getEquiposQueAvanzan();
        ArrayList<Equipo> clasificadosgrupoD =  grupoD.getEquiposQueAvanzan();

        Llave cuartos = new Llave("Cuartos");
        cuartos.addPartido(new Partido(createRandomDate(), clasificadosgrupoA.get(0), clasificadosgrupoB.get(1), new Resultado(2,1)));
        cuartos.addPartido(new Partido(createRandomDate(), clasificadosgrupoC.get(0), clasificadosgrupoD.get(1), new Resultado(0,3)));
        cuartos.addPartido(new Partido(createRandomDate(), clasificadosgrupoB.get(0), clasificadosgrupoA.get(1), new Resultado(2, 1)));
        cuartos.addPartido(new Partido(createRandomDate(), clasificadosgrupoD.get(0), clasificadosgrupoC.get(1), new Resultado(3, 2)));
        cuartos.mostrarEtapa();
        System.out.println();
        
        Llave semifinales = new Llave("Semifinales");
        ArrayList<Equipo> semifinalistas = cuartos.getEquiposQueAvanzan();
        semifinales.addPartido(new Partido(createRandomDate(), semifinalistas.get(0), semifinalistas.get(1), new Resultado(2,1)));
        semifinales.addPartido(new Partido(createRandomDate(), semifinalistas.get(2), semifinalistas.get(3), new Resultado(2,3)));
        semifinales.mostrarEtapa();
        System.out.println();
       
        Llave finales = new Llave("Final");
        ArrayList<Equipo> finalistas = semifinales.getEquiposQueAvanzan();
        finales.addPartido(new Partido(createRandomDate(), finalistas.get(0), finalistas.get(1), new Resultado(1, 0)));
        finales.mostrarEtapa();
        System.out.println();
        System.out.print("Campeon: ");
        finales.mostrarClasificados();
    }

    public static int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public static Date createRandomDate() {
        int day = createRandomIntBetween(1, 30);
        int month = createRandomIntBetween(11, 12);
        int year = 2022;
        LocalDate aux = LocalDate.of(year, month, day);
        return java.sql.Date.valueOf(aux);
    }
}