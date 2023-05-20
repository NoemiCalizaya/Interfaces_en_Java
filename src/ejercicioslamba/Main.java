package ejercicioslamba;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//Filtrar números pares
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		numeros.stream()
		       .filter(numero -> numero % 2 == 0)
		       .forEach(System.out::println);

		//Filtrar cadenas que empiezan con una letra determinada
		List<String> palabras = Arrays.asList("manzana", "banana", "pera", "uva", "naranja");
		palabras.stream()
		        .filter(palabra -> palabra.startsWith("p"))
		        .forEach(System.out::println);
		
		//Transformar una lista de cadenas en mayúsculas
		List<String> palabras1 = Arrays.asList("manzana", "banana", "pera", "uva", "naranja");
		palabras1.stream()
		        .map(String::toUpperCase)
		        .forEach(System.out::println);
		
		//Reducir una lista de números a su suma
		List<Integer> numeros1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int suma = numeros1.stream()
		                  .reduce(0, (a, b) -> a + b);
		System.out.println(suma);
		
		//Ordenar una lista de cadenas alfabéticamente
		List<String> palabras2 = Arrays.asList("manzana", "banana", "pera", "uva", "naranja");
		palabras2.stream()
		        .sorted()
		        .forEach(System.out::println);
	}

}
