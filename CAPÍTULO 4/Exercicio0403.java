import java.util.Scanner;

	public class Exercicio0403 {
	public static void main (String[] args){
	Scanner scan = new Scanner(System.in);
 
     System.out.print("\nInforme um número inteiro:");

     int numero = scan.nextInt();
     int quadrado = numero * numero;
		
		System.out.println("\nO quadrado de " + numero  +"\t"+"é "+ quadrado);

	System.out.println();

}

}
