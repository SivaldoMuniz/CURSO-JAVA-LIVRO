import java.io.PrintStream;
import java.util.Scanner;

  public class Exercicio0505 {
	 public static void main (String[] args){
	 PrintStream saida = System.out;
	 Scanner scan = new Scanner(System.in);
 	
	saida.print("\n Informe um texto:\t");

	String t1 = scan.nextLine();

  saida.print("Informe outro texto:\t");
	String t2 = scan.nextLine();

	saida.println("\nComparações:");
	saida.println("Palavras iguais:\t\t " + (t1.equals(t2)));

	saida.println();
}
}
