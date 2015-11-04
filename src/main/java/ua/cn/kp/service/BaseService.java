package ua.cn.kp.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ua.cn.kp.domain.Base;

@SuppressWarnings("unchecked")
public class BaseService<T extends Base> implements IBaseService<T>{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void add(T t) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(t);
	}

	public void del(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void edit(T t) {
		// TODO Auto-generated method stub
		
	}

	
}
