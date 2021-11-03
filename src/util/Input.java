package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);

    }

    String getString() {

        return scanner.nextLine();
    }


    boolean yesNo() {

        String userInput = scanner.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");

    }

    int getInt() {

        return this.scanner.nextInt();
    }

//    int getInt(int min, int max){
//
//        System.out.println("Enter a number ");
//    }
//
//    double getDouble(double min, double max){
//
//    }

}




