package ua.cn.kp.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ua.cn.kp.domain.Base;

public class BaseService<T extends Base> implements IBaseService<T>{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void add(T t) {
		sessionFactory.getCurrentSession().persist(t);
	}

	@SuppressWarnings("unchecked")
	public void del(Integer id) {
		T t = (T) sessionFactory.getCurrentSession().load(getClass(), new Integer(id));
        if(null != t){
        	sessionFactory.getCurrentSession().delete(t);
        }
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(Integer id) {   
		T t = (T) sessionFactory.getCurrentSession().load(getClass(), new Integer(id));
		return t;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> list() {
		List<T> tList = sessionFactory.getCurrentSession().createQuery("from T").list();
		return tList;
	}

	@Override
	public void edit(T t) {
		sessionFactory.getCurrentSession().update(t);
	}

	
}
