package br.com.senaisp.Aula30.classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Cliente {
	private String nome;
	private int idade;
	private String cpf;
	private String rg;
	private Date dtNascimento;

	private List<Object[]> lstClientes;
	private DateFormat dtFmt;

	public Cliente() {
		lstClientes = new ArrayList<Object[]>();
		nome = "";
		idade = 0;
		cpf = "";
		rg = "";
		dtFmt = new SimpleDateFormat("dd/MM/yyyy");
		try {
			dtNascimento = dtFmt.parse("30/12/1899");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public List<Object[]> getLstClientes() {
		return lstClientes;
	}

	public enum TipoArquivo {
		CSV, JSON, XML
	}

	public boolean impotarArquivo(String strArquivo, TipoArquivo tpArq) {
		boolean ret = false;
		switch (tpArq) {
		case CSV:
			ret = lerCSV(strArquivo);
			break;
		case JSON:
			ret = lerJSON(strArquivo);
			break;
		case XML:
			ret = lerXML(strArquivo);
			break;

		}
		return ret;
	}

	public boolean exportarArquivo(String strArquivo, TipoArquivo tpArq) {
		boolean ret = false;
		switch (tpArq) {
		case CSV:
			ret = escreverCSV(strArquivo);
			break;
		case JSON:
			ret = escreverJSON(strArquivo);
			break;
		case XML:
			ret = escreverXML(strArquivo);
			break;
		}
		return ret;
		}
		public boolean gravarEstadoObjeto (String strArquivo) {
		boolean ret = false;	
		File arq = new File(strArquivo);
		try {
			arq.delete();
			arq.createNewFile();
			FileOutputStream fos = new FileOutputStream(arq);
			ObjectOutputStream objStm = new ObjectOutputStream(fos);
			//gravar objeto desejado
			objStm.writeObject(lstClientes);
			objStm.close();
			ret = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		return ret;
	}
	
	public boolean lerEstadoObjeto(String strArquivo) {
		boolean ret = false;
		lstClientes.clear();
		File arq = new File(strArquivo);
		//verificando se o arquivo existe
		if(arq.exists()) {
			try {
				FileInputStream fis = new FileInputStream(arq);
				ObjectInputStream oiStm = new ObjectInputStream(fis);
				lstClientes = (ArrayList<Object[]>)oiStm.readObject();
				oiStm.close();
				ret = true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return ret;
		
	}
		
		
	private boolean escreverCSV(String strArquivo) {
		boolean ret = false;
		try {
			FileOutputStream fos = new FileOutputStream(strArquivo);
			OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8); 
			BufferedWriter buf = new BufferedWriter(osw);
			//Gravando o cabeçalho do arquivo CSV
			buf.write("nome,idade,cpf,rg,data_nasc\r\n");
			// usando o foreach para pegar os itens da linha
			for (Object it[]: lstClientes) {
				buf.write(it[0]+",");//nome
				buf.write(it[1]+",");//idade
				buf.write(it[2]+",");//cpf
				buf.write(it[3]+",");//rg
				buf.write(dtFmt.format(it[4]));//data_nasc
				buf.write("\r\n");//quebra de linha
			}
			buf.close();
			ret = true;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		return ret;
	}

	private boolean escreverJSON(String strArquivo) {
		boolean ret = false;
		try {
			FileOutputStream fos = new FileOutputStream(strArquivo);
			OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8); 
			BufferedWriter buf = new BufferedWriter(osw);
			//criando objeto JSON Array
			JSONArray itens = new JSONArray();
			for(Object obj[]: lstClientes) {
				//criando objeto JSON para colocar campos
				JSONObject item = new JSONObject();
				item.put("nome", obj[0]);
				item.put("idade", obj[1]);
				item.put("cpf", obj[2]);
				item.put("rg", obj[3]);
				item.put("data_nasc", dtFmt.format(obj[4]));
				//adicionando itens ao vetor
				itens.put(item);
			}
			buf.write(itens.toString());
			buf.close();
			ret = true;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return ret;
	}

	private boolean escreverXML(String strArquivo) {
		boolean ret = false;
		
		DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder build = fact.newDocumentBuilder();
			Document doc = build.newDocument();
			//criando elemento principal do documento
			Element root = doc.createElement("root");
			doc.appendChild(root);
			//percorrendo os itens para gerar os elementos xml
			for(Object obj[]:lstClientes) {
				Element linha = doc.createElement("row");
				
				linha.appendChild(criarNo(doc,"nome",(String) obj[0]));
				linha.appendChild(criarNo(doc,"idade",Integer.toString((int) obj[1])));
				linha.appendChild(criarNo(doc,"cpf",(String) obj[2]));
				linha.appendChild(criarNo(doc,"rg",(String) obj[3]));
				linha.appendChild(criarNo(doc,"data_nasc",dtFmt.format((Date) obj[4])));
				//adicionando a linha ao root
				root.appendChild(linha);
				
			}
			TransformerFactory transFact = TransformerFactory.newInstance();
			Transformer transf = transFact.newTransformer();
			DOMSource dom = new DOMSource(doc);
			FileOutputStream fos = new FileOutputStream(strArquivo);
			StreamResult strRes = new StreamResult(fos); 
			
			
			transf.transform(dom, strRes);
			ret = true;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return ret;
	}

	private Node criarNo(Document doc, String string, String conteudoNo) {
		Element el = doc.createElement(string);
		el.appendChild(doc.createTextNode(conteudoNo));
		return el;
	}

	private boolean lerXML(String strArquivo) {
		boolean ret = false;
		lstClientes.clear();
		try {
			FileInputStream fis = new FileInputStream(strArquivo);
			DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
			DocumentBuilder build = fact.newDocumentBuilder();
			// transformando o arquivo em objeto xml (DOM)
			Document doc = build.parse(fis);
			// obtendo o elemento raiz
			Element noRoot = doc.getDocumentElement();
			// obtendo os elementos row
			NodeList listaNos = noRoot.getElementsByTagName("row");
			for (int intI = 0; intI < listaNos.getLength(); intI++) {
				Node item = listaNos.item(intI);
				if (item instanceof Element) {
					Element itt = (Element) item;
					nome = itt.getElementsByTagName("nome").item(0).getTextContent();
					idade = Integer.parseInt(itt.getElementsByTagName("idade").item(0).getTextContent());
					cpf = itt.getElementsByTagName("cpf").item(0).getTextContent();
					rg = itt.getElementsByTagName("rg").item(0).getTextContent();
					dtNascimento = dtFmt.parse(itt.getElementsByTagName("data_nasc").item(0).getTextContent());
					Object obj[] = { nome, idade, cpf, rg, dtNascimento

					};
					lstClientes.add(obj);
				}
			}
			ret = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ret;
	}

	private boolean lerJSON(String strArquivo) {
		lstClientes.clear();
		boolean ret = false;
		try {
			FileInputStream fis = new FileInputStream(strArquivo);
			InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
			BufferedReader buf = new BufferedReader(isr);
			StringBuilder stb = new StringBuilder();

			// Retirando a primeira linha
			String linha;
			// Lendo a partir da segunda linha
			while ((linha = buf.readLine()) != null) {
				stb.append(linha);

			}
			buf.close();
			JSONArray itens = new JSONArray(stb.toString());
			for (int intI = 0; intI < itens.length(); intI++) {
				JSONObject it = itens.getJSONObject(intI);
				Object obj[] = { it.getString("nome"), it.getInt("idade"), it.getString("cpf"), it.getString("rg"),
						dtFmt.parse(it.getString("data_nasc")),

				};
				lstClientes.add(obj);
			}

			ret = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}

	private boolean lerCSV(String strArquivo) {
		lstClientes.clear();
		boolean ret = false;
		try {
			FileInputStream fis = new FileInputStream(strArquivo);
			InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
			BufferedReader buf = new BufferedReader(isr);
			// Retirando a primeira linha
			String linha = buf.readLine();
			// Lendo a partir da segunda linha
			while ((linha = buf.readLine()) != null) {
				List<String> itens = Arrays.asList(linha.split("\\s*,\\s*"));// \\s* significa que irá pegar qualquer
																				// texto entre virgula
				dtNascimento = dtFmt.parse(itens.get(4));
				Object obj[] = { itens.get(0), Integer.parseInt(itens.get(1)), itens.get(2), itens.get(3),
						dtNascimento };
				lstClientes.add(obj);
			}
			buf.close();
			ret = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;

	}

}
