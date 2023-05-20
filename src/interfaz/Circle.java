package interfaz;

//Implementación de la interfaz en una clase llamada Circle
/*Una clase que implementa una interfaz está obligada a Sobreescribir, 
 Implementar, los métodos de la 
misma*/
public class Circle implements Shape{
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	/*Al implementar los metodos en la clase, es obligatorio indicar 
	el modificador public*/
	// Implementación del método getArea() definido en la interfaz Shape
	@Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Implementación del método getPerimeter() definido en la interfaz Shape
	@Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    // Uso de la interfaz Shape en un método que acepta un objeto Shape
    public static void printShapeInfo(Shape shape) {
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());
    }
    
}
