package grades;

import java.util.ArrayList;

//      Student class is my template for the objects that will be created
//      Within my class I have fields which can be properties(variables)
//      or methods.

public class Student {

    //private field which is a properties

    private String studentsName;

    private ArrayList<Integer> studentsGrades;


//      ArrayList is a class that represents an array that can change its
//      size. All elements in an ArrayList must be objects
//      and they must have the same type. It handles the details
//      of resizing the array to add elements for you


//    Constructor is a special method that is called
//    when an object is created. Constructor has the same name
//    as the class and does not define a return type. It can
//    also accept arguments and be overloaded

    public Student(String studentsName) {

        this.studentsName = studentsName;

//        We are initializing the studentsGrade property to an empty
//        ArrayList

        this.studentsGrades = new ArrayList<>();


    }

//     creating a method that will return the student's name

    public String getName() {

        return this.studentsName;
    }

//     adds the given grade to the grades property
//    The return type is void when the method does not return
//    a value.

    public void addGrade(int grade) {

        studentsGrades.add(grade);

    }

    //     returns the average of the students grades
//
    public double getGradeAverage() {

        int assignments = 0;

        for (int i = 0; i < studentsGrades.size(); i++) {

//      This will get the grade out of the loop
//      and add it to the next grade that it loops though
//      once we loops though all the grades and add them all
//      together, we re-assign the sum of the assignments
            assignments = studentsGrades.get(i) + assignments;
        }


        //this will return my assignments divided by the students arrayList of grades.
        return assignments / studentsGrades.size();
    }


    public static void main(String[] args) {


        Student Oshea = new Student("OShea");

        Oshea.addGrade(75);
        Oshea.addGrade(89);
        Oshea.addGrade(63);

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


        System.out.println(Oshea.studentsName);
        System.out.println(Oshea.studentsGrades);
        System.out.println(Oshea.getGradeAverage());





    }
}
