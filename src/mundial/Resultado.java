package mundial;

public class Resultado {
    private int golesLocal;
    private int golesVisitante;

    public Resultado(int golesLocal, int golesVisitante){
        setGolesLocal(golesLocal);
        setGolesVisitante(golesVisitante);
    }

    public boolean ganoLocal(){
        return golesLocal > golesVisitante;
    }

    public boolean empate(){
        return golesLocal == golesVisitante;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = 0;
        if(golesVisitante >=0){
            this.golesVisitante = golesVisitante;
        }
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = 0;
        if(golesLocal >= 0){
            this.golesLocal = golesLocal;
        }
    }
}
