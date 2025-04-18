import java.util.Scanner;

public class ArithmaticOpr {
  public static void main(String[] args) {
    //create a program that takes two numbers and shows result of all arihmetic operators(+,-,*,/,%)

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first Numer: ");
    int num1 = input.nextInt();

    System.out.print("Enter the second Numer: ");
    int num2 = input.nextInt();

    System.out.println("sum of " + num1 + "+" + num2 + "=" + (num1 + num2));
    System.out.println("Substraction" + num1 + "-" + num2 + "=" + (num1 - num2));

    System.out.println("Multiply of " + num1 + "X" + num2 + "=" + (num1 * num2));

    System.out.println("Devide of " + num1 + "/" + num2 + "=" + (num1 / num2));
    System.out.println("Moduls of " + num1 + "%" + num2 + "=" + (num1 % num2));



    

  }
  
}
