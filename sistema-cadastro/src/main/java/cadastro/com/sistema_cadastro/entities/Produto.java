package cadastro.com.sistema_cadastro.entities;


public class Produto {
    private String name;
    private Double preco;
    private Integer quantidadeEmEstoque ;

    public Produto() {
    }
    public Produto(String name, Double preco, Integer quantidadeEmEstoque) {
        this.name = name;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}
