package br.edu.univas;

public class Questao06_main_b {
	
public static void main(String[] args) {
		
		ArvoreBinaria arvore = new ArvoreBinaria();
		
		Entidade entidade4 = new Entidade ("4");
		No no4 = arvore.criarNovoNo(entidade4);
		
		Entidade entidade5 = new Entidade ("5");
		No no5 = arvore.criarNovoNo(entidade5);
		
		Entidade entidade8 = new Entidade ("8");
		No no8 = arvore.criarNovoNo(entidade8);
		
		Entidade entidade10 = new Entidade ("10");
		No no10 = arvore.criarNovoNo(entidade10);
		
		Entidade entidade11 = new Entidade ("11");
		No no11 = arvore.criarNovoNo(entidade11);
		
		Entidade entidade2 = new Entidade ("2");
		No no2 = arvore.criarNovoNo(entidade2);
		
		Entidade entidade3 = new Entidade ("3");
		No no3 = arvore.criarSubArvore(entidade3, no4, no5);
		
		Entidade entidade7 = new Entidade ("7");
		No no7 = arvore.criarSubArvore(entidade7, no8, null);
		
		Entidade entidade9 = new Entidade ("9");
		No no9 = arvore.criarSubArvore(entidade9, no10, no11);
		
		Entidade entidade1 = new Entidade ("1");
		No no1 = arvore.criarSubArvore(entidade1, no2, no3);
		
		Entidade entidade6 = new Entidade ("6");
		No no6 = arvore.criarSubArvore(entidade6, no7, no9);
		
		Entidade entidade0 = new Entidade ("0");
		arvore.criarRaiz(entidade0, no1, no6);
		
		arvore.imprimir();
	}

}
