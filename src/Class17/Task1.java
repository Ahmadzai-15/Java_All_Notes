package Class17;

public class Task1 {


    String name;
    int age;
    int salary;
    Task1(String tName, int tAge, int tSalary){

        name=tName;
        age=tAge;
        salary=tSalary;
    }
    void printInfo(){
        System.out.println("Name: "+name+" Age: "+age+ " Salaray: "+salary);
    }

    public static void main(String[] args) {

        Task1 task=new Task1("Selab",23,30000);
        task.printInfo();


    }


}
