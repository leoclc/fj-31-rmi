package br.com.caelum.loja.cliente;

import java.rmi.Naming;

public class ClienteLojaCarrinho {
	public static void main(String[] args) throws Exception {
		Carrinho car = (Carrinho) Naming.lookup("rmi://localhost:1099/loja/carrinho");
		System.out.println(car.getClass());
		System.out.println(car.toString());
		Livro l1 = new Livro();
		l1.setNome("Pais e filhos");
		l1.setPreço(100.0);
		
		Livro l2 = new Livro();
		l2.setNome("Noites brancas");
		l2.setPreço(200.0);
		
		car.addLivro(l1);
		car.addLivro(l2);
		
		System.out.println(car.getTotal());
		
	}
}
