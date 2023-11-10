package spring.care.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();

		String databaseUrl = dotenv.get("DATABASE_URL");
		String databaseUsername = dotenv.get("POSTGRES_USERNAME");
		String databasePassword = dotenv.get("POSTGRES_PASSWORD");
		String databasePort = dotenv.get("DATABASE_PORT");

		SpringApplication.run(ApiApplication.class, args);
	}
}
