public class ControlFlowExercises {
    public static void main(String[] args) {
        //        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15

//
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(""+i+" ");
//        i++;
//        }
        //        Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//
//        int deuces = 0;
//        do {
//            System.out.println(deuces);
//            deuces+=2;
//        } while (deuces <= 100);

//
//        Alter your loop to count backwards by 5's from 100 to -10.
//        int iGotFiveOnIt = 100;
//
//        do {
//            System.out.println(iGotFiveOnIt);
//
//            iGotFiveOnIt -= 5;
//
//        } while (iGotFiveOnIt <= 100);


//        long squareInt = 2;
//        do {
//            System.out.println(squareInt);
//
//            squareInt *= squareInt;
//
//        } while (squareInt < 1000000);
//
//    }


//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
//        2
//        4
//        16
//        256
//        65536
//        For


//        Refactor the previous two exercises to use a for loop instead.
//        Fizzbuzz
//
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.
//        Display a table of powers.
        for (int i = 1; i <= 100; i++) {

//            boolean divisibleBy3 = (i % 3 == 0);

//            boolean divisibleBy5 = (i % 5 == 0);




            if (i % 3 == 0) {
                 System.out.println("Fizz");
            }  else if  (i % 5 == 0) {
                System.out.println("BuzzKill");
            }else{

            }

            System.out.println(i);

        }
    }
}



//        if (numAnsStr.equals("")) {
//            // Not divisible by 3 or 5, add the number
//            numAnsStr += Integer.toString(num);
//        }
//
//
//    }
//
//        return ans;
//}

//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output
//
//
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//        number | squared | cubed
//        ------ | ------- | -----
//        1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125
//        Convert given number grades into letter grades.
//
//        Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//        Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0
//        Bonus
//
//        Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).
