import javax.swing.JOptionPane;

	public class Exercicio0304{
		public static void main (String[] args){
			String jg1 = JOptionPane.showInputDialog(null,"Informe seu 1º Jogo Preferido");
			String jg2 = JOptionPane.showInputDialog(null,"Informe seu 2º Jogo Preferido");

		    String mensagem ="Seus jogos preferidos:\n"+ "1." + jg1 + "\n2." + jg2;
            
		JOptionPane.showMessageDialog (null,  mensagem);


		System.exit(0);

}

}
