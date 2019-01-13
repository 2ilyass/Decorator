package com.decorator.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ResponsabiliteCivile extends AssuranceVoiture{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double cout = 2000;
	
	@Override
	public double cout() {
		
		return cout;
	}

	public double getCout() {
		return cout;
	}

	public void setCout(double cout) {
		this.cout = cout;
	}

	public int getId() {
		return id;
	}

	
}
