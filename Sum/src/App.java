import java.util.Scanner;

public class App {
    public App() {
        super(); // Call the appropriate constructor of the superclass
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Enter first no");
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        System.out.println("Enter second no");
        int b = num.nextInt();
        
        System.out.println("sum " + (a + b));


    }
}
