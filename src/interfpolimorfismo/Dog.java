package interfpolimorfismo;

public class Dog implements Animal{
	
	@Override
	public void makeSound() {
        System.out.println("Woof!");
    }
}