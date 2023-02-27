package Class30_Map;

import java.util.Map;
import java.util.TreeMap;

public class MapsDemo9 {
    public static void main(String[] args) {

        /*Create a map of countries with its capital that will store countries in alphabetical order.
        Print all keys and values from a country map using for each loop and iterator.
        Print all values from a country map using for each loop and iterator.*/

        Map<String, String> countries = new TreeMap<>();

        countries.put("Afghanistan", "Kabul");
        countries.put("USA", "Washington DC");
        countries.put("France", "Paris");
        countries.put("Turkey", "Ancra");
        countries.put("India", "Delhi");
        System.out.println(countries);

        

    }
}
