package interfpolimorfismo;

public class Main {
	/*
	 Demuestra el polimorfismo basado en la interfaz Animal.
	 Se opera sobre un objeto de cualquier clase que implementa
	 la interfaz.
	 */

	public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.makeSound(); // Imprime "Meow!"
        animal2.makeSound(); // Imprime "Woof!"
	}

}
