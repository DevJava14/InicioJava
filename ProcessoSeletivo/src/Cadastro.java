
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Cadastro {
    String NomeFuncionario;
    double SalarioDesejado;
    double SalarioBase=2000.0;
    public void CastroFuncionario()throws Exception
    {

        try{
            Scanner ler = new Scanner(System.in).useLocale(Locale.US);
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
            System.out.print("\nPor favor,digite seu nome:");
            NomeFuncionario= ler.nextLine();

            System.out.print("Por favor,digite salario desejado para a vaga da  canditaura:");
            SalarioDesejado= ler.nextDouble();
            
            
    }
       catch (Exception e) 
      {
       
        System.out.println("\nErro o senhor digitou um salario invalido,por favor redigite:");
        Scanner ler = new Scanner(System.in);
        SalarioDesejado= ler.nextDouble();

        
    
     }
          
    
       

    }


    public void MostrarCadastroFuncionario()


    {
            //validação do candidsto com relacao ao salario 

            if(SalarioBase>SalarioDesejado)
            {
              System.out.println("\nLigar para o candidato  "+NomeFuncionario);

            }else if(SalarioBase==SalarioDesejado)
                {System.out.println("\nLigar para o canditado "+NomeFuncionario+" com contra proposta!!");
            }
                else{System.out.println("\nAguarando o resutado dos demais canditatos");}
        




}  

public static Boolean continuacao()throws Exception
{
            Boolean continuar=false;
            int valor;
            Scanner ler = new Scanner(System.in);
            
            System.out.println("\n\nDeseja sair do programa? se sim digite 1 se nao digite  2.\n");
            valor= ler.nextInt();
            if(valor==1){
                continuar=false;
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.out.println("Voce saiu do programa\n");
                
               }
               else{
                continuar=true;
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
               
                
                
            }
            

           
            return continuar;
    

}

public void CastroClienteAleatorio()
  {
    String[] nomes = {"maria", "joao", "jose", "mateus","Carla","mariana","joanita","Rafael","josoel","jair","fernando","jesica","camila"};
   
    
    int index = (int) (Math.random() * nomes.length);
    Random random = new Random();
    double valor=random.nextDouble((2800.00 - 1400.0) + 1) + 1000.0;
    //String resultado = String.format("%.2f", valor);
    NomeFuncionario=nomes[index];
    
    BigDecimal bd = new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);
    

    if(SalarioBase>bd.doubleValue())
    {
      System.out.println("\nLigar para o candidato  "+NomeFuncionario);

    }else if(SalarioBase==bd.doubleValue())
        {System.out.println("\nLigar para o canditado "+NomeFuncionario+" com contra proposta!!");
    }
        else{System.out.println("\nAguarando o resutado dos demais canditatos");}


   
 

    
 


  }







    
}