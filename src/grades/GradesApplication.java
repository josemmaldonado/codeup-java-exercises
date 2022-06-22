package grades;

import java.util.HashMap;
import java.util.Scanner;



public class GradesApplication {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean confirm;


//        hash map is a data structure for key-value pairs, implemented
//        with the HashMap class. All keys must be of the same type
//        and all the values must be of the same type.
//        The keys and values don't have to be the same type.

        HashMap<String, Student> students = new HashMap<>();

        Student OShea = new Student("OShea");

        OShea.addGrade(75);
        OShea.addGrade(89);
        OShea.addGrade(63);

        Student Ye = new Student("Ye");

        Ye.addGrade(77);
        Ye.addGrade(83);
        Ye.addGrade(95);

        Student Kweli = new Student("Kweli");

        Kweli.addGrade(91);
        Kweli.addGrade(90);
        Kweli.addGrade(94);

        Student Dante = new Student("Dante");

        Dante.addGrade(78);
        Dante.addGrade(71);
        Dante.addGrade(73);

        students.put("ice_cube", OShea);

        students.put("Kanye_West", Ye);

        students.put("Kweli_Talib", Kweli);

        students.put("Mos_Def", Dante);


        System.out.println("Welcome!!\n");

        System.out.println("Here are the GitHub usernames of our students: \n");

        System.out.println("| " + students);

        do {
            System.out.println("What student would you like to see more information on?");

            String userInput = sc.nextLine();

            if (userInput.equals("ice_cube")) {

                System.out.println("Name: " + OShea.getName() + " GitHub Username: " + userInput);

                System.out.println("Current Average: " + OShea.getGradeAverage());

            } else if (userInput.equals("Kanye_West")) {

                System.out.println("Name: "+ Ye.getName() + " GitHub Username: "+ userInput);

                System.out.println("Current average: "+ Ye.getGradeAverage());

            } else if (userInput.equals("Kweli_Talib")) {

                System.out.println("Name: "+ Kweli.getName()+ " GitHub Username: "+userInput);

                System.out.println("Current average: "+ Kweli.getGradeAverage());

            } else if (userInput.equals("Mos_Def")) {

                System.out.println("Name: " + Dante.getName()+ " GitHub Username: "+ userInput);

                System.out.println("Curren Average: "+ Dante.getGradeAverage());
            } else {
            }



                System.out.println("Would you like to see another student?" +
                    "");
            confirm = sc.next().equalsIgnoreCase("y");

        }
        while(confirm);


        System.out.println("Holla at ya boy!!");






    }

}
