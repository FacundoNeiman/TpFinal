package garage;

import java.util.ArrayList;

public class Garage {
    private double precioCambioRueda;
    private int capacidadMaxima;
    private ArrayList<Vehiculo> vehiculos;

    public Garage(double precioCambioRueda, int capacidadMaxima){
        this.vehiculos = new ArrayList<>();
        setCapacidadMaxima(capacidadMaxima);
        setPrecioCambioRueda(precioCambioRueda);
    }

    public Garage(){
        this.vehiculos = new ArrayList<>();
    }

    public void abrirGarage(double precio, int capacidadMaxima){

    }

    public boolean registrarVehiculo(Vehiculo vehiculo){
        return false;
    }

    public boolean retirarVehiculo(Vehiculo vehiculo){
        return false;
    }

    public int getCantidadVehiculos(){
        return this.vehiculos.size();
    }

    public double getPrecioTotalCambioRueda() {
        return 0;
    }

    public double getKilometrajeMedio(){
        return 0;
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
