package mod;
/**
 * @author Anderson
 * Desenvolvimento pr�tico
 */
import java.util.Random;
// aqui esta o mood utilizado para servir de base par outros cadastros
public class Mood {
	String nome;
	int cpf;
	int nascimento;
	String cargo;
	void cadastrar() {
		System.out.println("usu�rio cadastrado.");
	}
	void cancelamento() {
		System.out.println("usu�rio dasabilitado.");
	}
	public Mood() {
		Random gerador = new Random();
		int cadastro = gerador.nextInt(100);
		System.out.println("Cadastro: " + cadastro);
	}

}
