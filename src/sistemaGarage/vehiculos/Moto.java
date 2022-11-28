package sistemaGarage.vehiculos;

public class Moto extends Vehiculo{
    private int cilindrada;

    public Moto(){
        super();
    }

    public Moto(String patente, String marca, String modelo, int cantRuedas, double kilometraje, int cilindrada){
        super(patente,marca,modelo,cantRuedas,kilometraje);
        setCilindrada(cilindrada);
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
