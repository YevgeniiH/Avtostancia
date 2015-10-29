package ua.cn.kp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DRIVER")
public class Driver {
	
	@Id
	@Column(name =  "id_driver")
	@GeneratedValue
	private Integer id_driver;
	
	@Column(name = "busNmb")
	private String busNmb;
	
	@Column(name = "id_user")
	private Integer id_user;

	public Integer getId_driver() {
		return id_driver;
	}

	public void setId_driver(Integer id_driver) {
		this.id_driver = id_driver;
	}

	public String getBusNmb() {
		return busNmb;
	}

	public void setBusNmb(String busNmb) {
		this.busNmb = busNmb;
	}

	public Integer getId_user() {
		return id_user;
	}

	public void setId_user(Integer id_user) {
		this.id_user = id_user;
	}
}
