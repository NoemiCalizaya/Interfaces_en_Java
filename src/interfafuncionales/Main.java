package interfafuncionales;

public class Main {

	public static void main(String[] args) {
		Operacion suma = (a) -> a + 5; // Expresión lambda para sumar 5 a un número
		Operacion resta = (a) -> a - 3; // Expresión lambda para restar 3 a un número
		Operacion multiplicacion = (a) -> a * 2; // Expresión lambda para multiplicar un número por 2
		Operacion division = (a) -> a / 4; // Expresión lambda para dividir un número por 4

		Calculadora miCalculadora = new Calculadora();

		int resultadoSuma = miCalculadora.calcular(10, suma); // Devuelve 15
		int resultadoResta = miCalculadora.calcular(10, resta); // Devuelve 7
		int resultadoMultiplicacion = miCalculadora.calcular(10, multiplicacion); // Devuelve 20
		int resultadoDivision = miCalculadora.calcular(10, division); // Devuelve 2
		
		System.out.println(resultadoSuma);
		
	}
}
