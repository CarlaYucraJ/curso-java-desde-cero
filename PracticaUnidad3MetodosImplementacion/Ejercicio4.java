
/**
 * Este programa calcula la cantidad de hojas que se necesitan para
 * poder imprimir N paginas.
 *
 * @author (CarlaY)
 * @version (1.0) */
public class Ejercicio4
{
    public int numeroPaginas(int paginas){
        int cantidadHojas;
        cantidadHojas=(paginas/2)+(paginas%2);
        return cantidadHojas;
    }
}
