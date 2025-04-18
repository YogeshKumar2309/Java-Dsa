import java.util.Scanner;



public class MarksGrades {
  public static void main(String[] args) {
    //Create a program that determines the grade of a student based on their marks.
    //The grading system is as follows:
    //A: 90-100   
    //B: 80-89
    //C: 70-79
    //D: 60-69
    //F: 0-59

    Scanner input = new Scanner(System.in);
    System.out.println("Check the grade of a student based on their marks.\n");
    System.out.print("Enter the marks: ");
    int marks = input.nextInt();

    String grade = "";

    if(marks >= 90 && marks <= 100){
      grade = "A";
    }else if(marks >= 80 && marks < 90){
      grade = "B";  
    }else if(marks >= 70 && marks < 80){
      grade = "C";
    }else if(marks >= 60 && marks < 70){
      grade = "D";
    }else if(marks >= 0 && marks < 60){
      grade = "F";
    }else{
      System.out.println("Invalid marks entered. Please enter a valid number between 0 and 100.");
      input.close();
      
    }

    if(!grade.isEmpty()){
      System.out.println("The grade is: " + grade);
    }
    input.close();
  }
}
