	import java.util.Scanner;
	import java.text.NumberFormat;

	public class Exercicio0406{
	 public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	    NumberFormat nf = NumberFormat.getCurrencyInstance();

		System.out.print("\nInforme o seu peso: ");
		double peso = scan.nextDouble();
		
		System.out.print("Informe a sua altura: ");
		 double altura= scan.nextDouble();

		
		double IMC = peso / (altura * altura);
     
      
		System.out.println("Seu IMC:  "+ IMC);

	System.out.println();

}
}
        
