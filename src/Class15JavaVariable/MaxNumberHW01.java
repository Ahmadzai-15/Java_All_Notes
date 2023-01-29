package Class15JavaVariable;

public class HW_MaxNumber {

    //1) Create a method that will take 2 parameters as a numbers and prints which number is larger.

    int maxNumber(int num1, int num2){
        if(num1>num2){
            return num1;
        }else {
            return num2;
        }
    }

    public static void main(String[] args) {

        HW_MaxNumber hw=new HW_MaxNumber();
        System.out.println(hw.maxNumber(44,55));
    }
}
