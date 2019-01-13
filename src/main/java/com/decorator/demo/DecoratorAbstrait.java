package com.decorator.demo;

import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@MappedSuperclass
public abstract class DecoratorAbstrait extends AssuranceVoiture {

	@OneToOne
	private AssuranceVoiture AssuranceVoiture;
	

	public DecoratorAbstrait(AssuranceVoiture assuranceVoiture) {
		super();
		this.AssuranceVoiture = assuranceVoiture;
	}

	
	public AssuranceVoiture getAssuranceVoiture() {
		return AssuranceVoiture;
	}


	public void setAssuranceVoiture(AssuranceVoiture assuranceVoiture) {
		AssuranceVoiture = assuranceVoiture;
	}


	public DecoratorAbstrait() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
