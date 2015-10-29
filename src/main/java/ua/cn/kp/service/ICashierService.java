package ua.cn.kp.service;

import java.util.List;

import ua.cn.kp.domain.Cashier;

public interface ICashierService {
	
	public void addCashier(Cashier cashier);
	
	public void delCashier(Integer id);
	
	public Cashier getCashier(Integer id);
	
	public List<Cashier> listCashier();
	
	public void edtCashier(Cashier cashier);

}
