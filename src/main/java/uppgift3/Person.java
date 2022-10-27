package uppgift3;

public class Person {

        private String FirstName;
        private String LastName;
        private String FavouriteMovie;

    public Person() {
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFavouriteMovie() {
        return FavouriteMovie;
    }

    public void setFavouriteMovie(String favouriteMovie) {
        FavouriteMovie = favouriteMovie;
    }

    public Person(String firstName, String lastName, String favouriteMovie) {
        FirstName = firstName;
        LastName = lastName;
        FavouriteMovie = favouriteMovie;




    }
}
