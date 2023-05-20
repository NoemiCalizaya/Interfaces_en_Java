package ejemplo;

public class Partido {
	protected String equipoLocal;
    protected String equipoVisitante;
    protected int golesLocal;
    protected int golesVisitante;
    protected int tarjetasLocal;
    protected int tarjetasVisitante;
    
    public Partido(String equipoLocal, String equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesLocal = 0;
        this.golesVisitante = 0;
        this.tarjetasLocal = 0;
        this.tarjetasVisitante = 0;
    }
    
    public void registrarGolLocal() {
        golesLocal++;
        System.out.println(golesLocal);
    }
    
    public void registrarGolVisitante() {
        golesVisitante++;
        System.out.println(golesVisitante);
    }
    
    public void registrarTarjetaLocal() {
        tarjetasLocal++;
    }
    
    public void registrarTarjetaVisitante() {
        tarjetasVisitante++;
    }
    
    @Override
    public String toString() {
    	return "";
    }
}
