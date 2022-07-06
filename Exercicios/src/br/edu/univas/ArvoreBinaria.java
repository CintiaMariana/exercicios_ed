package br.edu.univas;

import java.util.ArrayList;
import java.util.List;

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
	
	// Questão 7 - Quantidade de Nos
	public int quantidadeNos() {
		return calcularQuantidadeNos(raiz);
	}
	
	private int calcularQuantidadeNos(No no) {
		if (no == null) {
			return 0;
		}
		int qtdEsquerda = calcularQuantidadeNos(no.esquerda);
		int qtdDireita = calcularQuantidadeNos(no.direita);
		
		return 1 + qtdEsquerda + qtdDireita;
	}
	
	public int altura() {
		return calcularMaiorNivel(raiz,0);
	}
	
	private int calcularMaiorNivel(No no, int nivel) {
		if (no == null) {
			return nivel - 1;
		}
		int nivelEsquerda = calcularMaiorNivel(no.esquerda, nivel + 1);
		int nivelDireita = calcularMaiorNivel(no.direita, nivel + 1);
		return Math.max(nivelEsquerda, nivelDireita);
		
	}
	
	public Entidade buscarElementos (String buscado) {
		return buscarElementoRecursivo(raiz, buscado);
	}
	
	public Entidade buscarElementoRecursivo(No raizDaSubArvore, String buscado) {
		if (raizDaSubArvore == null) {
			return null;
		}
		if (raizDaSubArvore.entidade.nome.equals(buscado)) {
			return raizDaSubArvore.entidade;
		}
		Entidade encontouEsq = buscarElementoRecursivo(raizDaSubArvore.esquerda,buscado);
		if (encontouEsq != null) {
			return encontouEsq;
		}
		return buscarElementoRecursivo(raizDaSubArvore.direita, buscado);
	}
	
	public Entidade buscarElementoNR(String buscado) {
		List<No> aguardando = new ArrayList<>();
		aguardando.add(raiz);
		
		while (!aguardando.isEmpty()) {
			No current = aguardando.remove(0);
			if (current.entidade.nome.equals(buscado)) {
				return current.entidade;
			}
			if (current.esquerda != null) {
				aguardando.add(current.esquerda);
			}
			if (current.direita != null) {
				aguardando.add(current.direita);
			}
		}
		return null;
		
	}
	

}
