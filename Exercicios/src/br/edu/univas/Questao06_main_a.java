package br.edu.univas;

public class Questao06_main_a {
	
	public static void main(String[] args) {
		
		ArvoreBinaria arvore = new ArvoreBinaria();
		
		Entidade entidade8 = new Entidade ("8");
		No no8 = arvore.criarNovoNo(entidade8);
		
		Entidade entidade6 = new Entidade ("6");
		No no6 = arvore.criarNovoNo(entidade6);
		
		Entidade entidade5 = new Entidade ("5");
		No no5 = arvore.criarNovoNo(entidade5);
		
		Entidade entidade1 = new Entidade ("1");
		No no1 = arvore.criarNovoNo(entidade1);
		
		Entidade entidade2 = new Entidade ("2");
		No no2 = arvore.criarSubArvore(entidade2, no6, no8);
		
		Entidade entidade9 = new Entidade ("9");
		No no9 = arvore.criarSubArvore(entidade9, no1, no5);
		
		Entidade entidade4 = new Entidade ("4");
		arvore.criarRaiz(entidade4, no9, no2);
		
		arvore.imprimir();
	}

}
