package ua.cn.kp.domain;

import java.awt.Image;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BUS")
public class Bus {
	
	@Id
	@Column(name = "id_bus")
	@GeneratedValue
	private Integer id_bus;
	
	@Column(name = "busNmb")
	private String busNmb;
	
	@Column(name = "busModel")
	private String busModel;
	
	@Column(name = "colPlace")
	private Integer colPlace;
	
	@Column(name = "busLayout")
	private Image busLayout;

	public Integer getId_bus() {
		return id_bus;
	}

	public void setId_bus(Integer id_bus) {
		this.id_bus = id_bus;
	}

	public String getBusNmb() {
		return busNmb;
	}

	public void setBusNmb(String busNmb) {
		this.busNmb = busNmb;
	}

	public String getBusModel() {
		return busModel;
	}

	public void setBusModel(String busModel) {
		this.busModel = busModel;
	}

	public Integer getColPlace() {
		return colPlace;
	}

	public void setColPlace(Integer colPlace) {
		this.colPlace = colPlace;
	}

	public Image getBusLayout() {
		return busLayout;
	}

	public void setBusLayout(Image busLayout) {
		this.busLayout = busLayout;
	}
}
