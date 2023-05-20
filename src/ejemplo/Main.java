package ejemplo;

public class Main {

	public static void main(String[] args) {
		PartidoFutbol partido1 = new PartidoFutbol("Real Madrid", "Barcelona");
		System.out.println(partido1.golesEquipoLocal());
		System.out.println(partido1.golesEquipoVisitante());
		System.out.println(partido1.obtenerResultado());
		EstadisticasPartido partido2 = new PartidoFutbol("Bolivar", "The Strongest");
		System.out.println(partido2.obtenerResultado());
	}

}
