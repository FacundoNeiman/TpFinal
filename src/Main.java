import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import mundial.*;
import sistemaGarage.*;
import sistemaGarage.vehiculos.*;


public class Main {
    public static void main(String[] args) {
         Garage garage = new Garage();
         garage.abrirGarage(500,5);
         Coche v1 = new Coche("MZK155", "Chevrolet", "Corsa Classic", 4, 50000, 4);
         Moto v2 = new Moto("JKL555", "Honda", "X-50", 2, 29050, 150);
         Coche v3 = new Coche("AA125BA", "Fiat", "600", 4, 750000, 5);
         Moto v4 = new Moto("LMN391", "Honda", "X-50", 2, 29050, 150);
         Coche v5 = new Coche("MZK155", "Chevrolet", "Corsa Classic", 4, 50000, 4);
         Moto v6 = new Moto("JKL555", "Honda", "X-50", 2, 29050, 150);
        // System.out.println(garage);

        Equipo qatar = new Equipo("Qatar");
        Equipo paisesBajos = new Equipo("Países Bajos");
        Equipo ecuador = new Equipo("Ecuador");
        Equipo senegal = new Equipo("Senegal");
        Equipo inglaterra = new Equipo("Inglaterra");
        Equipo estadosUnidos = new Equipo("Estados Unidos");
        Equipo iran = new Equipo("Irán");
        Equipo gales = new Equipo("Gales");
        Equipo argentina = new Equipo("Argentina");
        Equipo polonia = new Equipo("Polonia");
        Equipo mexico = new Equipo("México");
        Equipo arabia = new Equipo("Arabia Saudita");
        Equipo francia = new Equipo("Francia");
        Equipo dinamarca = new Equipo("Dinamarca");  
        Equipo australia = new Equipo("Australia");
        Equipo tunez = new Equipo("Tunez");
        Equipo espana = new Equipo("España");
        Equipo alemania = new Equipo("Alemania");
        Equipo japon = new Equipo("Japon");
        Equipo costaRica = new Equipo("Costa Rica");
        Equipo croacia = new Equipo("Croacia");
        Equipo belgica = new Equipo("Belgica");
        Equipo marruecos = new Equipo("Marruecos");
        Equipo canada = new Equipo("Canada");
        Equipo brasil = new Equipo("Brasil");
        Equipo suiza = new Equipo("Suiza");
        Equipo camerun = new Equipo("Camerún");
        Equipo serbia = new Equipo("Serbia");
        Equipo portugal = new Equipo("Portugal");
        Equipo uruguay = new Equipo("Uruguay");
        Equipo ghana = new Equipo("Ghana");
        Equipo corea = new Equipo("Corea");

        ArrayList<Grupo> grupos = new ArrayList<>();
        
        Grupo grupoA = new Grupo("Grupo A");
        grupoA.addPartido(new Partido(createRandomDate(), qatar, ecuador, randomResult(true)));
        grupoA.addPartido(new Partido(createRandomDate(),senegal,paisesBajos, randomResult(true)));
        grupoA.addPartido(new Partido(createRandomDate(),qatar, senegal,randomResult(true)));
        grupoA.addPartido(new Partido(createRandomDate(),paisesBajos,ecuador,randomResult(true)));
        grupoA.addPartido(new Partido(createRandomDate(),paisesBajos, qatar,randomResult(true)));
        grupoA.addPartido(new Partido(createRandomDate(),ecuador,senegal,randomResult(true)));
        grupos.add(grupoA);

        Grupo grupoB = new Grupo("Grupo B");
        grupoB.addPartido(new Partido(createRandomDate(), inglaterra, iran, randomResult(true)));
        grupoB.addPartido(new Partido(createRandomDate(), estadosUnidos, gales, randomResult(true)));
        grupoB.addPartido(new Partido(createRandomDate(), gales, iran, randomResult(true)));
        grupoB.addPartido(new Partido(createRandomDate(), inglaterra, estadosUnidos, randomResult(true)));
        grupoB.addPartido(new Partido(createRandomDate(), gales, inglaterra, randomResult(true)));
        grupoB.addPartido(new Partido(createRandomDate(), iran, estadosUnidos, randomResult(true)));
        grupos.add(grupoB);

        Grupo grupoC = new Grupo("Grupo C");
        grupoC.addPartido(new Partido(createRandomDate(), argentina, arabia, randomResult(true)));
        grupoC.addPartido(new Partido(createRandomDate(), mexico, polonia, randomResult(true)));
        grupoC.addPartido(new Partido(createRandomDate(), polonia, arabia, randomResult(true)));
        grupoC.addPartido(new Partido(createRandomDate(), argentina, mexico, randomResult(true)));
        grupoC.addPartido(new Partido(createRandomDate(), polonia, argentina, randomResult(true)));
        grupoC.addPartido(new Partido(createRandomDate(), arabia, mexico, randomResult(true)));
        grupos.add(grupoC);

        Grupo grupoD = new Grupo("Grupo D");
        grupoD.addPartido(new Partido(createRandomDate(), dinamarca, tunez, randomResult(true)));
        grupoD.addPartido(new Partido(createRandomDate(), francia, australia, randomResult(true)));
        grupoD.addPartido(new Partido(createRandomDate(), tunez, australia, randomResult(true)));
        grupoD.addPartido(new Partido(createRandomDate(), francia, dinamarca, randomResult(true)));
        grupoD.addPartido(new Partido(createRandomDate(), tunez, francia, randomResult(true)));
        grupoD.addPartido(new Partido(createRandomDate(), australia, dinamarca, randomResult(true)));
        grupos.add(grupoD);

        Grupo grupoE = new Grupo("Grupo E");
        grupoE.addPartido(new Partido(createRandomDate(), alemania, japon, randomResult(true)));
        grupoE.addPartido(new Partido(createRandomDate(), espana, costaRica, randomResult(true)));
        grupoE.addPartido(new Partido(createRandomDate(), japon, costaRica, randomResult(true)));
        grupoE.addPartido(new Partido(createRandomDate(), espana, alemania, randomResult(true)));
        grupoE.addPartido(new Partido(createRandomDate(), costaRica, alemania, randomResult(true)));
        grupoE.addPartido(new Partido(createRandomDate(), japon, espana, randomResult(true)));
        grupos.add(grupoE);

        Grupo grupoF = new Grupo("Grupo F");
        grupoF.addPartido(new Partido(createRandomDate(), marruecos, croacia, randomResult(true)));
        grupoF.addPartido(new Partido(createRandomDate(), belgica, canada, randomResult(true)));
        grupoF.addPartido(new Partido(createRandomDate(), belgica, marruecos, randomResult(true)));
        grupoF.addPartido(new Partido(createRandomDate(), croacia, canada, randomResult(true)));
        grupoF.addPartido(new Partido(createRandomDate(), croacia, belgica, randomResult(true)));
        grupoF.addPartido(new Partido(createRandomDate(), canada, marruecos, randomResult(true)));
        grupos.add(grupoF);

        Grupo grupoG = new Grupo("Grupo G");
        grupoG.addPartido(new Partido(createRandomDate(), suiza, camerun, randomResult(true)));
        grupoG.addPartido(new Partido(createRandomDate(), brasil, serbia, randomResult(true)));
        grupoG.addPartido(new Partido(createRandomDate(), camerun, serbia, randomResult(true)));
        grupoG.addPartido(new Partido(createRandomDate(), brasil, suiza, randomResult(true)));
        grupoG.addPartido(new Partido(createRandomDate(), camerun, brasil, randomResult(true)));
        grupoG.addPartido(new Partido(createRandomDate(), serbia, suiza, randomResult(true)));
        grupos.add(grupoG);

        Grupo grupoH = new Grupo("Grupo H");
        grupoH.addPartido(new Partido(createRandomDate(), uruguay, corea, randomResult(true)));
        grupoH.addPartido(new Partido(createRandomDate(), portugal, ghana, randomResult(true)));
        grupoH.addPartido(new Partido(createRandomDate(), corea, ghana, randomResult(true)));
        grupoH.addPartido(new Partido(createRandomDate(), portugal, uruguay, randomResult(true)));
        grupoH.addPartido(new Partido(createRandomDate(), corea, portugal, randomResult(true)));
        grupoH.addPartido(new Partido(createRandomDate(), ghana, uruguay, randomResult(true)));
        grupos.add(grupoH);
        System.out.println(grupoH.getEquipos());
        System.out.println(grupoH.getEquiposQueAvanzan());
        System.out.println(grupoH.getPartidos());
        grupoH.mostrarClasificados();
        grupoH.mostrarEtapa();

        //TODO: ARREGLAR ERROR DE QUE SE REPITEN EQUIPOS

        System.out.println("Grupos: ");
        for (Grupo grupo : grupos) {
            grupo.mostrarEtapa();
        }
        System.out.println();

        System.out.println("Clasificados: ");
        for (Grupo grupo : grupos) {
            grupo.mostrarClasificados();
        }
        System.out.println();

        Llave octavos = new Llave("Octavos");
        octavos.addPartido(new Partido(createRandomDate(), grupos.get(0).getEquiposQueAvanzan().get(0), grupos.get(1).getEquiposQueAvanzan().get(1), randomResult(false)));
        octavos.addPartido(new Partido(createRandomDate(), grupos.get(2).getEquiposQueAvanzan().get(0), grupos.get(3).getEquiposQueAvanzan().get(1), randomResult(false)));
        octavos.addPartido(new Partido(createRandomDate(), grupos.get(4).getEquiposQueAvanzan().get(0), grupos.get(5).getEquiposQueAvanzan().get(1), randomResult(false)));
        octavos.addPartido(new Partido(createRandomDate(), grupos.get(6).getEquiposQueAvanzan().get(0), grupos.get(7).getEquiposQueAvanzan().get(1), randomResult(false)));
        octavos.addPartido(new Partido(createRandomDate(), grupos.get(1).getEquiposQueAvanzan().get(0), grupos.get(0).getEquiposQueAvanzan().get(1), randomResult(false)));
        octavos.addPartido(new Partido(createRandomDate(), grupos.get(3).getEquiposQueAvanzan().get(0), grupos.get(2).getEquiposQueAvanzan().get(1), randomResult(false)));
        octavos.addPartido(new Partido(createRandomDate(), grupos.get(5).getEquiposQueAvanzan().get(0), grupos.get(4).getEquiposQueAvanzan().get(1), randomResult(false)));
        octavos.addPartido(new Partido(createRandomDate(), grupos.get(7).getEquiposQueAvanzan().get(0), grupos.get(6).getEquiposQueAvanzan().get(1), randomResult(false)));
        octavos.mostrarEtapa();
        System.out.println();

        Llave cuartos = new Llave("Cuartos");
        ArrayList<Equipo> cuartistas = octavos.getEquiposQueAvanzan();
        cuartos.addPartido(new Partido(createRandomDate(), cuartistas.get(0), cuartistas.get(1), randomResult(false)));
        cuartos.addPartido(new Partido(createRandomDate(), cuartistas.get(2), cuartistas.get(3), randomResult(false)));
        cuartos.addPartido(new Partido(createRandomDate(), cuartistas.get(4), cuartistas.get(5), randomResult(false)));
        cuartos.addPartido(new Partido(createRandomDate(), cuartistas.get(6), cuartistas.get(7), randomResult(false)));
        cuartos.mostrarEtapa();
        System.out.println();
        
        Llave semifinales = new Llave("Semifinales");
        ArrayList<Equipo> semifinalistas = cuartos.getEquiposQueAvanzan();
        semifinales.addPartido(new Partido(createRandomDate(), semifinalistas.get(0), semifinalistas.get(1), randomResult(false)));
        semifinales.addPartido(new Partido(createRandomDate(), semifinalistas.get(2), semifinalistas.get(3), randomResult(false)));
        semifinales.mostrarEtapa();
        System.out.println();
       
        Llave finales = new Llave("Final");
        ArrayList<Equipo> finalistas = semifinales.getEquiposQueAvanzan();
        finales.addPartido(new Partido(createRandomDate(), finalistas.get(0), finalistas.get(1), randomResult(false)));
        finales.mostrarEtapa();
        System.out.println();
        System.out.print("Campeon: ");
        finales.mostrarClasificados();
    }

    public static Resultado randomResult(boolean faseDeGrupos) {
       int golesLocal = (int)(Math.random()*4);
       int golesVisitante = (int)(Math.random()*4);
       if(!faseDeGrupos){
           while(golesVisitante == golesLocal){
            golesVisitante = (int)(Math.random()*4+1);
           }
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