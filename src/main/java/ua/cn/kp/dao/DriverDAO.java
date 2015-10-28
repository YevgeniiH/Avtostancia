package ua.cn.kp.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "DRIVER")
public class DriverDAO {
	
	@Column(name = "busNmb")
	private String busNmb;

	public String getBusNmb() {
		return busNmb;
	}

	public void setBusNmb(String busNmb) {
		this.busNmb = busNmb;
	}
}
