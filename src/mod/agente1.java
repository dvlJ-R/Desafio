package mod;
/**
 * @author Anderson
 * Desenvolvimento pr�tico
 * 
 * Ol�, meu nome � Anderson Carlos, e primeiramente gostaria de agradecer pela oportunidade, 
 * e deixar claro que esses dois �ltimos dias (17/09/2021 e 18/09/2021), foram de intensa dedica��o 
 * para adquirir conhecimentos na programa��o java, pois foi o primeiro contato com a linguagem.
 * 
 * A priore, o objetivo era desenvolver uma interface gr�fica assim como foi pedido, mas nao tinha 
 * conhecimentos suficientes para tal.
 * 
 * Ent�o, estudei a diferen�a de back-end e front-end, junto com a fun��o do framework.
 * 
 * Busquei compreender o que seria uma arquitetura MVC e sua funcionalidade na programa��o.
 * 
 * entao com o intuito de demonstrar os conheccimentos adquirido tentei honrar o m�ximo do que foi
 * pedido no desafio pr�tico, observando conceitos de orienta��o a objetos, organiza��o do c�digo
 * e o padrao bem estabelecido.
 * 
 */

// o import foi necessario pela utiliza��o do scanner durante o codigo
import java.util.Scanner;

public class agente1 {
	// primeiro foi criado um mood, para servir como padr�o
	
	

	public static void main(String[] args) {
		Mood agente1 = new Mood();
		// depois fiz as entradas de dados 
		Scanner name =new Scanner(System.in);
		System.out.println("Digite o nome do funcion�rio: ");
		agente1.nome = name.next();
		
		Scanner Cpf = new Scanner(System.in);
		System.out.println("Digite o cpf do funcion�rio: ");
		agente1.cpf = Cpf.nextInt();
		
		Scanner data =new Scanner(System.in);
		System.out.println("Digite a data de nascimento: ");
		agente1.nascimento = data.nextInt();
		
		Scanner Cargo = new Scanner(System.in);
		System.out.println("Digite o cargo ocupado: ");
		agente1.cargo = Cargo.next();
		//ap�s as entradas fiz o fechamento para nao deixar em aberto
		name.close();
		Cpf.close();
		data.close();
		Cargo.close();
		//e para finalizar, descrevi os dados que foram atribuidos para cada espa�o alocado
		System.out.println("nome: " + agente1.nome);
		System.out.println("cpf: " + agente1.cpf);
		System.out.println("Data de nascimento: " + agente1.nascimento);
		System.out.println("Cargo: " + agente1.cargo);
		agente1.cadastrar();
		
		//agrade�o por serem a fomenta��o de todo esse aprendizado


	}

}
