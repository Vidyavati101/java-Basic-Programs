import java.util.Scanner;
public class LargestNumber{
public static void main(String[] arg){
Scanner sc= new Scanner(System.in);
System.out.println("Enter The Number");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a>b&&a>c){
    System.out.println("a is  largest Number");}
    else if(b>a&&b>c){
        System.out.println("b is largest Number");

    }
    else{
        System.out.println("c is largest Number");
}
 sc.close();
}
}

