package sistemaGarage.vehiculos;

public class Coche extends Vehiculo{
    private int cantPuertas;

    public Coche(){
        super();
    }

    public Coche(String patente, String marca, String modelo, int cantRuedas, double kilometraje, int cantPuertas){
        super(patente,marca,modelo,cantRuedas,kilometraje);
        setCantPuertas(cantPuertas);
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "cantPuertas=" + cantPuertas +
                '}';
    }
}
