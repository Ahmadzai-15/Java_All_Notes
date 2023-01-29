package Class15JavaVariable;

public class Task4 {

    //Create a method that will say Hello in different language based on the country that will
    // passed when method is executed

    String helloByCountry(String country){
        switch (country.toLowerCase()){
            case "usa":
                return "hello";

            case "spain":
                return "Hola";

            case "brazil":
                return "Ola";

            case "france":
                return "bonjour";

            default:
                return "country is unknown";
        }
    }

    public static void main(String[] args) {
        Task4 task4=new Task4();
        System.out.println(task4.helloByCountry("Spain"));
    }
}














