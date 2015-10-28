package ua.cn.kp.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STATUS_USR")
public class StatusUsrDAO {
	
	@Id
	@Column(name = "id_status")
	@GeneratedValue
	private Integer id_status;
	
	@Column(name = "statusU")
	private String statusU;

	public Integer getId_status() {
		return id_status;
	}

	public void setId_status(Integer id_status) {
		this.id_status = id_status;
	}

	public String getStatusU() {
		return statusU;
	}

	public void setStatusU(String statusU) {
		this.statusU = statusU;
	}

}
