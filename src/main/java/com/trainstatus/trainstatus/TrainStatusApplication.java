package com.trainstatus.trainstatus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;

@SpringBootApplication
public class TrainStatusApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TrainStatusApplication.class, args);

		try {
			// Attempt to get the MongoTemplate bean
			MongoTemplate mongoTemplate = context.getBean(MongoTemplate.class);

			// If the above line executes without exceptions, it indicates a successful MongoDB connection.
			System.out.println("Connected to MongoDB!");
		} catch (Exception e) {
			// Handle any exceptions related to MongoDB connection failure
			System.err.println("Failed to connect to MongoDB: " + e.getMessage());
		}
	}

}
