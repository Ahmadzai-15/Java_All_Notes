package Class29_Set;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {



        ArrayList<Dog> dog=new ArrayList<>();
        dog.add(new Dog("Jeky","Persian",2));
        dog.add(new Dog("keki","German",2));
        dog.add(new Dog("toto","Bulldog",2));
        dog.add(new Dog("Nami","USA",2));

        for(Dog d:dog){
            d.printDogName();
        }
    }
}
