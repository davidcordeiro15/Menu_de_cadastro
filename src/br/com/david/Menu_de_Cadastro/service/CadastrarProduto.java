package br.com.david.Menu_de_Cadastro.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import br.com.david.Menu_de_Cadastro.models.Produto;

public class CadastrarProduto {
    private Scanner leitor = new Scanner(System.in);
    private List<Produto> ListaDeProdutos = new ArrayList<>();

    public void cadastrarProduto() {
        Produto produto = new Produto(); 

        //Cria e verifica se a entrada do nome está correto (não nulas).
        System.out.println("Qual o nome do Produto?");
        String guardaString = leitor.nextLine();
        while (guardaString.isEmpty()) {
            System.out.println("Nome do produto não pode ser vazio. Digite novamente:");
            guardaString = leitor.nextLine();
        }
        produto.setNome(guardaString);

        //Cria e verifica se a entrada da descrição está correta (não nulas).
        System.out.println("Qual a descrição do produto?");
        guardaString = leitor.nextLine();
        while (guardaString.isEmpty()) {
            System.out.println("Descrição do produto não pode ser vazia, digite novamente:");
            guardaString = leitor.nextLine();
        }
        produto.setDescricao(guardaString);

        //Cria e verifica se a entrada do valor está correto (não nulas).
        Double guardaDouble = null;
        while (guardaDouble == null) {
            System.out.println("Qual o valor do Produto?");
            String valorInput = leitor.nextLine();
            try {
                guardaDouble = Double.parseDouble(valorInput);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite novamente.");
            }
        }
        produto.setValorProduto(guardaDouble);

        //Cria e verifica se a entrada da disponibilidade está correta (não nulas).
        System.out.println("Esse produto em disponibilidade para venda? (sim/não)");
        guardaString = leitor.nextLine();

        while (!guardaString.toUpperCase().equals("SIM") && !guardaString.toUpperCase().equals("NÃO")) {
            System.out.println("Digite novamente a disponibilidade do item: ");
            guardaString = leitor.nextLine();
        }
        produto.setDisponibilidade(guardaString);

        ListaDeProdutos.add(produto);

        //Ordena os produtos por menor valor.
        ListaDeProdutos.stream()
                       .sorted(Comparator.comparing(Produto::getValorProduto))
                       .forEach(p -> System.out.println(
                                        "\nNome do Produto: " + p.getNome() +
                                        "\nValor: R$" + p.getValorProduto()));
    }
}