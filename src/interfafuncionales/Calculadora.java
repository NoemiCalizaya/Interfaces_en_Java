package interfafuncionales;

public class Calculadora {
	public int calcular(int numero, Operacion operacion) {
	  return operacion.aplicar(numero);
	}
}
