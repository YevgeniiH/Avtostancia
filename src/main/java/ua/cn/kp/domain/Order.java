package ua.cn.kp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER")
public class Order extends Base{
	
	@Column(name = "idTrip")
	private Integer idTrip;
	
	@Column(name = "place")
	private Integer place;
	
	@Column(name = "statusO")
	private String statusO;

	public Integer getidTrip() {
		return idTrip;
	}

	public void setidTrip(Integer idTrip) {
		this.idTrip = idTrip;
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
