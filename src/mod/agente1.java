package mod;
/**
 * @author Anderson
 * Desenvolvimento prático
 * 
 * Olá, meu nome é Anderson Carlos, e primeiramente gostaria de agradecer pela oportunidade, 
 * e deixar claro que esses dois últimos dias (17/09/2021 e 18/09/2021), foram de intensa dedicação 
 * para adquirir conhecimentos na programação java, pois foi o primeiro contato com a linguagem.
 * 
 * A priore, o objetivo era desenvolver uma interface gráfica assim como foi pedido, mas nao tinha 
 * conhecimentos suficientes para tal.
 * 
 * Então, estudei a diferença de back-end e front-end, junto com a função do framework.
 * 
 * Busquei compreender o que seria uma arquitetura MVC e sua funcionalidade na programação.
 * 
 * entao com o intuito de demonstrar os conheccimentos adquirido tentei honrar o máximo do que foi
 * pedido no desafio prático, observando conceitos de orientação a objetos, organização do código
 * e o padrao bem estabelecido.
 * 
 */

// o import foi necessario pela utilização do scanner durante o codigo
import java.util.Scanner;

public class agente1 {
	// primeiro foi criado um mood, para servir como padrão
	
	

	public static void main(String[] args) {
		Mood agente1 = new Mood();
		// depois fiz as entradas de dados 
		Scanner name =new Scanner(System.in);
		System.out.println("Digite o nome do funcionário: ");
		agente1.nome = name.next();
		
		Scanner Cpf = new Scanner(System.in);
		System.out.println("Digite o cpf do funcionário: ");
		agente1.cpf = Cpf.nextInt();
		
		Scanner data =new Scanner(System.in);
		System.out.println("Digite a data de nascimento: ");
		agente1.nascimento = data.nextInt();
		
		Scanner Cargo = new Scanner(System.in);
		System.out.println("Digite o cargo ocupado: ");
		agente1.cargo = Cargo.next();
		//após as entradas fiz o fechamento para nao deixar em aberto
		name.close();
		Cpf.close();
		data.close();
		Cargo.close();
		//e para finalizar, descrevi os dados que foram atribuidos para cada espaço alocado
		System.out.println("nome: " + agente1.nome);
		System.out.println("cpf: " + agente1.cpf);
		System.out.println("Data de nascimento: " + agente1.nascimento);
		System.out.println("Cargo: " + agente1.cargo);
		agente1.cadastrar();
		
		//agradeço por serem a fomentação de todo esse aprendizado


	}

}
