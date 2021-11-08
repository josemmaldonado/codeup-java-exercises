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

        Student student1 = new Student("OShea");

        student1.addGrade(75);
        student1.addGrade(89);
        student1.addGrade(63);

        Student student2 = new Student("Ye");

        student2.addGrade(77);
        student2.addGrade(83);
        student2.addGrade(60);

        Student student3 = new Student("Kweli");

        student3.addGrade(91);
        student3.addGrade(90);
        student3.addGrade(94);

        Student student4 = new Student("Dante");

        student4.addGrade(78);
        student4.addGrade(71);
        student4.addGrade(73);

        students.put("ice_cube", student1);

        students.put("Kanye_West", student2);

        students.put("Kweli_Talib", student3);

        students.put("Mos_Def", student4);


        System.out.println("Welcome!!\n");

        System.out.println("Here are the GitHub usernames of our students: \n");

        System.out.println("| " + students);

        do {
            System.out.println("What student would you like to see more information on?");

            String userInput = sc.nextLine();

            if (userInput.equals("ice_cube")) {

                System.out.println("Name: " + student1.getName() + "- GitHub Username: ");

                System.out.println("Current Average: ");

            } else if (userInput.equals("Kanye_West")) {

                System.out.println("Name: ");

                System.out.println("Current average: ");

            } else if (userInput.equals("Kweli_Talib")) {

                System.out.println("Name: ");

                System.out.println("Current average: ");

            } else if (userInput.equals("Mos_Def")) {

                System.out.println("Name: ");

                System.out.println("Curren Average: ");
            } else {
            }



                System.out.println("Would you like to see another student?" +
                    "");
            confirm = sc.next().equalsIgnoreCase("y");

        } while(confirm);


        System.out.println("Holla at ya boy!!");






    }

}
