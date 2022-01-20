package com.banco;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente(1, "Adauto", "123456789");
		Conta conta = new ContaCorrente(cliente, 1000d);
		
		Cliente cliente2 = new Cliente(2, "Amanda", "987654321");
		Conta conta2 = new ContaCorrente(cliente2, 5621.0);
		
		conta.verCliente();
		conta.verSaldo();
		
		conta2.verCliente();
		conta2.verSaldo();
		
		conta.Transferir(200d, conta2);
		
		conta.verCliente();
		conta.verSaldo();
		
		conta2.verCliente();
		conta2.verSaldo();
		
		Cliente cliente3 = new Cliente(3, "Daniel", "987654321");
		Cliente cliente4 = new Cliente(4, "Davi", "987654321");
		Cliente cliente5 = new Cliente(5, "Isaque", "987654321");
		
		System.out.println(cliente3);
		System.out.println(cliente4);
		System.out.println(cliente5);

	}

}
