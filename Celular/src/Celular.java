import  java.util.Scanner;
class Configuracao 
{
   

    public static void Ligar(int digito){
       
        if(digito==1){ 
            System.out.println("Discando numero da agenda\n");}
        
        if(digito==2){System.out.println("Discando numero manualmente\n");}
 }

    public static void ReproduzirMusica(int digito)

    {

        if(digito==3){System.out.println("Reproduzindo musica da play lista\n");} 
    
    
    }

    public static void Interne(int digito)
    {

        if(digito==4){System.out.println("Verificando disponibilidade de  rede e exibindo pagina Web\n");} 

    }

    public static void Informacao(int digito)
    {

        if(digito>4)
        {
            

        int modulo=0;
        Scanner ler = new Scanner(System.in);
        System.out.println("ERRO FUNÇÃO NAO DIPONIVEL NO CELULAR REDIGITE UMA  FUNÇÃO VALIDA!!\n");
        System.out.println("Funçoes do celular\n");
        System.out.println("1-ligar para numero da agenda.");
        System.out.println("2-Dicar um numero para ligar.");
        System.out.println("3-reproduzir musica.");
        System.out.println("4-Acessar a página web");
        modulo= ler.nextInt();



        
        Celular.Ligar(modulo);
        Celular.ReproduzirMusica(modulo);
        Celular.Interne(modulo);
        Celular.Informacao(modulo);

        }
    }

    

}





    


public class Celular extends Configuracao 
{
    public static void main(String[] args) throws Exception {
        int modulo=0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Funçoes do celular\n");
        System.out.println("1-ligar para numero da agenda.");
        System.out.println("2-Dicar um numero para ligar.");
        System.out.println("3-reproduzir musica.");
        System.out.println("4-Acessar a página web");
        
        modulo= ler.nextInt();



        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Celular.Ligar(modulo);
        Celular.ReproduzirMusica(modulo);
        Celular.Interne(modulo);
        Celular.Informacao(modulo);


       
    }
}
