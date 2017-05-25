import java.util.Scanner;
import java.io.PrintStream;

	public class Exercicio0501 {
	public static void main (String[] args){

	String cep = "";
 	PrintStream saida = System.out;

	Scanner scan = new Scanner (System.in);
  
  saida.print("\nInforme seu CEP (so numeros):\t");

  cep = scan.nextLine();

	saida.print("CEP Formatado \t");
	saida.println(cep.substring(0,5)+("-")+(cep.substring(5,8)));

}

}

