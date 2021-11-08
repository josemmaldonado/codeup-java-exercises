package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {

        scanner = new Scanner(System.in);

    }

    String getString() {

        return this.scanner.nextLine();
    }


    boolean yesNo() {

        String userInput = scanner.next();

        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");

    }

    int getInt() {

//        return this.scanner.nextInt();

        return Integer.parseInt(getString());


    }

    int getInt(int min, int max) {

        int intInput = 0;

//        do {
//            System.out.printf("Please enter a whole number between %d and %d: ", min, max);
//
//            intInput = this.scanner.nextInt();
//
//        }while (intInput > max || intInput < min);

        try {

            System.out.printf("Please enter a whole number between %d and %d: ", min, max);

            intInput = Integer.parseInt(getString());

            System.out.println("Okay, " + intInput + " is a great choice.");

        } catch (NumberFormatException e) {

            System.out.println("Uh oh, something went wrong: " + e.getMessage());

            System.out.println("Here is some more detail:");

            e.printStackTrace();
        }

        return intInput;

    }

    double getDouble() {

//        return this.scanner.nextDouble();

            return Double.parseDouble(getString());

//            return Integer.valueOf(getString());

    }

    double getDouble(double min, double max) {

        Double dubInput = 00.00;

//        do {
//           System.out.printf("Please enter a decimal number between %f and %f : ", min, max);
//
//            dubInput = this.scanner.nextDouble();
//
//        }while (dubInput > max || dubInput < min );
//
//        return dubInput;
        try {

            System.out.printf("Please enter a whole number between %f and %f: ", min, max);

            dubInput = Double.parseDouble(getString());

            System.out.println("Okay, " + dubInput + " is a great choice.");

        } catch (NumberFormatException e) {

            System.out.println("Uh oh, something went wrong: " + e.getMessage());

            System.out.println("Here is some more detail:");

            e.printStackTrace();
        }

        return dubInput;

    }

}


