import java.util.Scanner;
 
public class Prumer {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Zadejte první číslo: ");
  int num1 = in.nextInt();
   
  System.out.print("Zadejte druhé číslo: ");
  int num2 = in.nextInt();
   
  System.out.print("Zadejte třetí číslo: ");
  int num3 = in.nextInt();
   
  System.out.print("Zadejte čtvrté číslo: ");
  int num4 = in.nextInt();
   
   
  System.out.println("Průměr je: " + 
   (num1 + num2 + num3 + num4) / 4);
 }
}