import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Cliente {

	private String nome;
	private String cpf;

	// Expressão regular para o formato de CPF
	private static final String CPF_PATTERN = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
	private static final Pattern pattern = Pattern.compile(CPF_PATTERN);

	public Cliente(String nome, String cpf) {
		if (!isValidCPF(cpf)) {
			throw new IllegalArgumentException("CPF inválido! Formato correto: XXX.XXX.XXX-XX");
		}
		this.nome = nome;
		this.cpf = cpf;
	}

	// Método para validar o formato do CPF
	private static boolean isValidCPF(String cpf) {
		if (cpf == null) {
			return false;
		}
		Matcher matcher = pattern.matcher(cpf);
		return matcher.matches();
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return nome;
	}
}