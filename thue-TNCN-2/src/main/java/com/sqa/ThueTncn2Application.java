package com.sqa;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


//ba cái dưới này bằng 1 cái trên:
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
public class ThueTncn2Application {
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
	public static void main(String[] args) {
		SpringApplication.run(ThueTncn2Application.class, args);
	}

}
