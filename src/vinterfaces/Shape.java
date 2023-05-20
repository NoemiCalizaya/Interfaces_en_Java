package vinterfaces;

//Implementación de las interfaces en una clase llamada Shape
/*
 Una clase puede implementar varias interfaces.
 */
public class Shape implements Movable, Drawable {
	private int x;
    private int y;
    private String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    // Implementación del método move() definido en la interfaz Movable
    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Implementación del método draw() definido en la interfaz Drawable
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " shape at (" + x + ", " + y + ")");
    }
}
