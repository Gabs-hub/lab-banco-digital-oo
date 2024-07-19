public class Main {

	public static void main(String[] args) {
		// Existe agora uma verificação de formato de CPF
		Cliente venilton = new Cliente("Venilton", "911.432.008-20");

		ContaCorrente cc = new ContaCorrente(venilton);
		ContaPoupanca poupanca = new ContaPoupanca(venilton);

		// Impossível criar conta com CPF's iguais
		// ContaCorrente poupanca2 = new ContaCorrente(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		// Novos métodos
		cc.exibirContas();
		poupanca.exibirContas();

	}

}
