package ua.cn.kp.service;

import java.util.List;

import ua.cn.kp.domain.Driver;

public interface IDriverService {
	
	public void addDriver(Driver driver);
	
	public void delDriver(Integer id);
	
	public Driver getDriver(Integer id);
	
	public List<Driver> listDriver();
	
	public void edtDriver(Driver driver);

}
