package movies;

import static movies.MoviesArray.findAll;


public class MoviesApplication {

    public static void main(String[] args) {

        System.out.println("What would you like to do?");

        System.out.println("0 - exit");

        System.out.println("1 - view all movies");

        System.out.println("2 - view movies in the animated category");

        System.out.println("3 - view movies in the drama category");

        System.out.println("4 - view movies in the horror category");

        System.out.println("5 - view movies in the scifi category");

        System.out.println("Enter your choice: ");

//       Scanner sc = new Scanner()

//        if(userInput.equals(1)){

                Movie[] movieList = findAll();
                for (Movie pmovie : movieList)
            System.out.println(pmovie.getCategory());

//  pmovie.getCategory().equals("animated");


        }


    }
















