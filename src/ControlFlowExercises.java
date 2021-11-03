
import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
        //        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:

//        5 6 7 8 9 10 11 12 13 14 15


//        int i = 5;
//        while (i <= 15) {
//            System.out.print(""+i+" ");
//        i++;
//        }
        //        Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//        int deuces = 0;
//        do {
//            System.out.println(deuces);
//            deuces+=2;
//        } while (deuces <= 100);


//        Alter your loop to count backwards by 5's from 100 to -10.
//        int iGotFiveOnIt = 100;
//
//        do {
//            System.out.println(iGotFiveOnIt);
//
//            iGotFiveOnIt -= 5;
//
//        } while (iGotFiveOnIt >= -10);
//

//        long squareInt = 2;
//        do {
//            System.out.println(squareInt);
//
//            squareInt *= squareInt;
//
//        } while (squareInt <= 1000000);


//        Refactor the previous two exercises to use a for loop instead.

//            for (int i = 100; i >= -10; i -= 5) {
//
//                System.out.println(i);
//
//            }

//            for(long i = 2; i <= 1000000; i*=i){
//                System.out.println(i);
//            }

//        Fizzbuzz

//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.
//        Display a table of powers.
//        for (int i = 1; i <= 100; i++) {
//
//            boolean divisibleBy3 = (i % 3 == 0);
//
//            boolean divisibleBy5 = (i % 5 == 0);
//
//            if (divisibleBy3 && divisibleBy5) {
//                System.out.println("BuzzKill");
//            } else if (divisibleBy3) {
//                System.out.println("Fizz");
//            } else if (divisibleBy5) {
//                System.out.println("Buzz");
//            } else {
//
//                System.out.println(i);
//
//            }
//        }


//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter a number please ");
//
//        int userInput = sc.nextInt();
//
//        System.out.println("Here is your table!");

//        System.out.println("number | squared | cubed");
//
//        System.out.println("------ | ------- | -----");
//
//        for (int i = 1; i <= userInput; i++){
//// Setting a minimum field width using the %NUMd. d for digit.
////    acts like padding. if you want to align left use the negative sign.
//
//            System.out.printf( "%-6d | %-7d | %-5d\n", i, i*i, i*i*i);
//        }


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




    }
}