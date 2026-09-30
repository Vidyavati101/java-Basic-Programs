public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n = 10; // You can change this value to calculate the sum of natural numbers up to a different number
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of natural numbers from 1 to " + n + " is: " + sum);
    }
}
