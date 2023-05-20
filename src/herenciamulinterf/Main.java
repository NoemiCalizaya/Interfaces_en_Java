package herenciamulinterf;

public class Main {

	public static void main(String[] args) {
		Button button = new MyButton(); //Polimorfismo
        button.setText("Click me!");
        button.draw();
        button.click();
	}

}
