package br.com.senaisp.aula27.classes;

import java.util.ArrayList;
import java.util.List;

public class ConexaoFake {
	private static ConexaoFake instancia;
	private List<Cliente> listaCliente;
	//constructor
	private ConexaoFake() {
		listaCliente = new ArrayList<Cliente>();
	}
	
	public List<Cliente> getListaCliente(){
		return listaCliente;
	}
	
	public static synchronized ConexaoFake getInstance() {
		if (instancia == null) {
			instancia = new ConexaoFake();
		}
		return instancia;
	}
}
