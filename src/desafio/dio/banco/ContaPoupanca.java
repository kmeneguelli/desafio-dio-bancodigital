package desafio.dio.banco;

public class ContaPoupanca extends Conta{
	
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}