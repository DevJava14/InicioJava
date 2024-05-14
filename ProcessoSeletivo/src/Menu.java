import java.util.Scanner;

public class Menu 
{
    public static int MenuPrincipal()throws Exception
    {
        boolean verificar= false;
        int modulo=0;
        while (verificar==false) 
        {
                
                System.out.println("Digite uma opção do menu:\n");
                Scanner ler = new Scanner(System.in);
                System.out.println("Digite 1 para digitar manualmente os funcionarios\n");
                System.out.println("Digite 2 para digitar os funcionarios serem aleatorios\n");
                System.out.println("Digite 3 para sair do programa:\n");
                modulo= ler.nextInt();
                if((modulo==0)||(modulo>3))
                {
                  verificar=false;
                  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                  System.out.println("\nErro digitou um numero fora do menu");
                }
                else{ new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                  verificar= true;}
     }
     return  modulo;
        

    }

    public static Boolean continuacao()throws Exception
    {
                Boolean continuar=false;
                int valor;
                Scanner ler = new Scanner(System.in);
                
                System.out.println("\n\nDeseja sair do programa? se sim digite 1 se nao digite  2.\n");
                valor= ler.nextInt();
                if(valor==1){
                    continuar=true;
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    System.out.println("Voce saiu do programa\n");
                    
                   }
                   else{
                    continuar=false;
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    
                   
                    
                    
                }
                

               
                return continuar;
        

    }




    
}