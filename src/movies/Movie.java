package movies;


public class Movie {

    private String name;

    private String category;

    public Movie(String movieTitle, String movieCategory) {

        this.name = movieTitle;

        this.category = movieCategory;

    }

    public void setName(String movieTitle){

        this.name = movieTitle;
    }

    public void setCategory( String movieCategory){

        this.category = movieCategory;
    }

    public String getName(){

        return name;
    }

    public String getCategory(){

        return category;
    }

}