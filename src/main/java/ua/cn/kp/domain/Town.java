package ua.cn.kp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TOWN")
public class Town {
	
	@Id
	@Column(name = "id_twn")
	@GeneratedValue
	private Integer id_town;
	
	@Column(name = "city")
	private String city;

	public Integer getId_town() {
		return id_town;
	}

	public void setId_town(Integer id_town) {
		this.id_town = id_town;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

}
