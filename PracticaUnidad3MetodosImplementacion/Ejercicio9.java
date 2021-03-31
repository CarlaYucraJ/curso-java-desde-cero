
/**
 * Este programa nos ayuda a saber cuantos seguidores mas podemos tener a parte 
 * de los que ya tenemos.
 *
 * @author (CarlaY)
 * @version (2.0)
 */
public class Ejercicio9
{
    public int calcularCantidadSeguidores(int seguidores, int seguidos ){
        int cantidad;
        cantidad=(seguidores*3)-seguidos;
        return cantidad;
    }
}
