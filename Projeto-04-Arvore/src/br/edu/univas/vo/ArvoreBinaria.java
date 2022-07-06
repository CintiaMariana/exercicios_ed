package br.edu.univas.vo;



public class ArvoreBinaria {
	
	private No raiz;
	
	public No criarNovoNo(Entidade novaEntidade) {
		No novoNo = new No();
		novoNo.entidade = novaEntidade;
		return novoNo;
	}
	
	public No criarSubArvore(Entidade entidadePai, No esquerda, No direita) {
		No pai = criarNovoNo(entidadePai);
		pai.esquerda = esquerda;
		pai.direita = direita;
		return pai;
	}
	
	public void criarRaiz(Entidade entidadePai, No esquerda, No direita) {
		raiz = criarSubArvore(entidadePai, esquerda, direita);
	}
	
	
	public void imprimir() {
		System.out.println("Iniciando a impressão da Árvore em Pré Ordem :::");
		imprimirPreOrdem(raiz);
		System.out.println("Iniciando a impressão da Árvore em Ordem :::");
		imprimirEmOrdem(raiz);
		System.out.println("Iniciando a impressão da Árvore Pós Ordem :::");
		imprimirPosOrdem(raiz);
	}
	
	public void imprimirPreOrdem(No raizDaSubArvore) {
		if (raizDaSubArvore == null) {
			return;
		}
		System.out.println(raizDaSubArvore.entidade.nome);
		imprimirPreOrdem(raizDaSubArvore.esquerda);
		imprimirPreOrdem(raizDaSubArvore.direita);
	}
	
	public void imprimirEmOrdem(No raizDaSubArvore) {
		if (raizDaSubArvore == null) {
			return;
		}
		imprimirEmOrdem(raizDaSubArvore.esquerda);
		System.out.println(raizDaSubArvore.entidade.nome);
		imprimirEmOrdem(raizDaSubArvore.direita);
	}
	
	public void imprimirPosOrdem(No raizDaSubArvore) {
		if (raizDaSubArvore == null) {
			return;
		}
		imprimirPosOrdem(raizDaSubArvore.esquerda);
		imprimirPosOrdem(raizDaSubArvore.direita);
		System.out.println(raizDaSubArvore.entidade.nome);
		
	}

}
