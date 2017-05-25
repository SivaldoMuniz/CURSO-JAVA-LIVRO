import javax.swing.JOptionPane;




	public class Exercicio0404 {
	public static void main (String[] args){

   

 	String Numero = JOptionPane.showInputDialog(null,"Informe um número inteiro");
   
	 int numero = Integer.parseInt(Numero);
     int cubo = numero * numero * numero;
   
    String mensagem = "O cubo de " + numero + " é " + cubo;

	JOptionPane.showMessageDialog(null, mensagem);
  
	System.exit(0);
	}
 }
