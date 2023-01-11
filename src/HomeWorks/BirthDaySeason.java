package HomeWorks;
import java.util.Scanner;
public class BirthDaySeason {
    public static void main(String[] args) {
/*
        4)Write a program for user to enter his/hers birth month. Based on the month define
        the season.
        Example: if user is born in June, July or August → season =”Summer”.
        At the end of the program we should see output as “You were born __”. (edited)
                [2:59 PM]*/
    Scanner scan=new Scanner(System.in);
        System.out.println("Enter your Brith Month: ");
        String season=scan.next();



        if(season.equalsIgnoreCase("December")||season.equalsIgnoreCase("January")||season.equalsIgnoreCase("february")){
            season="Winter";
        }else if(season.equalsIgnoreCase("March")|| season.equalsIgnoreCase("April")|| season.equalsIgnoreCase("May")){
            season="Spring";
        }else if(season.equalsIgnoreCase("June")|| season.equalsIgnoreCase("July")|| season.equalsIgnoreCase("August")){
            season="Summer";
        }else if(season.equalsIgnoreCase("September")||season.equalsIgnoreCase("October")|| season.equalsIgnoreCase("November")){
            season="Fall";
        }else{
            System.out.println("Invalid attempt");
        } System.out.println("YOu are born in "+season);



    }
}
