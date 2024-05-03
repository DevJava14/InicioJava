
import java.util.Locale;
import java.util.Scanner;

public class Cadastrar
 {      //variavel global do casdastro
        String AgenciaCliente;
        int  NumeroCliente;
        String NomeCliente;
        Double SaldoCliente;
        

       
       

        public static String ValidarNome(String resposta) {
                
                    String nome = new Scanner(System.in).nextLine();
                    return nome;
                }
               
        public void castroCliente()
        {       
                Scanner ler = new Scanner(System.in).useLocale(Locale.US); 
                
              
                System.out.print("\nPor favor, digite seu numero de agencia:");
                NumeroCliente = ler.nextInt();
              
                System.out.print("Por favor,digite sua de agencia:");
                AgenciaCliente = ler.next();

                System.out.print("Por favo,digite seu nome:");
                String resposta = ler.nextLine();
                NomeCliente=ValidarNome(resposta);

                System.out.print("Por favor,digite o saldo de  sua conta:");
                SaldoCliente = ler.nextDouble();

               
                
               


                
        }

        public void MostrarCadastroCliente()
        { 
                System.out.println("\nOla "+NomeCliente+ ",obrigado por criar uma conta em nosso banco,sua agência é "+AgenciaCliente + " ,conta "+NumeroCliente+" e seu saldo  R$ "+SaldoCliente+",que seu ja esta disponivel para uso.");
        
        
        }
        
           
       
       
 }




    

