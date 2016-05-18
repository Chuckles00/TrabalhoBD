package unb.bd.trab.infra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import unb.bd.trab.entidades.Teste;
import unb.bd.trab.infra.dao.TesteDao;

@Component
public class TesteService extends BaseService {
	@Autowired
	private TesteDao dao;
	
	public void save(Teste teste){
		dao.save(teste);
	}
}
