package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        AreaOfRectangle areaOfRectangle = new AreaOfRectangle();
        areaOfRectangle.calculateAreaOfRectangle();

    }
    public void calculateAreaOfRectangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the length of the rectangle?");
        Double myRecLength = scanner.nextDouble();

        System.out.println("What is the width of the rectangle?");
        Double myRecWidth = scanner.nextDouble();

        //area = length * width
        //create a area variable
        Double area = myRecLength * myRecWidth;

        System.out.println("Your area is " + area.toString());

    }

}
