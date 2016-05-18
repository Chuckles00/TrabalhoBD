package unb.bd.trab.infra.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.springframework.stereotype.Repository;

import unb.bd.trab.entidades.Teste;

@Repository
public class TesteDao extends BaseDao<Teste> {

	@Override
	public void delete(int id) {
		Teste t = retrieve(id);
		if (t != null) {
			getEntityManager().remove(t);
		}
	}
	@Override
	public Teste retrieve(int id) {
		return getEntityManager().find(Teste.class, id);
	}
	
	@Override
	public List<Teste> retrieveAll() {
		CriteriaQuery<Teste> cq = getEntityManager().getCriteriaBuilder()
				.createQuery(Teste.class);
		cq.distinct(true);
		cq.select(cq.from(Teste.class));
		return getEntityManager().createQuery(cq).getResultList();
	}
}
