import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import mundial.*;
import sistemaGarage.*;
import sistemaGarage.vehiculos.*;


public class Main {
    public static void main(String[] args) {
        //GARAGE: 
        System.out.println("Garage: \n");
        Garage garage = new Garage();
        garage.abrirGarage(500,5);
        Coche v1 = new Coche("MZK155", "Chevrolet", "Corsa Classic", 4, 50000, 4);
        Moto v2 = new Moto("JKL555", "Honda", "X-50", 2, 29050, 150);
        Coche v3 = new Coche("AA125BA", "Fiat", "600", 4, 750000, 5);
        Moto v4 = new Moto("LMN391", "Honda", "X-50", 2, 29050, 150);
        Coche v5 = new Coche("AB566AA", "Audi", "V-10", 4, 100, 5);
        Moto v6 = new Moto("EKJ903", "Suzuki", "Master", 2, 350000, 300);
        garage.registrarVehiculo(v1);
        garage.registrarVehiculo(v2);
        garage.registrarVehiculo(v3);
        garage.registrarVehiculo(v4);
        garage.registrarVehiculo(v5);
        garage.registrarVehiculo(v5);
        garage.registrarVehiculo(v6);
        garage.retirarVehiculo(v6);
        garage.retirarVehiculo(v3);
        System.out.println("Actualmente hay " + garage.getCantidadVehiculos() + " vehículos en el garage");
        System.out.println("Precio total del cambio de ruedas del garage: $" + garage.getPrecioTotalCambioRueda());
        System.out.println("Kilometraje medio del garage: " + garage.getKilometrajeMedio() + " km");
        
        System.out.println();
        System.out.println();

        //MUNDIAL: 
        System.out.println("Mundial: \n");
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
        grupoA.addPartido(new Partido(createRandomDate(), qatar, ecuador, randomResult(true),true));
        grupoA.addPartido(new Partido(createRandomDate(),senegal,paisesBajos, randomResult(true),true));
        grupoA.addPartido(new Partido(createRandomDate(),qatar, senegal,randomResult(true),true));
        grupoA.addPartido(new Partido(createRandomDate(),paisesBajos,ecuador,randomResult(true),true));
        grupoA.addPartido(new Partido(createRandomDate(),paisesBajos, qatar,randomResult(true),true));
        grupoA.addPartido(new Partido(createRandomDate(),ecuador,senegal,randomResult(true),true));
        grupos.add(grupoA);

        Grupo grupoB = new Grupo("Grupo B");
        grupoB.addPartido(new Partido(createRandomDate(), inglaterra, iran, randomResult(true),true));
        grupoB.addPartido(new Partido(createRandomDate(), estadosUnidos, gales, randomResult(true),true));
        grupoB.addPartido(new Partido(createRandomDate(), gales, iran, randomResult(true),true));
        grupoB.addPartido(new Partido(createRandomDate(), inglaterra, estadosUnidos, randomResult(true),true));
        grupoB.addPartido(new Partido(createRandomDate(), gales, inglaterra, randomResult(true),true));
        grupoB.addPartido(new Partido(createRandomDate(), iran, estadosUnidos, randomResult(true),true));
        grupos.add(grupoB);

        Grupo grupoC = new Grupo("Grupo C");
        grupoC.addPartido(new Partido(createRandomDate(), argentina, arabia, randomResult(true),true));
        grupoC.addPartido(new Partido(createRandomDate(), mexico, polonia, randomResult(true),true));
        grupoC.addPartido(new Partido(createRandomDate(), polonia, arabia, randomResult(true),true));
        grupoC.addPartido(new Partido(createRandomDate(), argentina, mexico, randomResult(true),true));
        grupoC.addPartido(new Partido(createRandomDate(), polonia, argentina, randomResult(true),true));
        grupoC.addPartido(new Partido(createRandomDate(), arabia, mexico, randomResult(true),true));
        grupos.add(grupoC);

        Grupo grupoD = new Grupo("Grupo D");
        grupoD.addPartido(new Partido(createRandomDate(), dinamarca, tunez, randomResult(true),true));
        grupoD.addPartido(new Partido(createRandomDate(), francia, australia, randomResult(true),true));
        grupoD.addPartido(new Partido(createRandomDate(), tunez, australia, randomResult(true),true));
        grupoD.addPartido(new Partido(createRandomDate(), francia, dinamarca, randomResult(true),true));
        grupoD.addPartido(new Partido(createRandomDate(), tunez, francia, randomResult(true),true));
        grupoD.addPartido(new Partido(createRandomDate(), australia, dinamarca, randomResult(true),true));
        grupos.add(grupoD);

        Grupo grupoE = new Grupo("Grupo E");
        grupoE.addPartido(new Partido(createRandomDate(), alemania, japon, randomResult(true),true));
        grupoE.addPartido(new Partido(createRandomDate(), espana, costaRica, randomResult(true),true));
        grupoE.addPartido(new Partido(createRandomDate(), japon, costaRica, randomResult(true),true));
        grupoE.addPartido(new Partido(createRandomDate(), espana, alemania, randomResult(true),true));
        grupoE.addPartido(new Partido(createRandomDate(), costaRica, alemania, randomResult(true),true));
        grupoE.addPartido(new Partido(createRandomDate(), japon, espana, randomResult(true),true));
        grupos.add(grupoE);

        Grupo grupoF = new Grupo("Grupo F");
        grupoF.addPartido(new Partido(createRandomDate(), marruecos, croacia, randomResult(true),true));
        grupoF.addPartido(new Partido(createRandomDate(), belgica, canada, randomResult(true),true));
        grupoF.addPartido(new Partido(createRandomDate(), belgica, marruecos, randomResult(true),true));
        grupoF.addPartido(new Partido(createRandomDate(), croacia, canada, randomResult(true),true));
        grupoF.addPartido(new Partido(createRandomDate(), croacia, belgica, randomResult(true),true));
        grupoF.addPartido(new Partido(createRandomDate(), canada, marruecos, randomResult(true),true));
        grupos.add(grupoF);

        Grupo grupoG = new Grupo("Grupo G");
        grupoG.addPartido(new Partido(createRandomDate(), suiza, camerun, randomResult(true), true));
        grupoG.addPartido(new Partido(createRandomDate(), brasil, serbia, randomResult(true),true));
        grupoG.addPartido(new Partido(createRandomDate(), camerun, serbia, randomResult(true),true));
        grupoG.addPartido(new Partido(createRandomDate(), brasil, suiza, randomResult(true),true));
        grupoG.addPartido(new Partido(createRandomDate(), camerun, brasil, randomResult(true),true));
        grupoG.addPartido(new Partido(createRandomDate(), serbia, suiza, randomResult(true),true));
        grupos.add(grupoG);

        Grupo grupoH = new Grupo("Grupo H");
        grupoH.addPartido(new Partido(createRandomDate(), uruguay, corea, randomResult(true),true));
        grupoH.addPartido(new Partido(createRandomDate(), portugal, ghana, randomResult(true),true));
        grupoH.addPartido(new Partido(createRandomDate(), corea, ghana, randomResult(true),true));
        grupoH.addPartido(new Partido(createRandomDate(), portugal, uruguay, randomResult(true),true));
        grupoH.addPartido(new Partido(createRandomDate(), corea, portugal, randomResult(true),true));
        grupoH.addPartido(new Partido(createRandomDate(), ghana, uruguay, randomResult(true),true));
        grupos.add(grupoH);

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
        for (int i = 0; i < grupos.size() - 1; i+= 2) {
            octavos.addPartido(new Partido(createRandomDate(), grupos.get(i).getEquiposQueAvanzan().get(0), grupos.get(i+1).getEquiposQueAvanzan().get(1), randomResult(false), false));
        }
        for (int i = 1; i < grupos.size(); i+= 2) {
            octavos.addPartido(new Partido(createRandomDate(), grupos.get(i).getEquiposQueAvanzan().get(0), grupos.get(i-1).getEquiposQueAvanzan().get(1), randomResult(false),false));
        }
        octavos.mostrarEtapa();
        System.out.println();

        Llave cuartos = new Llave("Cuartos");
        for (int i = 0; i < octavos.getEquiposQueAvanzan().size() - 1; i+= 2) {
           cuartos.addPartido(new Partido(createRandomDate(), octavos.getEquiposQueAvanzan().get(i), octavos.getEquiposQueAvanzan().get(i+1), randomResult(false),false));
        }
        cuartos.mostrarEtapa();
        System.out.println();
        
        Llave semifinales = new Llave("Semifinales");
        for (int i = 0; i < cuartos.getEquiposQueAvanzan().size() - 1; i+= 2) {
            semifinales.addPartido(new Partido(createRandomDate(), cuartos.getEquiposQueAvanzan().get(i), cuartos.getEquiposQueAvanzan().get(i+1), randomResult(false),false));
        }
        semifinales.mostrarEtapa();
        System.out.println();
       
        Llave finales = new Llave("Final");
        finales.addPartido(new Partido(createRandomDate(), semifinales.getEquiposQueAvanzan().get(0), semifinales.getEquiposQueAvanzan().get(1), randomResult(false),false));
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