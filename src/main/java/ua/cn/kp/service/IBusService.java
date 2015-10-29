package ua.cn.kp.service;

import java.util.List;

import ua.cn.kp.domain.Bus;

public interface IBusService {
	
	public void addBus(Bus bus);
	
	public void delBus(Integer id);
	
	public Bus getBus(Integer id);
	
	public List<Bus> listBus();
	
	public void edtBus(Bus bus);

}
