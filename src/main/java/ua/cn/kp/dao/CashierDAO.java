package ua.cn.kp.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CASHIER")
public class CashierDAO {
	
	@Id
	@Column(name = "id_cas")
	@GeneratedValue
	private Integer id_cas;

	public Integer getId_cas() {
		return id_cas;
	}

	public void setId_cas(Integer id_cas) {
		this.id_cas = id_cas;
	}

}
