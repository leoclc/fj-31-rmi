package br.com.caelum.loja.cliente;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Carrinho extends Remote {
	void addLivro(Livro livro) throws RemoteException;
	List<Livro> getLivros() throws RemoteException;
	double getTotal() throws RemoteException;
}
