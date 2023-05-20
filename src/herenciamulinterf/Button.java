package herenciamulinterf;
/*Una interfaz puede heredar una o varias interfaces*/
public interface Button extends Drawable, Clickable{
	void setText(String text);
}
