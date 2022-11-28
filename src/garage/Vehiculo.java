package garage;

public abstract class Vehiculo {
    private String patente;
    private String marca;
    private String modelo;
    private int cantRuedas;
    private double kilometraje;

    public Vehiculo(String patente, String marca, String modelo, int cantRuedas, double kilometraje){
        setCantRuedas(cantRuedas);
        setKilometraje(kilometraje);
        setMarca(marca);
        setModelo(modelo);
        setPatente(patente);
    }

    public Vehiculo(){

    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }
}
