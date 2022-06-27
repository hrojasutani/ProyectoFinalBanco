package com.nttdata.banco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(MongoApplication.class, args);
		SpringApplication.run(MongoApplication.class, new String[]{"--server.port=8002"});
	}

}
