package uppgift6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                1. Nämn en av rollerna som finns  inom Scrum?
                2. Nämn en av ceremonierna som finns inom Scrum?
                3. Vad är rekommenderat max antal personer i ett team?
                4. Scrum har ett dokument där ALL information som Scrum finns vad heter det?
                5. Vem är den enda som personen som får avbryta en Sprint?
                """);


        switch (scanner.next().equals("Product Owner, ScrumMaster, och medlemmarna av utvecklingsteamet"))
            System.out.println("1 point");






        System.out.print(scanner.next());
        System.out.print(scanner.next());
        System.out.print(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
    }
}
