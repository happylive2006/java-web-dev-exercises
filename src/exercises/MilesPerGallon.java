package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        MilesPerGallon milesPerGallon = new MilesPerGallon();
        milesPerGallon.calculateMilesPerGallon();

    }
    //create a method
    public void calculateMilesPerGallon() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        Double milesDriven = scanner.nextDouble();

        System.out.println("How many gallon of gas have your car consumed?");
        Double gasConsumed = scanner.nextDouble();

        //miles per gallon = miles / gallons;
        Double milesPerGallon = milesDriven / gasConsumed;
        System.out.println("Your miles per gallon is  "+ milesPerGallon.toString());


    }
}
