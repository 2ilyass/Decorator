package com.decorator.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.decorator.demo.AssuranceVoiture;

@Repository
public interface RepositoryDao extends JpaRepository<AssuranceVoiture, Integer>{

}
