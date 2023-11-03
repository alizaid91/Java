import java.util.Scanner;
class PrintName{
  public static void main(String[] args) {

  System.out.println("What is your Name: ");

  Scanner sc = new Scanner(System.in);

  String name = sc.next();
  System.out.println("Hello " + name + " have a good day!");
}
}
