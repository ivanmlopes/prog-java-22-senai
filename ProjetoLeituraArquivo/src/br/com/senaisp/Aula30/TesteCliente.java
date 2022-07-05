package br.com.senaisp.Aula30;

import br.com.senaisp.Aula30.classes.Cliente;
import br.com.senaisp.Aula30.classes.Cliente.TipoArquivo;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cli = new Cliente();
		//cli.impotarArquivo("C:\\Users\\Aluno\\Downloads\\convertcsv.csv", TipoArquivo.CSV);
		//cli.impotarArquivo("C:\\Users\\Aluno\\Downloads\\data.json", TipoArquivo.JSON);
		//cli.impotarArquivo("C:\\Users\\Aluno\\Downloads\\convertjson.xml", TipoArquivo.XML);
		// gravando o estado do objeto
		//cli.gravarEstadoObjeto("C:\\\\Users\\\\Aluno\\\\Downloads\\\\objetos.dat");
		cli.lerEstadoObjeto("C:\\\\Users\\\\Aluno\\\\Downloads\\\\objetos.dat");
		for(Object obj[]: cli.getLstClientes()) {
			System.out.println(obj[0] + "  -  "+obj[1]+" - "+obj[2]);
			obj[0]+=" - Alterado";
			
		}
		cli.getLstClientes().remove(5);
		cli.exportarArquivo("C:\\Users\\Aluno\\Downloads\\exportado.csv", TipoArquivo.CSV);
		cli.exportarArquivo("C:\\Users\\Aluno\\Downloads\\exportado.json", TipoArquivo.JSON);
		cli.exportarArquivo("C:\\Users\\Aluno\\Downloads\\exportado.xml", TipoArquivo.XML);
	}

}
