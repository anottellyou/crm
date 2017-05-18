package com.itheima.crm.base;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

public interface BaseDao<T> {
	public void save(T t);

	public void update(T t);

	public void delete(T t);

	public void saveOrUpdate(T t);

	public T findById(java.io.Serializable id);

	public List<T> findAll();

	public List<T> findAll(String condition, Object[] params);

	public int getTotalRecord(String condition, Object[] params);

	public List<T> findAll(String condition, Object[] params, int startIndex,
			int pageSize);

	public List<T> findAll(DetachedCriteria criteria);

	public List<T> findAll(DetachedCriteria criteria, int startIndex,
			int pageSize);
}
