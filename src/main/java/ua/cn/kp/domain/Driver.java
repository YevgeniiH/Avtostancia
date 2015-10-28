package ua.cn.kp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "DRIVER")
public class Driver {
	
	@Column(name = "busNmb")
	private String busNmb;

	public String getBusNmb() {
		return busNmb;
	}

	public void setBusNmb(String busNmb) {
		this.busNmb = busNmb;
	}
}
