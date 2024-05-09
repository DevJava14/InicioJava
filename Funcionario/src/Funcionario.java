import java.util.Scanner;
public class Funcionario 
{
    public static void main(String[] args) throws Exception
     {
       
        try
        { 
          
         
            menu cadastro =new menu();
            int resposta= cadastro.MenuPrincipal();
          
            if(resposta==1)
            {
                cadastrar trabalho =new cadastrar();
    
    
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                trabalho.castroCliente(); 
                trabalho.MostrarCadastroCliente();
                
                boolean respondendo=trabalho.verificadorContuidade();
                while (respondendo==true) 
                {
                   
                    trabalho.castroCliente(); 
                    trabalho.MostrarCadastroCliente();
                    respondendo=trabalho.verificadorContuidade();
                    
                }
            }else
            {
                
                cadastrar trabalho =new cadastrar();
    
                while((resposta==0)||resposta>3)
                {
                  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                  System.out.println("\nErro digitou um numero invalido por favor redigite:");
                  resposta= cadastro.MenuPrincipal();
                 
                }
    
    
                trabalho.castroClientealeatorio();
                boolean respondendo=trabalho.verificadorContuidade();
                
                while (respondendo==true) 
                {
                    trabalho.castroClientealeatorio();
                    respondendo=trabalho.verificadorContuidade();
                  
                    
                }
            }
        }
         
         catch (Exception e) 
         {

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

           
            System.out.println("\n:Erro digitou um numero invalido por favor redigite:");






         }


     
    
    
    
    
    }

        

}

