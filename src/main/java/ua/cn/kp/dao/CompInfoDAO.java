package ua.cn.kp.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMPANY_INFO")
public class CompInfoDAO {
	
	@Id
	@Column(name = "id_comp")
	@GeneratedValue
	private Integer id_comp;
	
	@Column(name = "nameComp")
	private String nameComp;
	
	@Column(name = "adrBS")
	private String adrBS;
	
	@Column(name = "carrier")
	private String carrier;
	
	@Column(name = "insurer")
	private String insurer;

	public Integer getId_comp() {
		return id_comp;
	}

	public void setId_comp(Integer id_comp) {
		this.id_comp = id_comp;
	}

	public String getNameComp() {
		return nameComp;
	}

	public void setNameComp(String nameComp) {
		this.nameComp = nameComp;
	}

	public String getAdrBS() {
		return adrBS;
	}

	public void setAdrBS(String adrBS) {
		this.adrBS = adrBS;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getInsurer() {
		return insurer;
	}

	public void setInsurer(String insurer) {
		this.insurer = insurer;
	}

}
