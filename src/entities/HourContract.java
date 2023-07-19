package entities;

import java.util.Date;

public class HourContract {
	private Date data;
	private double valorPerHour;
	private Integer hours;
	
	public HourContract() {
	}
	
	public HourContract(Date data, double valorPerHour, Integer hours) {
		this.data = data;
		this.valorPerHour = valorPerHour;
		this.hours = hours;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorPerHour() {
		return valorPerHour;
	}

	public void setValorPerHour(double valorPerHour) {
		this.valorPerHour = valorPerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue() {
		return valorPerHour * hours;
	}
	
	
}
