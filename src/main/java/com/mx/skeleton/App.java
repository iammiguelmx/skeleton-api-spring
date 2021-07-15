package com.mx.skeleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ProjectName: skeleton-java
 * @Package: com.mx.skeleton
 * @ClassName: App
 * @Author: Miguel Camacho
 * @Description: App initial run
 * @Date: 2020-14-07
 */
@EnableTransactionManagement
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
