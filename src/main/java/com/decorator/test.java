package com.decorator;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.decorator.dao.RepositoryDao;
import com.decorator.demo.AssuranceVoiture;
import com.decorator.demo.DecoratorAbstrait;
import com.decorator.demo.Inondation;
import com.decorator.demo.ResponsabiliteCivile;
import com.decorator.demo.Vol;

@SpringBootApplication
public class test {

	private static RepositoryDao dao;

	@Autowired
	RepositoryDao dao0;
 
	@PostConstruct
	private void initStaticDao() {
		dao = this.dao0;
	}

	public static void main(String[] args) {

		SpringApplication.run(test.class, args);

		AssuranceVoiture av = new ResponsabiliteCivile();
		dao.save(av);
		DecoratorAbstrait vol = new Vol(av);
		System.out.println(vol.cout());
		dao.save(vol);

		DecoratorAbstrait ino = new Inondation(vol);
		System.out.println(ino.cout());
		dao.save(ino);

	}

}
