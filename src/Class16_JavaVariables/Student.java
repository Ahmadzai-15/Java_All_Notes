package Class16_JavaVariables;

public class Student {
   /* Create a Class called Students
    Create three  variables  Name , ID  and  numberOfStudents
    Create three objects of the Students Class
    Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    Print out  total number of students*/
    String name;
    String ID;
    static int numberOfStuedent;


    public static void main(String[] args) {
        Student st=new Student();
        st.name="John";
        st.ID="A-33";



        Student st1=new Student();
        st1.name="John2";
        st1.ID="A-33";


        Student st3=new Student();
        st3.name="John3";
        st3.ID="A-33";
        st3.numberOfStuedent++;

        System.out.println(st3.name +" "+st3.ID+" "+st3.numberOfStuedent);



    }
}
