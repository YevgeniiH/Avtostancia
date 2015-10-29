package ua.cn.kp.service;

import java.util.List;

import ua.cn.kp.domain.Order;

public interface IOrderService {
	
	public void addOrder(Order order);
	
	public void delOrder(Integer id);
	
	public Order getOrder(Integer id);
	
	public List<Order> listOrder();
	
	public void edtOrder(Order order);

}
