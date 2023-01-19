package Class11_OOP;

public class CatTester {
    public static void main(String[] args) {
        //Creating an object from a cat class
        Cat cat1=new Cat();
        cat1.eat();



        Cat cat2=new Cat();

        cat2.name="Loki";
        cat2.breed="Domestic";
        cat2.color="white";
        cat1.speak();
        cat1.age();
    }

}
