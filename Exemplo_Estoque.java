package br.com.newton.poo.aula3;

public class Exemplo_Estoque {
							//
	private String nome;    //   Atributos da classe !
	private int qtdAtual;   //   Encapsulados pelo "private" !   
	private int qtdMinima;  //   
							//
	
	public Exemplo_Estoque() {
	}
	//                            ||
	// Criando o construtor !     ||
	//	Atalho = Ctrl+3 / GCUF	  \/
	//

	public Exemplo_Estoque(String nome, int qtdAtual, int qtdMinima) {
		super();                     //  Usado quando existe uma classe filha !
		this.nome = nome;            //  
		this.qtdAtual = qtdAtual;    //  this = recebendo atributos da própria classe !
		this.qtdMinima = qtdMinima;  //
	}
	
	// Set = Método para alterar o valor do Atributo, não retorna ('this')!
	// Get = Retornar o conteúdo do Atributo (Sempre retorna = 'return') !
	//
	// Criando Get e Set !
	// Atalho = Ctrl+3 / GGAS !
	//

	public /*Modificador*/ String /*tipo do Retorno*/ getNome( /*Parâmetros*/ ) {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdAtual() {
		return qtdAtual;
	}

	public void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	public int getQtdMinima() {
		return qtdMinima;
	}

	public void setQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	
	public void darBaixa(int qtde) {
		if (qtde<=this.qtdAtual)
			this.qtdAtual -= qtde;
		else 
			System.out.println("Impossível dar baixa no estoque!");
	}
	
	public boolean precisaRepor() {
		if (this.qtdAtual<=this.getQtdMinima())
			return true;
		else
			return false;
	}
	
	public String mostra() {
		return "produto: " + getNome() + "\nEstoque Atual: " + getQtdAtual() + "\nEstoque Mínimo: " + getQtdMinima();
	}
}


