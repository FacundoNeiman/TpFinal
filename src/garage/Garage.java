package garage;

import java.util.ArrayList;

public class Garage {
    private double precioCambioRueda;
    private int capacidadMaxima;
    private ArrayList<Vehiculo> vehiculos;

    public Garage(double precioCambioRueda, int capacidadMaxima){
        this.vehiculos = new ArrayList<>();
        abrirGarage(precioCambioRueda,capacidadMaxima);
    }

    public Garage(){
        this.vehiculos = new ArrayList<>();
    }

    public void abrirGarage(double precioCambioRueda, int capacidadMaxima){
        setCapacidadMaxima(capacidadMaxima);
        setPrecioCambioRueda(precioCambioRueda);
    }

    public boolean registrarVehiculo(Vehiculo vehiculo){
        if (this.vehiculos.size() < getCantidadVehiculos()) {
            this.vehiculos.add(vehiculo);
            System.out.println("Vehículo añadido exitosamente!");
            return true;
        }
        else{
            System.out.println("No se ha podido añadir al vehiculo. Garage lleno");
            return false;
        }
    }

    public void retirarVehiculo(Vehiculo vehiculo){
        this.vehiculos.remove(vehiculo);
    }

    public int getCantidadVehiculos(){
        return this.vehiculos.size();
    }

    public double getPrecioTotalCambioRueda() {
        double acumPrecio = 0;
        for (Vehiculo vehiculo: this.vehiculos) {
            acumPrecio += (vehiculo.getCantRuedas() * getPrecioCambioRueda());
        }
        return acumPrecio;
    }

    public double getKilometrajeMedio(){
        double acumKilometraje = 0;
        for (Vehiculo vehiculo: this.vehiculos) {
            acumKilometraje += vehiculo.getKilometraje();
        }
        return acumKilometraje / this.vehiculos.size();
    }

    public double getPrecioCambioRueda() {
        return precioCambioRueda;
    }

    public void setPrecioCambioRueda(double precioCambioRueda) {
        this.precioCambioRueda = precioCambioRueda;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
}
