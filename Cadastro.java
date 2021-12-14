package exercicioMercado;

import java.util.Scanner;

import exercicioMercado.Produto;
import exercicioMercado.Cliente;

public class Cadastro {
	public static void main(String[] args) {
		exibirMenu();
	}
	public static void exibirMenu() {
		Cliente c1 = null; // c1 é a variável referente aos atributos Cliente
		Produto p1 = null; // p1 é a variável referente aos atributos Produto
		Scanner ler = new Scanner(System.in);
		char opcao;
		System.out.println("Menu de Cadastro");
		System.out.println("1- Cadastrar Cliente");
		System.out.println("2- Cadastrar Produto");
		System.out.println("3- Exibir Cliente");
		System.out.println("4- Exibir Produto");

		opcao = ler.next().charAt(0);

		switch (opcao) {
		case '1':
			// fará o cadastro do Cliente
			// c1 é a variável referente aos atributos Cliente
			c1 = new Cliente();
			char c;
			System.out.println("Digite o nome do cliente");
			c1.setNome(ler.nextLine());
			System.out.println("Digite o CPF do cliente");
			c1.setCpf(ler.nextLine());
			System.out.println("Digitea data de nascimento do cliente");
			c1.setDataNascimento(ler.nextLine());
			System.out.println("Qual o limite do Cheque Especial?");
			c1.setCelular(ler.nextLine());
			break;
		case '2':
			// fará o cadastro do produto
			// p1 é a variável referente aos atributos Produto
			p1 = new Produto();
			System.out.println("Digite o nome do produto");
			p1.setNome(ler.nextLine());
			System.out.println("Digite a marca do produto");
			p1.setMarca(ler.nextLine());
			System.out.println("Digite o peso líquido do produto");
			p1.setPeso(ler.nextLine());
			System.out.println("Qual o valor desse produto?");
			p1.setValor(ler.nextLine());
			break;
		case '3':
			// c1 é a variável referente aos atributos Cliente
			// Caso não haja cliente cadastrado ainda vai entrar no if
			if (c1 == null) {
				System.out.println("Não há nenhum cliente cadastrado");
				exibirMenu();
			} else {
				System.out.println(c1.getNome());
				System.out.println("CPF nº: " + c1.getCpf());
				System.out.println("Data de Nascimento: " + c1.getDataNascimento());
				System.out.println("Celular: " + c1.getCelular());
			}
			break;
		case '4':
			// p1 é a variável referente aos atributos Produto
			// Caso não haja produto cadastrado ainda vai entrar no if
			if (p1 == null) {
				System.out.println("Não há nenhum produto cadastrado");
				exibirMenu();
			} else {
				System.out.println(p1.getNome());
				System.out.println("Marca: " + p1.getMarca());
				System.out.println("Peso Líquido: " + p1.getPeso());
				System.out.println("Preço: " + p1.getValor());
			}
			break;
		default:
			System.out.println("Opção inválida, tente novamente.");
			exibirMenu();
			break;
		}

	}
}
