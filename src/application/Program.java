package application;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program{

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Venilton");
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		cc.depositar(250);
		
		cc.transferir(150, poupanca);
		
		cc.imprimirExtrato();
		
		
		poupanca.imprimirExtrato();
	}

}
