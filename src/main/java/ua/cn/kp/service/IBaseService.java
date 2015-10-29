package ua.cn.kp.service;

import java.util.List;

import ua.cn.kp.domain.Base;

public interface IBaseService<T extends Base> {

	public void add(T t);
	
	public void del(Integer id);
	
	public T get(Integer id);
	
	public List<T> list();
	
	public void edit(T t);
	
}
