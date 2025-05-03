package cadastro.com.sistema_cadastro.services;

import cadastro.com.sistema_cadastro.entities.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SistemasDeEstoque {

    List<Produto> produtos = new ArrayList<>();

    public void adicionarprduto(Produto produto) {
        produtos.add(produto);
    }
    public List<Produto> listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getName());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEmEstoque());
            System.out.println("------------------------------");
        }
        return produtos;
    }

    public void atualizarEstoque(Produto produto, int quantidade) {
        produto.setQuantidadeEmEstoque(quantidade);
    }
}
