package Class12;

public class ClassDemo8Interview {
    public static void main(String[] args) {

        String str="Java is love";
        char character=str.charAt(2);
    /*    System.out.println(character);
        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i));
        }
*/
        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'){
                counter++;
            }
        }
        System.out.println(counter);
    }
}






