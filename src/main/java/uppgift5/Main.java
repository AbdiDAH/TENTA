package uppgift5;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get("src/main/resources/Car.json");
        List<Car>FromJson = List.of(mapper.readValue(path.toFile(), Car.class));

        Car car1 = new Car();



        int YourPick = Integer.parseInt(scanner.nextLine());

        switch (YourPick){
            case 1:
                FromJson = List.of(mapper.readValue(path.toFile(), Car[].class));
                System.out.println("""
                        1.Do you what to know how many cars there is?
                        2.Do you whant to know what colors they are?
                        3.Or what brand they are?
                        """);

                    YourPick = Integer.parseInt(scanner.nextLine());
                    System.out.println("How many cars? :" + Car.getNumberOfCars());
                    System.out.println("What color are the cars? :" + Car.getColor());
                    System.out.println("What brand are the cars:" + Car.getBrand());


        }




    }
}
