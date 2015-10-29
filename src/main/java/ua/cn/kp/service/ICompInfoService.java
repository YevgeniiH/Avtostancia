package ua.cn.kp.service;

import java.util.List;

import ua.cn.kp.domain.CompInfo;

public interface ICompInfoService {
	
	public void addCompInfo(CompInfo compInfo);
	
	public void delCompInfo(Integer id);
	
	public CompInfo getCompInfo(Integer id);
	
	public List<CompInfo> listCompInfo();
	
	public void edtCompInfo(CompInfo compInfo);

}
