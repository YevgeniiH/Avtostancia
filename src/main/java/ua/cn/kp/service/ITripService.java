package ua.cn.kp.service;

import java.util.List;

import ua.cn.kp.domain.Trip;

public interface ITripService {

	public void addTrip(Trip trip);
	
	public void delTrip(Integer id);
	
	public Trip getTrip(Integer id);
	
	public List<Trip> listTrip();
	
	public void edtTrip(Trip trip);
}
