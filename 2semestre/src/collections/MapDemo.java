package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England","Lodon");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("Norway","Osla");
        capitalCities.put("USA","Washington");
        System.out.println(capitalCities.get("England"));
        System.out.println(capitalCities.size());
        //capitalCities.remove("England");
        //capitalCities.clear();

        for (String i : capitalCities.keySet()){

            System.out.println();
        }
      for (String i : capitalCities.values()){

          System.out.println();
      }
      for (String i: capitalCities.keySet()){
          System.out.println("key:"+ i + "value:"+ capitalCities.get(i));

      }
    }
}
