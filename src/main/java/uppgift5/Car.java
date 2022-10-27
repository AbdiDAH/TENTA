package uppgift5;

public class Car {
    private static int numberOfCars;
    private static String color;
    private static String brand;

    public Car() {
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    public static String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Car(int numberOfCars, String color, String brand) {
        this.numberOfCars = numberOfCars;
        this.color = color;
        this.brand = brand;



    }
}
