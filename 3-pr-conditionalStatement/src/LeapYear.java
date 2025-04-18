import java.util.Scanner;

public class LeapYear {
  public static void main(String[] args) {
    // Create a program that determines if a given year is a leap year or not. (considering conditions like divisible by 4 but not 100, unless also divisible by 400)

    Scanner input = new Scanner(System.in);

    System.out.print("Check if the year is a leap year.\n\nEnter the year: ");
    int year = input.nextInt();

    if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
      System.out.println("The year " + year + " is a leap year.");
    }else {
      System.out.println("The year " + year + " is not a leap year.");
    }

  }
}
