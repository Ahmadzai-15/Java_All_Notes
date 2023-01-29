package Class15JavaVariable;

public class MethodPracticeTask {

    //create a method that return to true  or false and take  the int numbners as a ppratamer  if number is
    //even it return true ohterwise is returnes false
    boolean isEven(int numbers){
        boolean flag;
        if(numbers%2!=0){
            flag=true;
        }else {
            flag=false;
        }
        return flag;
    }

    public static void main(String[] args) {

        MethodPracticeTask mp=new MethodPracticeTask();

        boolean isEven=mp.isEven(100);
        System.out.println(isEven);
        System.out.println(mp.isEven(12));
        System.out.println(mp.isEven(20));
    }
}





