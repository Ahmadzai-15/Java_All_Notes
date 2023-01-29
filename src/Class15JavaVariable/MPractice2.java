package Class15JavaVariable;

public class MethodPractice2 {

    //create a method that taeks a Sting reverse it and return the reversed String
    //call the method reverse.

    //Hard Code== 1-return String 2-String 3-reverseStr
    String reverseStr(String input){
        String newStr="";
        for (int i =input.length()-1; i >=0; i--) {
            newStr+=input.charAt(i);
        }
        return newStr;
    }
    public static void main(String[] args) {
        MethodPractice2 task2=new MethodPractice2();
        System.out.println(task2.reverseStr("AFGHANISTAN"));


    }
}
