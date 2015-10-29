package ua.cn.kp.service;

import java.util.List;

import ua.cn.kp.domain.Town;

public interface ITownService {
	
	public void addTown(Town town);
	
	public void delTown(Integer id);
	
	public Town getTown(Integer id);
	
	public List<Town> listTown();
	
	public void edtTown(Town town);

}
