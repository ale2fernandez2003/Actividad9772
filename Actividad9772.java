import java.util.ArrayList;

/**
 * Write a description of class Actividad9772 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Actividad9772
{
    private ArrayList<String> contador;

    /**
     * Constructor for objects of class Actividad9772
     */
    public Actividad9772()
    {
        contador = new ArrayList();
    }

   
    public int cuantasPalabrasHayDeNLetras(ArrayList<String> palabras, int numero){
        int count = 0;
        
        for (String palabra : palabras) {
            if (palabra.length() == numero) {
                count++;
            }
        }
        
        return count;
    }
}
