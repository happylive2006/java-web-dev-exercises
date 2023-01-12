package exercises;

public class Loki {
   //main method
   public static void main(String[] args){
      //declare Loki so can access it, create a new instance of Loki
      Loki myFirstLoki = new Loki();
      //call the first method
         myFirstLoki.myFirstMethod();
   }
   //class variable
   private String myFirstClassVariable = "This is a string";
   //constructor
   public Loki() {

   }
   //create the first method
   public void myFirstMethod() {
      System.out.println("Hello World!");
   }
}
