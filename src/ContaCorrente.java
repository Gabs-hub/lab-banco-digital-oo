import java.util.HashMap;
import java.util.Map;

public class ContaCorrente extends Conta {
	private static Map<String, Cliente> contaMap = new HashMap<>();

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		adicionarConta(cliente.getCpf(), cliente);
	}

	private void adicionarConta(String cpf, Cliente c){
		if (contaMap.containsKey(cpf)){
			throw new RuntimeException("Erro ao criar a conta, o CPF " + cpf + " já foi usado!");
		}else{
			contaMap.put(cpf, c);
		}
	}

	public void exibirContas(){
		System.out.println(contaMap.size() + " contas corrente encontradas: "+ contaMap);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
