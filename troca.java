//troca
import java.util.Scanner;

public class Troca {
  public static void troca (String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Informe valor de A:");
    int A = sc.nextInt();

    System.out.println("Informe valor de B:");
    int B = sc.nextInt();

    
    System.out.println("Informe valor de C:");
    int C = sc.nextInt();
    

    C = A;
    A = B;
    B = C;

  System.out.println("Informe valor de A:");
  System.out.println("Informe valor de B:");
  System.out.println("Informe valor de c:");
    
  }
}