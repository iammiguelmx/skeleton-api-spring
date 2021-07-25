package com.mx.skeleton;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;

@SpringBootTest
class SkeletonJavaApplicationTests {

	@PersistenceUnit
	private EntityManager entityManager;

	@PostConstruct
	public void init(){
	}

	@Test
	void contextLoads() {
	}

}
