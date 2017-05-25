import java.io.PrintStream;
import java.util.Scanner;

public  class Exercicio0506{
	public static void main (String[] args){
	String nome = "";
	PrintStream saida = System.out;

	Scanner scan = new Scanner(System.in);
	saida.print("\nInforme seu nome completo:\t");
	nome = scan.nextLine();
	
	saida.print("Iniciais do Nome :\t");
	
  saida.println (nome.charAt(0) + nome.substring(nome.charAt(0)));
	

}
}
