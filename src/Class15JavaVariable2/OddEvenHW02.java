package Class15JavaVariable2;

public class OddEvenHW02 {
    //2) Create a method that will take a number and prints whether the number is even or odd.

    String numbers(int num ){
        if(num%2==0){
            return num+" is even number ";
        }else {
            return num+" Is Odd Number";
        }
    }

    public static void main(String[] args) {
        OddEvenHW02 odd=new OddEvenHW02();

        System.out.println(odd.numbers(44));



    }

}
