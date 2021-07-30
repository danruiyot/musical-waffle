package com.example.app;


import com.example.app.controllers.MainController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
//		SpringApplication.run(AppApplication.class, args);
            
            SpringApplicationBuilder builder = new SpringApplicationBuilder(AppApplication.class);

            builder.headless(false);

            ConfigurableApplicationContext context = builder.run(args);
            
                MainController mn = new MainController();
                mn.login();
               
	}

}
