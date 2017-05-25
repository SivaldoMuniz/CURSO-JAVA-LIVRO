	import java.util.Scanner;
	import java.text.NumberFormat;

	public class CalculoImpostos {
     public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		NumberFormat nf = NumberFormat.getCurrencyInstance();

	System.out.print("\nInforme o valor do faturamento:\t");
	double faturamento = scan.nextDouble();
	double valor_cofins = faturamento * Constantes.COFINS / 100;
	double valor_pis = faturamento * Constantes.PIS / 100;
	double total_impostos = valor_cofins + valor_pis;

	System.out.println("COFINS (3%):\t" + nf.format(valor_cofins));
    System.out.println("PIS (0,65%) :\t" + nf.format(valor_pis));
	System.out.println("TOTAL:\t\t" + nf.format(total_impostos));
  	
	System.out.println();

}

}
