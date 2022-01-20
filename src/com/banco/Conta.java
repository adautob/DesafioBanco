package com.banco;

public class Conta {
	Cliente cliente;
	Double saldo;
	
	public Conta(Cliente cliente, Double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	protected void Sacar(Double valor) {
		saldo -= valor;
	}
	
	protected void Depositar(Double valor) {
		saldo += valor;
	}
	
	protected void Transferir(Double valor, Conta contaDestino) {
		this.Sacar(valor);
		contaDestino.Depositar(valor);
	}
	
	public void verSaldo() {
		System.out.println("Saldo: "+ this.saldo);
	}
	
	public void verCliente() {
		System.out.println(this.cliente);
	}
	
	
}
