package servicos;

import entidades.Pesquisa;

import java.util.List;

import entidades.Banco;


public class ServicoDoBancoDeDados {
	
	Banco banco = new Banco();
	
	public Pesquisa salvar(Pesquisa pesquisa) {
		
		List<Pesquisa> pesquisas = procurarTodos();
		if(!pesquisas.isEmpty()) {
			Pesquisa ultimaPesquisa = pesquisas.get(pesquisas.size() - 1);
			pesquisa.setId(ultimaPesquisa.getId() + 1);
			return banco.addPesquisa(pesquisa);
		}
		else {
			pesquisa.setId(1);
			return banco.addPesquisa(pesquisa);
		}
	}
	
	public List<Pesquisa> procurarTodos(){
		return banco.getPesquisas();
	}
	
}
