package ejemplo;

public class PartidoFutbol extends Partido implements EstadisticasPartido {
    
    public PartidoFutbol(String equipoLocal, String equipoVisitante) {
        super(equipoLocal, equipoVisitante);
    }
    
    @Override
    public int golesEquipoLocal() {
        return golesLocal;
    }
    
    @Override
    public int golesEquipoVisitante() {
        return golesVisitante;
    }
    
    @Override
    public int tarjetasEquipoLocal() {
        return tarjetasLocal;
    }
    
    @Override
    public int tarjetasEquipoVisitante() {
        return tarjetasVisitante;
    }
    
    @Override
    public String obtenerResultado() {
        if (golesLocal > golesVisitante) {
            return equipoLocal + " ganó";
        } else if (golesVisitante > golesLocal) {
            return equipoVisitante + " ganó";
        } else {
            return "Empate";
        }
    }
}

