package ua.cn.kp.service;

import java.util.List;

import ua.cn.kp.domain.User;

public interface IUserService {
	
	public void addUser(User user);
	
	public void delUser(Integer id);
	
	public User getUser(Integer id);
	
	public List<User> listUsers();
	
	public void edtUser(User user);

}
