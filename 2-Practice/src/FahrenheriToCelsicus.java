import java.util.Scanner;

public class FahrenheriToCelsicus {
  public static void main(String[] args) {
    //Create a program to convert fahrenheit to celsius. (C = (F - 32) * 5/9)
    //Create a program to convert celsius to fahrenheit. (F = C * 9/5 + 32)

    Scanner input = new Scanner(System.in);

    System.out.print("enter the temperature in fahrenheit: ");
    double fahrenheit = input.nextDouble();
    double celsius = (fahrenheit - 32) * 5 / 9;
    System.out.println("the temperature in celsius is: " + celsius);
  } 
}
