import java.util.Scanner;

public class Prob2{
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
//math.abs
  System.out.println("Enter 1st interger: ");
  int num1 = scan.nextInt();
  System.out.print("Enter 2nd interger: ");
  int num2 = scan.nextInt();
  int num3 = Math.abs(num1 - num2 );
  System.out.println(num3);
  }
}