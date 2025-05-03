package cadastro.com.sistema_cadastro;

import cadastro.com.sistema_cadastro.entities.Produto;
import cadastro.com.sistema_cadastro.services.SistemasDeEstoque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaCadastroApplication implements CommandLineRunner {

	@Autowired
	private SistemasDeEstoque sistemasDeEstoque;

	public static void main(String[] args) {
		SpringApplication.run(SistemaCadastroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Produto produto1 = new Produto("Computador", 2000.0, 10);
		Produto produto2 = new Produto("NarutoFigurie", 100.0, 20);

		sistemasDeEstoque.adicionarprduto(produto1);
		sistemasDeEstoque.adicionarprduto(produto2);

		System.out.println("Lista de produtos:");
		sistemasDeEstoque.listarProdutos();

		System.out.println("Atualizando estoque do produto 1:");

		System.out.println("Produto 1 antes da atualização:");
		System.out.println("Nome: " + produto1.getName());
		System.out.println("Quantidade em Estoque: " + produto1.getQuantidadeEmEstoque());

		sistemasDeEstoque.atualizarEstoque(produto1, 15);
		System.out.println("Produto 1 atualizado:");
		System.out.println("Nome: " + produto1.getName());
		System.out.println("Quantidade em Estoque: " + produto1.getQuantidadeEmEstoque());



	}
}
