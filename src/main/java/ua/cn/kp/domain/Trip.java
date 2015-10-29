package ua.cn.kp.domain;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TRIP")
public class Trip extends Base{
	
	@Column(name = "tFrom")
	private String tFrom;
	
	@Column(name = "tTo")
	private String tTo;
	
	@Column(name = "dateTripFrom")
	private LocalDate dateTripFrom;
	
	@Column(name = "dateTripTo")
	private LocalDate dateTripTo;
	
	@Column(name = "timeTripFrom")
	private LocalTime timeTripFrom;
	
	@Column(name = "timeTripTo")
	private LocalTime timeTripTo;
	
	@Column(name = "price")
	private Double price;

	public String gettFrom() {
		return tFrom;
	}

	public void settFrom(String tFrom) {
		this.tFrom = tFrom;
	}

	public String gettTo() {
		return tTo;
	}

	public void settTo(String tTo) {
		this.tTo = tTo;
	}

	public LocalDate getDateTripFrom() {
		return dateTripFrom;
	}

	public void setDateTripFrom(LocalDate dateTripFrom) {
		this.dateTripFrom = dateTripFrom;
	}

	public LocalDate getDateTripTo() {
		return dateTripTo;
	}

	public void setDateTripTo(LocalDate dateTripTo) {
		this.dateTripTo = dateTripTo;
	}

	public LocalTime getTimeTripFrom() {
		return timeTripFrom;
	}

	public void setTimeTripFrom(LocalTime timeTripFrom) {
		this.timeTripFrom = timeTripFrom;
	}

	public LocalTime getTimeTripTo() {
		return timeTripTo;
	}

	public void setTimeTripTo(LocalTime timeTripTo) {
		this.timeTripTo = timeTripTo;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
