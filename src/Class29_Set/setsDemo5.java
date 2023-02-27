package Class29_Set;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class setsDemo5 {
    public static void main(String[] args) {

        ArrayList<Integer>number=new ArrayList<>();
        number.add(10);
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(30);
        System.out.println(number);

        LinkedHashSet<Integer> uniqeNumber=new LinkedHashSet<>(number);
        System.out.println(uniqeNumber);




    }
}
