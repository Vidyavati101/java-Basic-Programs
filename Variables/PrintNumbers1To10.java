import java.util.Scanner;
public class PrintNumbers1To10 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        
        if (number >= 1 && number <= 10) {
            for (int i = 1; i <= number; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Please enter a number between 1 and 10.");
        }
        
        scanner.close();
    }
}