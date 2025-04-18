import java.util.Scanner;

public class RectanglePerimeter {
  public static void main(String[] args) {
    //Create a program to calculate Perieter of a rectange. (a+b+c+d)

    Scanner input = new Scanner(System.in);

    System.out.print("Calculte the Parimete of ractange: \n Please, Enter fist No:");
    double a = input.nextDouble();

    System.out.print("Enter the second number");
    double b = input.nextDouble();

    System.out.print("Enter the third number");
    double c = input.nextDouble();  

     System.out.print("Enter the forth number");
    double d = input.nextDouble();

    double parimeter = a + b + c + d;
    System.out.println("Parimet is: " + parimeter);

  }
}
