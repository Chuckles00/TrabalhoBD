package unb.bd.trab.infra.dao;

import java.util.List;

public interface Dao<T> {
	public abstract void save(T obj);
	public void saveOrUpdate(T obj);
	public abstract void delete(T obj);
	public void delete(int id);
	public T retrieve(int id);
	public abstract List<T> retrieveAll();
}
