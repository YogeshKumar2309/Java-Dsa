import java.util.Scanner;

public class CategorzePerson {
  public static void main(String[] args) {
    //Create a program that categorizes a person based on their age.
    //Child: 0-12 years
    //Teenager: 13-19 years 
    //Adult: 20-64 years
    //Senior: 65 years and older

    Scanner input = new Scanner(System.in);
    System.out.println("Categorize a person based on their age.\n");
    System.out.print("Enter the age: ");
    int age = input.nextInt();

    if(age >= 0 && age <= 12){
      System.out.println("The person is a child.");
    }else if(age >= 13 && age <= 19){
      System.out.println("The person is a Teenager.");
    }else if(age >= 20 && age <= 64){
      System.out.println("The person is a Adult");
    }else if(age >= 65 && age <= 125){
      System.out.println("The person is a Senior.");
    }else{
      System.out.println("avtar");
    }

    input.close();
  }
}
