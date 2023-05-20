package herenciamulinterf;
/*La clase está obligada a implementar los métodos de la interfaz
  y de las interfaces que esta hereda.*/
public class MyButton implements Button{
	private String text;
	
	@Override
    public void setText(String text) {
        this.text = text;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing button with text: " + text);
    }

    @Override
    public void click() {
        System.out.println("Button clicked");
    }
}
