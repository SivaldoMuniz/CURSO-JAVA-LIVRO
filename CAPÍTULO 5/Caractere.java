import java.io.PrintStream;

	public class Caractere{
	 public static void main(String[] args){
		PrintStream saida = System.out;

		saida.println ("\n Códigos de caracteres:");
		saida.println ("A = \t " + Character.getNumericValue('A'));
		saida.println ("B =\t " + Character.getNumericValue ('B'));
		saida.println ("C =\t" + Character.getNumericValue ('C'));

		saida.println("\nTestes diversos:\n");
		saida.print("\"5\" é um digito?\t\t");
		saida.println(Character.isDigit('5'));
		saida.print("\"5\" é uma letra?\t\t");
		saida.println(Character.isLetter('5'));
		saida.print("\"5\" é um digito ou letra? \t ");
		saida.println(Character.isLetterOrDigit('5'));
		saida.print("\"-\" é um espaço em branco?\t");
		saida.println(Character.isWhitespace ('-'));

		saida.print("\"A\" é um letra minúscula?\t");
		saida.println(Character.isLowerCase ('A'));
		saida.print("\"A\" é uma letra maiúscula?\t");
		saida.println(Character.isUpperCase('A'));

		saida.print("\nConversão de \"A\" para minúsculo:\t");
		saida.println(Character.toLowerCase ('A'));
		saida.print("Conversão de \"b\" para maiúsculo:\t");
		saida.println(Character.toUpperCase('b'));
}
}

		
		
	
