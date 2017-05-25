import java.io.IOException;

    public class Exercicio0302{
public static void main (String[] args) throws IOException{
   
   System.out.print("Informe seu Nome: ");
    byte[] nm = new byte[50]; 
   System.in.read(nm);
    String nome = new String(nm).trim();    
    System.out.print("Informe seu Email:");
      byte[] eml = new byte[50];   
   
   System.in.read(eml);
      String email = new String(eml).trim();

System.out.println();

System.out.println("Dados recebidos:");
System.out.printf("Nome: %s \nE-mail: %s \n", nome, email);
System.out.println();
}

}

        
      
