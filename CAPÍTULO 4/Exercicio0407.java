import javax.swing.JOptionPane;

	public class Exercicio0407 {
	public static void main (String[] args){

   
 	String Caractere = JOptionPane.showInputDialog(null,"Informe um caractere");
   
	char caractere = (char)Integer.parseInt(Caractere);
    
   
    String mensagem = Caractere;

	JOptionPane.showMessageDialog(null, mensagem);
  
	System.exit(0);
	}
 }
