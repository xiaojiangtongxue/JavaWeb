package cn.edu.hqu.javaee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		System.out.print("ÄãºÃ Spring");
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
