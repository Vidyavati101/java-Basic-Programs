
import java.util.Scanner;   
public class StudentGrade{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Grade");
        
        int marks=sc.nextInt();
        if(marks>=90){
            System.out.println("Grade:O");
        }
        else if(marks>=80){
            System.out.println("Grade:A+");
        }
        else if(marks>70){
            System.out.println("Grade:A");
        }
        else if(marks>=60){
            System.out.println("Grade B+");
        }
        else if(marks>=55){
            System.out.println("Grade B");
        }
        else if(marks>=50){
            System.out.println("Grade c+");
        }
        else if(marks>=40){
            System.out.println("Grade c");}
            else{
                System.out.println("Fail");
            }
            sc.close();
    }
}