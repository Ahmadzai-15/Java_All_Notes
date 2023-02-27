package Class29_Set;
import java.util.Iterator;
import java.util.ArrayList;

public class IteratorDemo1 {
    public static void main(String[] args) {

        ArrayList<Double>numbers=new ArrayList<>();

        numbers.add(10.0);
        numbers.add(15.2);
        numbers.add(20.0);
        numbers.add(30.5);
        numbers.add(40.5);
        numbers.add(10.5);

        //numbers.removeIf(number->number>11);      //Lamda Expression


        //Getting the object of iterator
      Iterator<Double> iterator= numbers.iterator();
      System.out.println( iterator.hasNext());
      //System.out.println( iterator.next());
     // System.out.println( iterator.next());
      ///System.out.println( iterator.hasNext());
     // System.out.println( iterator.next());
      System.out.println(numbers);
        // hasNext() keeps on returning true as long as there are elements left to be iterated
        while(iterator.hasNext()){
            double number=iterator.next();
            if(number>11){
                iterator.remove();
            }
        }



    }
}
