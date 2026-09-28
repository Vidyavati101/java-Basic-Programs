import java.util.Scanner;

public class Operation{
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.println("Enter The Value of a:");
int a=sc.nextInt();
System.out.println("Enter The Value of b:");
int b=sc.nextInt();
int sum=a+b;
int Substraction=a-b;
int Multiplication=a*b;
int division=a/b;
int Modulus=a%b;
double average=(a+b)/2.0;
System.out.println("Sum of Two numbers:" + sum);
System.out.println("Substraction of Two numbers:" + Substraction);
System.out.println("Multiplication of Two numbers:" + Multiplication);
System.out.println("Division of Two numbers:" + division);
System.out.println("Modulus of Two numbers:" + Modulus);
System.out.println("Average of Two numbers:" + average);
sc.close();

    }
}
