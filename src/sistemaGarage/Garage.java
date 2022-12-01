package sistemaGarage;

import sistemaGarage.vehiculos.Vehiculo;

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
        if(existe(vehiculo)){
            System.out.println("El vehículo ya se encuentra en el garage");
            return false;
        }
        if(!hayEspacio()){
            System.out.println("No se ha podido añadir al vehiculo. Garage lleno");
            return false;
        }
            this.vehiculos.add(vehiculo);
            System.out.println("Vehículo añadido exitosamente!");
            return true;
    }

    private boolean hayEspacio(){
        return getCantidadVehiculos() < getCapacidadMaxima();
    }

    private boolean existe(Vehiculo vehiculo){
        int i = 0;
        boolean existe = false;
        while(!existe && i < this.getCantidadVehiculos()){
            if(this.getVehiculos().get(i) == vehiculo){
                existe = true;
            }
            i++;
        }

        return existe;
    }

    public void retirarVehiculo(Vehiculo vehiculo){
        if(existe(vehiculo)){
        this.vehiculos.remove(vehiculo);
        }
        else{
            System.out.println("El vehículo: " + vehiculo.getPatente() + " no se encuentra en el garage");
        }
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

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "precioCambioRueda=" + precioCambioRueda +
                ", capacidadMaxima=" + capacidadMaxima +
                ", vehiculos=" + vehiculos +
                '}';
    }
}
