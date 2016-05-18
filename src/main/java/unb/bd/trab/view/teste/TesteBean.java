package unb.bd.trab.view.teste;

import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import unb.bd.trab.entidades.Teste;
import unb.bd.trab.infra.service.TesteService;

@Component
@SessionScoped
public class TesteBean {

	@Autowired
	TesteService service;

	public String teste(){
		Teste teste = new Teste();
		teste.setNome("umValor ai");
		service.save(teste);
		return "index.xhtml?faces-redirect=true";
	}
}
