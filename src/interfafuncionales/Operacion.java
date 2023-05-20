package interfafuncionales;

/*
  -Introducido en Java 8 para denominar a las interfaces que
  disponen de un único método abstracto.
  -Se pueden crear implementaciones de estas interfaces a través
  de expresiones lamba.
  -Pueden o no estar definidas con la notación @FunctionalInterface 
  es opcional, pero es una buena práctica utilizarla para que el 
  compilador verifique que la interfaz tiene un solo método 
  abstracto.
 */

@FunctionalInterface
public interface Operacion {
  public int aplicar(int numero);
}
