import java.util.Scanner;

	public class ConversaoNumeroCaractere {
      public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print ("\nInforme um número inteiro:\t");
		int numero = scan.nextInt();
		char caractere =(char)numero;

        System.out.println("Caractere correspondente:\t" + caractere);
		System.out.println();
}

}
