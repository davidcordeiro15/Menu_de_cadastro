package br.com.david.Menu_de_Cadastro.models;

//Cria o objeto do produto para cadastro, já com seus métodos get e set. 
public class Produto {
    private String nome;
    private String descricao;
    public Double valorProduto;
    private String disponibilidade;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getValorProduto() {
        return valorProduto;
    }
    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }
    public String getDisponibilidade() {
        return disponibilidade;
    }
    public void setDisponibilidade(String disponibilidade) {
        if (disponibilidade.equals("SIM")) {
            this.disponibilidade = "Disponível";
        } else if (disponibilidade.equals("NÃO")) {
            this.disponibilidade = "Não disponível";
        }
    }
    

    
    
    
}