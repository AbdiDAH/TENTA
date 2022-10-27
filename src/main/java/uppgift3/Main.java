package uppgift3;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        Person person1 = new Person();
        Path paths = Paths.get("src/main/resources/person.json");
        ObjectMapper mapper = new ObjectMapper();


        List<Person>person = List.of(mapper.readValue(paths.toFile(),Person[].class));

        List<Person>people = new ArrayList<>();

        System.out.println("Write your first name: ");
        String FirstName = scanner.next();
        System.out.println("Write your last name: ");
        String LastName = scanner.next();
        System.out.println("What is your FavouriteMovie?: ");
        String FavouriteMovie = scanner.next();




    }
}
