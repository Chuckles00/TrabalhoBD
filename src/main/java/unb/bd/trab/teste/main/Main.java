package unb.bd.trab.teste.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import unb.bd.trab.entidades.Teste;

public class Main {
	public Main() {
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("bd");
		EntityManager manager = fac.createEntityManager();
		
		System.out.println(manager.createQuery(manager.getCriteriaBuilder().createQuery(Teste.class)).getResultList());
	}
}
