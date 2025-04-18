import java.util.Scanner;

public class SimpleInterest {
  public static void main(String[] args) {
    //Create a program to calculate simple interest. (simpleInterest = (P*T*R)/100

    Scanner input = new Scanner(System.in);

    System.out.print("Calculate the Simple Interest: \nEnter the P: ");
    int P = input.nextInt();

    System.out.print("Enter the T: ");
    int T = input.nextInt();

    
    System.out.print("Enter the R: ");
    int R = input.nextInt();

    System.out.println("the Simple interest is :" + (P * T * R) / 100);

  }
}
