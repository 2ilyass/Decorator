package com.decorator.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inondation extends DecoratorAbstrait {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double cout = 400;
	
	@Override
	public double cout() {
		// TODO Auto-generated method stub
		return this.getAssuranceVoiture().cout()+this.cout;
	}

	public Inondation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Inondation(com.decorator.demo.AssuranceVoiture assuranceVoiture) {
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
