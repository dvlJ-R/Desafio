package mod;
/**
 * @author Anderson
 * Desenvolvimento prático
 */
import java.util.Random;
// aqui esta o mood utilizado para servir de base par outros cadastros
public class Mood {
	String nome;
	int cpf;
	int nascimento;
	String cargo;
	void cadastrar() {
		System.out.println("usuário cadastrado.");
	}
	void cancelamento() {
		System.out.println("usuário dasabilitado.");
	}
	public Mood() {
		Random gerador = new Random();
		int cadastro = gerador.nextInt(100);
		System.out.println("Cadastro: " + cadastro);
	}

}
