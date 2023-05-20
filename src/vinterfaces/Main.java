package vinterfaces;

public class Main {

	public static void main(String[] args) {
		// Uso de la clase Shape que implementa ambas interfaces
		Shape shape = new Shape(10, 20, "red");
		shape.draw(); // Dibuja una forma roja en (10, 20)
		shape.move(15, 25); // Mueve la forma a (15, 25)
		shape.draw(); // Dibuja una forma roja en (15, 25)
	}

}
