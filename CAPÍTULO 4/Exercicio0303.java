import java.util.Scanner;

	public class Exercicio0303{
		public static void main (String[] args){
			Scanner scan = new Scanner (System.in);

	System.out.print("\nInforme seu nome:");
	  String nome = scan.nextLine();

	System.out.print("\nInforme sua Nacionalidade:");
	  String nacionalidade = scan.nextLine();
    
	System.out.print("\nInforme seu Telefone:");
	  String telefone = scan.nextLine();

	System.out.println("\nCadastro Confirmado:");
	
  System.out.printf("Nome: \t\t%s \nNacionalidade: \t%s\nTelefone: \t%s \n\n", nome,nacionalidade,telefone);
    }
  }
	

