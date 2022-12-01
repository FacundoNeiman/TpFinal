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

        grupoA.addPartido(new Partido(createRandomDate(), paisesBajos, ecuador, randomResult()));
        grupoA.addPartido(new Partido(createRandomDate(),inglaterra,argentina, randomResult()));
        grupoA.addPartido(new Partido(createRandomDate(),ecuador, argentina,randomResult()));
        grupoA.addPartido(new Partido(createRandomDate(),inglaterra,paisesBajos,randomResult()));
        grupoA.addPartido(new Partido(createRandomDate(),argentina,paisesBajos,randomResult()));
        grupoA.addPartido(new Partido(createRandomDate(),ecuador,inglaterra,randomResult()));

        Grupo grupoB = new Grupo("Grupo B");
        grupoB.addPartido(new Partido(createRandomDate(), polonia, mexico, randomResult()));
        grupoB.addPartido(new Partido(createRandomDate(), francia, dinamarca, randomResult()));
        grupoB.addPartido(new Partido(createRandomDate(), mexico, dinamarca, randomResult()));
        grupoB.addPartido(new Partido(createRandomDate(), francia, polonia, randomResult()));
        grupoB.addPartido(new Partido(createRandomDate(), mexico, francia, randomResult()));
        grupoB.addPartido(new Partido(createRandomDate(), dinamarca, polonia, randomResult()));

        Grupo grupoC = new Grupo("Grupo C");
        grupoC.addPartido(new Partido(createRandomDate(), espana, alemania, randomResult()));
        grupoC.addPartido(new Partido(createRandomDate(), croacia, belgica, randomResult()));
        grupoC.addPartido(new Partido(createRandomDate(), alemania, belgica, randomResult()));
        grupoC.addPartido(new Partido(createRandomDate(), croacia, espana, randomResult()));
        grupoC.addPartido(new Partido(createRandomDate(), alemania, croacia, randomResult()));
        grupoC.addPartido(new Partido(createRandomDate(), belgica, espana, randomResult()));

        Grupo grupoD = new Grupo("Grupo D");
        grupoD.addPartido(new Partido(createRandomDate(), brasil, suiza, randomResult()));
        grupoD.addPartido(new Partido(createRandomDate(), portugal, uruguay, randomResult()));
        grupoD.addPartido(new Partido(createRandomDate(), suiza, uruguay, randomResult()));
        grupoD.addPartido(new Partido(createRandomDate(), portugal, brasil, randomResult()));
        grupoD.addPartido(new Partido(createRandomDate(), suiza, portugal, randomResult()));
        grupoD.addPartido(new Partido(createRandomDate(), uruguay, brasil, randomResult()));

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
        cuartos.addPartido(new Partido(createRandomDate(), clasificadosgrupoA.get(0), clasificadosgrupoB.get(1), randomResult()));
        cuartos.addPartido(new Partido(createRandomDate(), clasificadosgrupoC.get(0), clasificadosgrupoD.get(1), randomResult()));
        cuartos.addPartido(new Partido(createRandomDate(), clasificadosgrupoB.get(0), clasificadosgrupoA.get(1), randomResult()));
        cuartos.addPartido(new Partido(createRandomDate(), clasificadosgrupoD.get(0), clasificadosgrupoC.get(1), randomResult()));
        cuartos.mostrarEtapa();
        System.out.println();
        
        Llave semifinales = new Llave("Semifinales");
        ArrayList<Equipo> semifinalistas = cuartos.getEquiposQueAvanzan();
        semifinales.addPartido(new Partido(createRandomDate(), semifinalistas.get(0), semifinalistas.get(1), randomResult()));
        semifinales.addPartido(new Partido(createRandomDate(), semifinalistas.get(2), semifinalistas.get(3), randomResult()));
        semifinales.mostrarEtapa();
        System.out.println();
       
        Llave finales = new Llave("Final");
        ArrayList<Equipo> finalistas = semifinales.getEquiposQueAvanzan();
        finales.addPartido(new Partido(createRandomDate(), finalistas.get(0), finalistas.get(1), randomResult()));
        finales.mostrarEtapa();
        System.out.println();
        System.out.print("Campeon: ");
        finales.mostrarClasificados();
    }

    public static Resultado randomResult() {
       int golesLocal = (int)(Math.random()*4);
       int golesVisitante = (int)(Math.random()*4);
       while(golesVisitante == golesLocal){
        golesVisitante = (int)(Math.random()*4+1);
       }
       return new Resultado(golesLocal, golesVisitante);
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