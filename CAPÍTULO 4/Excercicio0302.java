import java.io.IOException;

    public class Excercicio0302{
public static void main (String[] args) throws IOException{
    System.out.print("\nInforme seu Nome: ");
byte[] nm = new byte[50];
    System.out.print("\nInforme seu Email:");
byte[] eml = new byte[50];
    
System.in.read(nome);
System.in.read(email);

String nome = new String(nm).trim();
String email = new String(eml).trim();

System.out.printf(%:Cadastro Confirmado\n\n, nome, email);
}

}


        
      
