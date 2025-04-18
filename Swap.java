public class Swap {
  public static void main(String[] args){
    //Crate a program to swap two numbers.
    int a = 5;
    int b = 10;

    int temp = a;
    a = b;
    b = temp;
    System.out.println("After swapping: a = " + a + ", b = " + b);
  }
}