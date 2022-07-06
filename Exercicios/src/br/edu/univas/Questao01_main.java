package br.edu.univas;

public class Questao01_main {
	
	public static void main(String[] args) {
		
		ArvoreBinaria arvore = new ArvoreBinaria();
		
		Entidade entidadeF = new Entidade ("F");
		No noF = arvore.criarNovoNo(entidadeF);
		
		Entidade entidadeE = new Entidade ("E");
		No noE = arvore.criarNovoNo(entidadeE);
		
		Entidade entidadeD = new Entidade ("D");
		No noD = arvore.criarNovoNo(entidadeD);
		
		Entidade entidadeC = new Entidade ("C");
		No noC = arvore.criarSubArvore(entidadeC, noE, noF);
		
		Entidade entidadeB = new Entidade ("B");
		No noB = arvore.criarSubArvore(entidadeB, null, noD);
		
		Entidade entidadeA = new Entidade ("A");
		arvore.criarRaiz(entidadeA, noB, noC);
		
		arvore.imprimir();
		
	}

}
