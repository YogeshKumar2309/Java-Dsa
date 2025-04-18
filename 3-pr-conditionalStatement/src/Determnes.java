import java.util.Scanner;

public class Determnes {

  public static void main(String[] args) {
    //Create a program theat determines if a numbr is positive, negative, or zero.

    Scanner input = new Scanner(System.in);

    System.out.print("Check the number i s positive, negative, or zero.\n\nEntrer the number: ");

    int number = input.nextInt();

    if(number == 0){
      System.out.println("The number is zero.");
    }else if(number > 0){
      System.out.println("The number is positive.");
    }else{
      System.out.println("The number is negative.");
    }
    input.close();

  }
}