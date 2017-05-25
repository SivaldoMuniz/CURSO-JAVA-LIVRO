	import java.util.Scanner;
	import java.text.NumberFormat;

	public class Exercicio0405{
	 public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	    NumberFormat nf = NumberFormat.getCurrencyInstance();

		System.out.print("\nInforme o nome do vendedor: ");
		String nome = scan.nextLine();
		
		System.out.print("Informe o total de vendas realizadas por " + nome + ":");
		 double vendas = scan.nextDouble();

		System.out.print("Informe o percentual de comissão de " + nome + ":");
		double porcento = scan.nextDouble();
			 
			double comissao = vendas * porcento / 100;
     
      
		System.out.println("Valor da comissão de "+ nome + ":"  + nf.format(comissao));

	System.out.println();

}
}
        
