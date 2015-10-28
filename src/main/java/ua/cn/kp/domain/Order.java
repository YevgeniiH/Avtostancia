package ua.cn.kp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER")
public class Order {
	
	@Id
	@Column(name = "id_order")
	@GeneratedValue
	private Integer id_order;
	
	@Column(name = "place")
	private Integer place;
	
	@Column(name = "statusO")
	private String statusO;

	public Integer getId_order() {
		return id_order;
	}

	public void setId_order(Integer id_order) {
		this.id_order = id_order;
	}

	public Integer getPlace() {
		return place;
	}

	public void setPlace(Integer place) {
		this.place = place;
	}

	public String getStatusO() {
		return statusO;
	}

	public void setStatusO(String statusO) {
		this.statusO = statusO;
	}

}
