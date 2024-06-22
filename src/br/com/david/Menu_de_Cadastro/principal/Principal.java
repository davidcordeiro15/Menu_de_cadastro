package br.com.david.Menu_de_Cadastro.principal;


import java.util.Scanner;


import br.com.david.Menu_de_Cadastro.service.CadastrarProduto;
public class Principal {
    private Scanner leitor = new Scanner(System.in);
    private CadastrarProduto cadastro = new CadastrarProduto();
    public void ExibeMenu() {
    
        System.out.println("""
            ************************************

                    Bem vindo ao programa!

            ************************************
            """);
        
        //Exibe o menu de opções e verifica se as entradas estão corretas (não nulas).
        int escolha = 0;
        while (escolha != 2) {
            System.out.println("""

                Essas são as ações:
                1 - Cadastrar Produto e depois listá-lo
                2 - Finalizar Programa

                    """);
            String input = leitor.nextLine();
            try {
                escolha = Integer.parseInt(input);
                if (escolha == 1) {
                    cadastro.cadastrarProduto(); 
                } 
            }catch (NumberFormatException e) {
                System.out.println("Você deve colocar um número e não uma letra!"); 
            }
        }

            
        
         
        System.out.println("Programa Finalizado!");
        
    }
}
