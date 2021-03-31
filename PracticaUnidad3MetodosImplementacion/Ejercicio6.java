
/**
 * Este ejercicio intercambia el contenido de las variables.
 *
 * @author (CarlaY)
 * @version (1.0)
 */
public class Ejercicio6
{
    public String intercambiarVar(int a, int b, int c){
        int aux;
        aux=a;
        a=b;
        b=aux;
        
        aux=a;
        a=c;
        c=aux;
        return ""+ a+ b+ c+"";
    }
}
