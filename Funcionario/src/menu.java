import java.util.Scanner;
import java.io.IOException;

public class menu 
{
    public static int MenuPrincipal()throws Exception
    
    {

        try{
                int modulo=0;
                boolean verificador =  false;

                System.out.println("Digite uma opção do menu:\n");
                Scanner ler = new Scanner(System.in);
                System.out.println("Digite 1 para digitar manualmente os funcionarios\n");
                System.out.println("Digite 2 para digitar os funcionarios serem aleatorios\n");
                System.out.println("Digite 3 para sair do programa:\n");
                modulo= ler.nextInt();
                while (verificador==false)
                 {
                    if(modulo==0)
                    {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        verificador=false;
                        System.out.println("\nErro o senhor digitou um munero que esta fora do menu,por favor redigite:\n");
                        System.out.println("\nDigite 1 para digitar manualmente os funcionarios\n");
                        System.out.println("Digite 2 para digitar os funcionarios serem aleatorios\n");
                        System.out.println("Digite 3 para sair do programa:\n");
                        modulo= ler.nextInt(); 
                    }
                    
                    if(modulo==1)
                    {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        verificador=true;
                       
                    }

                    if(modulo==2)
                    {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        verificador=true;
                       
                    }


                    if(modulo==3)
                    {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        System.out.println("\nSaiu do sistema\n");
                        verificador=true;
                       
                    }

                    
                    if(modulo>3)
                    {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        verificador=false;
                        System.out.println("\nErro o senhor digitou um munero que esta fora do menu,por favor redigite:\n");
                        System.out.println("\nDigite 1 para digitar manualmente os funcionarios\n");
                        System.out.println("Digite 2 para digitar os funcionarios serem aleatorios\n");
                        System.out.println("Digite 3 para sair do programa:\n");
                        modulo= ler.nextInt(); 
                    }





                    }

                    
                 

              
                
              


                return modulo;
         } 
         catch (Exception e) 
         {

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            int modulo=0;
            boolean verificador =  false;
            System.out.println("\nErro o senhor digitou um munero ou letra ,que esta fora do menu,por favor redigite:\n");

            System.out.println("Digite uma opção do menu:\n");
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite 1 para digitar manualmente os funcionarios\n");
            System.out.println("Digite 2 para digitar os funcionarios serem aleatorios\n");
            System.out.println("Digite 3 para sair do programa:\n");
            modulo= ler.nextInt();
            while (verificador==false)
             {
                if(modulo==0)
                {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    verificador=false;
                    System.out.println("\nErro o senhor digitou um munero que esta fora do menu,por favor redigite:\n");
                    System.out.println("\nDigite 1 para digitar manualmente os funcionarios\n");
                    System.out.println("Digite 2 para digitar os funcionarios serem aleatorios\n");
                    System.out.println("Digite 3 para sair do programa:\n");
                    modulo= ler.nextInt(); 
                }
                
                if(modulo==1)
                {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    verificador=true;
                   
                }

                if(modulo==2)
                {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    verificador=true;
                   
                }


                if(modulo==3)
                {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    System.out.println("\nSaiu do sistema\n");
                    verificador=true;
                   
                }

                
                if(modulo>3)
                {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    verificador=false;
                    System.out.println("\nErro o senhor digitou um munero que esta fora do menu,por favor redigite:\n");
                    System.out.println("\nDigite 1 para digitar manualmente os funcionarios\n");
                    System.out.println("Digite 2 para digitar os funcionarios serem aleatorios\n");
                    System.out.println("Digite 3 para sair do programa:\n");
                    modulo= ler.nextInt(); 
                }





                }

            return modulo;
            
           

         }


    
}

}