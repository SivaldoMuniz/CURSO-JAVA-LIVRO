import java.util.Scanner;
import java.io.PrintStream;

	public class Exercicio0503 {
	public static void main (String[] args){

	String cpf = "";
 	PrintStream saida = System.out;

	Scanner scan = new Scanner (System.in);
  
  saida.print("\nInforme seu CPF (so numeros):\t");

  cpf = scan.nextLine();

	saida.print("CEP Formatado \t");
	saida.println(cpf.substring(0,3)+(".")+cpf.substring(3,6)+(".")    		+cpf.substring(6,9)+("-")+cpf.substring(9,11));

}

}
