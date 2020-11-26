package collections;
import java.util.ArrayList;

public class ArrayListDemo {
     public static void  main(String[]args ){

         ArrayList<String> cars = new ArrayList<String>();
         ArrayList<Integer> myNumbers = new ArrayList<Integer>();
         cars.add("Volvo");
         cars.add("BMW");
         cars.add("Ford");
         cars.add("Mazda");
         cars.set(0,"Opel");
         cars.remove(0);

         System.out.println(cars);

         System.out.println(cars.get(0));
         System.out.println(cars.size());



         // cars.clear();

         for (int i=0; i< cars.size();i++){

             System.out.println(cars.get(i));


         }
         for (String car : cars){
             System.out.println(cars);

         }

         myNumbers.add(10);
         myNumbers.add(15);
         myNumbers.add(20);
         myNumbers.add(25);

         for (int i : myNumbers) {
             System.out.println(i);

         }
     }
}
