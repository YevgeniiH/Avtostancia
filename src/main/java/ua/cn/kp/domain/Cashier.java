package ua.cn.kp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CASHIER")
public class Cashier {
	
	@Id
	@Column(name = "id_cas")
	@GeneratedValue
	private Integer id_cas;
	
	@Column(name = "id_user")
	private Integer id_user;

	public Integer getId_cas() {
		return id_cas;
	}

	public void setId_cas(Integer id_cas) {
		this.id_cas = id_cas;
	}

	public Integer getId_user() {
		return id_user;
	}

	public void setId_user(Integer id_user) {
		this.id_user = id_user;
	}

}
