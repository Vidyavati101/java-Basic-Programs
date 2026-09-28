import java.util.Scanner;
public class Voting{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The age of Candidate");
        int age=sc.nextInt();
if(age>=18){
        System.out.println("is Eligible for voting");
    }
    else if(age<18 && age>0){
        System.out.println("is not Eligible for voting");

}
else {
    System.out.println("Invalid age");
}
  sc.close();
}
}
