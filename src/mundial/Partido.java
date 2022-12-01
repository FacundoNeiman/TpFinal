package mundial;

import java.util.Date;

public class Partido {
    private Date fecha;
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;

    public Partido(Date fecha, Equipo local, Equipo visitante, Resultado resultado, boolean faseDeGrupos){
        setFecha(fecha);
        setLocal(local);
        setVisitante(visitante);
        setResultado(resultado,faseDeGrupos);
    }

    public Partido(){}

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado, boolean faseDeGrupos) {
        this.resultado = resultado;
        if(faseDeGrupos) {
            if (resultado.ganoLocal()) {
                getLocal().addPuntaje(3);
            } else if (resultado.empate()) {
                getLocal().addPuntaje(1);
                getVisitante().addPuntaje(1);
            } else {
                getVisitante().addPuntaje(3);
            }
        }
    }

    @Override
    public String toString() {
        return this.getLocal().getNombre() + " " + this.getResultado() + " " + this.getVisitante().getNombre();
    }
    
    
}
