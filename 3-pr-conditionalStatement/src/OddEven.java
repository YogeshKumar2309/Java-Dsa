import java.util.Scanner;

class OddEven {
  public static void main(String[] args) {
    // Create a program that determines if a number is odd or even.

    Scanner input = new Scanner(System.in);

    System.out.print("Check if the number is odd or even.\n\nEnter the number: ");
    int num = input.nextInt();

    if (num % 2 == 0 ){
      System.out.println("The number is even.");
    } else {
      System.out.println("The number is odd.");
    }
  }
}
