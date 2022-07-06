package br.edu.univas.vo;

public class ArvoreBinariaBusca {
	
	private No raiz;
	
	public void inserir (Entidade entidade) {
		if (raiz == null) {
			raiz = criarNo(entidade);
		}
		else {
			// inserirNoInterno(raiz, entidade);
		}
	}
	
	//public void inserirNoInterno(No raizDaSubArvore, Entidade novaEntidade) {
	//	if (novaEntidade) {
			
	//	}
	//	if (novaEntidade > raizDaSubArvore.entidade) {
			
	//	} else {
			
	//	}
	//}
	
	public No criarNo (Entidade novaEntidade) {
		No novoNo = new No ();
		novoNo.entidade = novaEntidade;
		return novoNo;
	}

}
