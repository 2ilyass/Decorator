package com.decorator.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vol extends DecoratorAbstrait {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double cout = 300;
	
	@Override
	public double cout() {
		// TODO Auto-generated method stub
		return this.getAssuranceVoiture().cout() + this.cout;
	}

	public Vol() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vol(com.decorator.demo.AssuranceVoiture assuranceVoiture) {
		super(assuranceVoiture);
		// TODO Auto-generated constructor stub
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
