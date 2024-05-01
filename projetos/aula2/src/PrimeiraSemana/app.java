package PrimeiraSemana;
public class app {
    public static void main(String[] args) throws Exception
     {
        String nome="Vitor";
        String sobrenome="Abreu";
        String NomeFinal=NomeCompleto(nome, sobrenome);
        System.out.println("Bem vindo "+NomeFinal);

       
    }


    public static String NomeCompleto(String nome,String sobrenome)
    {

        return nome.concat(" ").concat(sobrenome);
    }

}