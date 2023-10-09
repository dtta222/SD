import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        double gallons, oldOD, newOD;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Current tank: ");
        gallons = scanner.nextDouble();

        System.out.print("Old  odometer reading: ");
        oldOD = scanner.nextDouble();

        System.out.print("New  odometer reading: ");
        newOD = scanner.nextDouble();

        System.out.println(miles(gallons, oldOD, newOD) + " MPG");


    }


    static double miles(double gallons, double oldOD, double newOD){
        double mpg = 0;

        mpg = (newOD - oldOD) / gallons;

        return mpg;
    }
}