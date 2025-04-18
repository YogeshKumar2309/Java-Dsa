import java.text.NumberFormat.Style;
import java.util.Scanner;

public class AreaOfTriangle {
  public static void main(String[] args) {
    //calculte the area of triangle 
    //?? Area of Triangle = ½ * B * H

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the width of Triangle: ");
    float B = input.nextFloat();

    System.out.print("Enter the Hight of Triangle: ");
    float H = input.nextFloat();

    double tArea = 0.5*(B*H);

    System.out.println("Area of triangle: " +tArea);

  }
}
