import java.util.Scanner;
class PercentageCalculator{
public static void main(String[] args){

  Scanner sc = new Scanner(System.in);

  System.out.println("Enetr Mathematics Marks: ");
   int Math = sc.nextInt();

  System.out.println("Enetr English Marks: ");
   int English = sc.nextInt();

  System.out.println("Enetr Physics Marks: ");
   int Physics = sc.nextInt();

  System.out.println("Enetr Chemistry Marks: ");
   int Chemistry = sc.nextInt();

  System.out.println("Enetr Biology Marks: ");
   int Biology = sc.nextInt();

  float Percentage = (Math + English + Physics + Chemistry + Biology)/5;
  System.out.println("Your Percentage is: " + Percentage + "%");
 }
}

