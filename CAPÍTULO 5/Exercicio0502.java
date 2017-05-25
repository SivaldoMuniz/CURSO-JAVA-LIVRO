import java.util.Scanner;
import java.io.PrintStream;

	public class Exercicio0502 {
	public static void main (String[] args){

	String cep = "";
 
	PrintStream saida = System.out;

	Scanner scan = new Scanner (System.in);
  
  saida.print("\nInforme seu CEP (com hífen):\t");

  cep = scan.nextLine();

	saida.print("CEP Formatado \t");
	saida.println(cep.replaceAll("-",""));

}

}
