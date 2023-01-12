package exercises;
import java.util.Scanner;

public class HelloWorld {
    //create a staring point
    public static void main(String[] args) {
        //create a new instance of helloWorld.
        HelloWorld hello = new HelloWorld();
        //call the method
        hello.askUserForName();
    }

    //create a method so the class can do the action
    public void askUserForName() {
        //declare a new scanner, create a scanner object
        Scanner input = new Scanner(System.in);
        //ask the question
        System.out.println("Hello,What is your name: ");
        //grab the next line the user's data type and press enter and then store it into this name variable.
        //Create a variable to store the user’s response using the Scanner’s .nextLine() method
        //nextLine()Returns the next line to read as a String data type
        String name = input.nextLine();
        System.out.println("Hello " + name);


    }

}
