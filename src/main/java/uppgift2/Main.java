package uppgift2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //TODO jag var lite osäker på vad du var ute efter i uppgiften, tror jag gjorde rätt.

        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.next();


        if (name1.equals("lena")){
            System.out.println("Namnet börjar på bokstaven L!");
        } else if (name1.equals("Örjan")) {
            System.out.println("Namnet börjar på bokstaven Ö och är den sista bokstaven i alfabetet!");


        }

    }
}
