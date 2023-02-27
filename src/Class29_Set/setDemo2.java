package Class29_Set;

import java.util.LinkedHashSet;

public class setDemo2 {
    public static void main(String[] args) {

        //Does not allow duplication and retains the insertion order
        LinkedHashSet<String>fruit=new LinkedHashSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Apple");
        fruit.add("Mango");
        System.out.println(fruit);
    }
}
