import java.util.Scanner;

public class Produc {
  public static void main(String[] args) {
    //create a program to calculate product of two floatin point numbers.

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the fist Floating number: ");
    
    float a = input.nextFloat();
    System.out.print("Enter the Second Floating number: ");

  
    float b = input.nextFloat();

    System.out.println("Product of " + a + "and" + b + " =" + (a*b));

  }
}
