import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class cadastrar 

{

    String NomeFuncionario;
    double SalarioDesejado;
    double SalarioBase=2000.0;
   public void castroCliente()
    {       
        try{
            Scanner ler = new Scanner(System.in).useLocale(Locale.US); 
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


    public void MostrarCadastroCliente()


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

public void castroClientealeatorio()
  {
    String[] nomes = {"maria", "joao", "jose", "mateus","Carla","mariana","joanita","Rafael","josoel","jair","fernando","jesica","camila"};
   
    //aqui ele vai pegar o index (posição do seu array)
    //com base no tamanho do seu array (nomes.length)...
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

  
public static boolean verificadorContuidade() 
{
  boolean resposta=false;
 
  try
  { 
    
    Scanner valor = new Scanner(System.in);
    System.out.println("\nDeseja continuar o programa 1 para sim  e 2 para nao:");
    int cadastramento=valor.nextInt();
    if(cadastramento==1){
     resposta=true;
    }
    else
    {
     while((cadastramento==0)||cadastramento>2)
     {
       new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
       System.out.println("\nErro digitou um numero invalido por favor redigite:");
       System.out.println("\nDeseja continuar o programa 1 para sim  e 2 para nao:");
       cadastramento=valor.nextInt();
     }
     System.out.println("\nSaiu do programa!!\n");
     resposta=false;
   
   }
 
  }

catch (IOException | InterruptedException e) 
{
  

  Scanner valor = new Scanner(System.in);
  System.out.println("\n:Erro digitou um numero invalido por favor redigite:");
  System.out.println("\nDeseja continuar o programa 1 para sim  e 2 para nao:");
  int cadastramento=valor.nextInt();
  if(cadastramento==1){
    resposta=true;
  
  }else
  {
   
    while((cadastramento>2)||(cadastramento>0))
      {
        System.out.println("\nErro digitou um numero invalido por favor redigite:");
        System.out.println("\nDeseja continuar o programa 1 para sim  e 2 para nao:");
        cadastramento=valor.nextInt();
      }
    resposta=false;
  


}



}
return resposta;
}

}










    

