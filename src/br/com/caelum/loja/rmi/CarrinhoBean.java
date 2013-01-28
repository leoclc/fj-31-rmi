package br.com.caelum.loja.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.loja.cliente.Carrinho;
import br.com.caelum.loja.cliente.Livro;

public class CarrinhoBean extends UnicastRemoteObject implements Carrinho {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private double total;
	private List<Livro> livros = new ArrayList<Livro>();
	
	protected CarrinhoBean() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addLivro(Livro livro) throws RemoteException {
	livros.add(livro);
	total += livro.getPreço();
	System.out.println("Livro adicionado: "+livro.getNome());
	}

	@Override
	public List<Livro> getLivros() throws RemoteException {
		return this.livros;
	}

	@Override
	public double getTotal() throws RemoteException {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
}
