package defaulmetestatic;

public interface Calculadora {
	int sumar(int a, int b);
    int restar(int a, int b);
    int multiplicar(int a, int b);
    int dividir(int a, int b);
    
    public static int elevarAlCuadrado(int a) {
        return a * a;
    }
    
    public default int calcularFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo");
        }
        return calcularFactorialRecursivo(n);
    }

    private int calcularFactorialRecursivo(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFactorialRecursivo(n - 1);
        }
    }
}
