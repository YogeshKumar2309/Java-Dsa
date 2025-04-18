import java.util.Scanner;

public class CompoundInterest {
  public static void main(String[] args) {
    //Create a program to calculte compoiund interest. (compoundInterest = P * (1 + R / 100)/T

    Scanner input = new Scanner(System.in);
    System.out.print("Calculate the Compound Interest: \nEnter the P: ");
    int P = input.nextInt();

    System.out.print("Enter the T: ");
    int T = input.nextInt();
    System.out.print("Enter the R: ");
    int R = input.nextInt();
    System.out.println("the Compound interest is :" + (P * Math.pow((1 + R / 100), T)));

  }
}
