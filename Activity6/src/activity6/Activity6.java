
package activity6;

/*Actividad 6 – Índice con HashMap
Dado un ArrayList<String> words, construya un HashMap<String,Integer>con frecuencias.
Imprima las claves y sus conteos.
Si una palabra aparece más de 2 veces, márquela con “*” al imprimir.
 */
import java.util.ArrayList;
import java.util.HashMap;
public class Activity6 {

    public static void main(String[] args) {
      ArrayList<String> a = new ArrayList();
      HashMap<String, Integer> frequencies = new HashMap<>();
      a.add("hola");
      a.add("hola");
      a.add("hola");
      a.add("hello");
      a.add("hello");
      a.add("adios");
      
      for (String s : a)
      {
       frequencies.put(s, frequencies.getOrDefault(s,0)+1);
      }
      
        System.out.println(frequencies.toString());
      
      
      }
      
  }
    

