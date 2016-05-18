package unb.bd.trab.infra.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.MANDATORY)
public abstract class BaseDao<T> implements Dao<T> {
	
	@PersistenceContext
	protected EntityManager entityManager;
	
	
	public EntityManager getEntityManager(){
		return entityManager;
	}

	@Override
	public void save(T obj) {
		getEntityManager().persist(obj);
	}

	@Override
	public void saveOrUpdate(T obj) {
	}

	@Override
	public void delete(T obj) {
		getEntityManager().remove(obj);		
	}

	@Override
	public abstract void delete(int id); 
		// Deve ser implementado pela classe filha
	

	@Override
	public abstract T retrieve(int id);

	@Override
	public abstract List<T> retrieveAll();
}
