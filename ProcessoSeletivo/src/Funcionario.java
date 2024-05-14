import java.util.Scanner;

public class Funcionario 
{
    public static void main(String[] args) throws Exception
     {

        Boolean sair =false;
        Menu cadastro =new Menu();
        int opcao=cadastro.MenuPrincipal();
        while (sair==false) {
            switch (opcao) {
               case 1:  
                    
                   Cadastro funcionario= new Cadastro();
                   funcionario.CastroFuncionario();
                   funcionario.MostrarCadastroFuncionario();
                   sair = cadastro.continuacao();
                   break;
               case 2:
                   Cadastro FuncionarioAletorio= new Cadastro();
                   FuncionarioAletorio.CastroClienteAleatorio();
                   sair = cadastro.continuacao();
                 
              
                   break;
               case 3:  
                  sair= false;
                  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                  System.out.println("Voce saiu do programa\n");
              
                   break;
               default: 
                   System.out.println("!ERRO--opção nao consta no menu responda a pergunta abaixo:");
                   sair = cadastro.continuacao();
                   break;
   
                   
   }
   }
     
   
     
                

     
            
    
    }




}

