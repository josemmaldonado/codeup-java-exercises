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


//        Student student1 = new Student("OShea");
//
//        student1.addGrade(75);
//        student1.addGrade(89);
//        student1.addGrade(63);
//
//        Student student2 = new Student("Ye");
//
//        student2.addGrade(77);
//        student2.addGrade(83);
//        student2.addGrade(95);
//
//        Student student3 = new Student("Kweli");
//
//        student3.addGrade(91);
//        student3.addGrade(90);
//        student3.addGrade(94);
//
//        Student student4 = new Student("Dante");
//
//        student4.addGrade(78);
//        student4.addGrade(71);
//        student4.addGrade(73);

//
//        System.out.println(student1.studentsName);
//        System.out.println(student1.studentsGrades);
//        System.out.println(student1.getGradeAverage());





    }
}
