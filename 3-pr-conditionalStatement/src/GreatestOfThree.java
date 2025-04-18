import java.util.Scanner;

public class GreatestOfThree {
  public static void main(String[] args) {
    //Create a program that deteremines the greatest of three numbers.

    Scanner input = new Scanner(System.in);

    System.out.println("Check the greatest of three numbers.\n");
    System.out.print("Enter the first number: ");
    int num1 = input.nextInt();
    System.out.print("Enter the second number: ");
    int num2 = input.nextInt();
    System.out.print("Enter the third number: "); 
    int num3 = input.nextInt();

    if (num1 > num2 && num1 > num3){
      System.out.println("The greatest number is: " + num1);
    }else if(num2 > num1 && num2 > num3){
      System.out.println("The greatest number is: " + num2);
  }else {
    System.out.println("The greatest number is: " + num3);
  }

    input.close();
  }
}
