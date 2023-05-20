package defaulmetestatic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiCalculadora calculadora = new MiCalculadora();
		
		int a = 5;
        int b = 3;
        int resultadoSuma = calculadora.sumar(a, b);
        int resultadoResta = calculadora.restar(a, b);
        int resultadoMultiplicacion = calculadora.multiplicar(a, b);
        int resultadoDivision = calculadora.dividir(a, b);
        int resultadoCuadrado = Calculadora.elevarAlCuadrado(a);
        int resultadoFactorial = calculadora.calcularFactorial(b);

        System.out.println("Suma: " + resultadoSuma);
        System.out.println("Resta: " + resultadoResta);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);
        System.out.println("División: " + resultadoDivision);
        System.out.println("Cuadrado de " + a + ": " + resultadoCuadrado);
        System.out.println("Factorial de " + b + ": " + resultadoFactorial);
    }
}
