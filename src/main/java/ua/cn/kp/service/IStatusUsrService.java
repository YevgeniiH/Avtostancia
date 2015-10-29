package ua.cn.kp.service;

import java.util.List;

import ua.cn.kp.domain.StatusUsr;

public interface IStatusUsrService {

	public void addStatusUsr(StatusUsr statusUsr);
	
	public void delStatusUsr(Integer id);
	
	public StatusUsr getStatusUsr(Integer id);
	
	public List<StatusUsr> listStatusUsr();
	
	public void edtStatusUsr(StatusUsr statusUsr);
}
