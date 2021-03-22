package co.com.jsierra.postgresqlr2dbc;

import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import io.r2dbc.spi.ConnectionFactoryOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator;

import static io.r2dbc.spi.ConnectionFactoryOptions.*;

@SpringBootApplication
public class PostgresqlR2dbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgresqlR2dbcApplication.class, args);
	}

@Bean
	public ConnectionFactoryInitializer initializer(ConnectionFactory connectionFactory) {
	/*	ConnectionFactory connectionFactoryLocal = ConnectionFactories.get(ConnectionFactoryOptions.builder()
				.option(DRIVER, "pool")
				.option(PROTOCOL, "postgresql") // driver identifier, PROTOCOL is delegated as DRIVER by the pool.
				.option(HOST, "localhost")
				.option(PORT, 5432)
				.option(USER, "dev1234")
				.option(PASSWORD, "dev1234")
				.option(DATABASE, "users_db")
				.build());*/

		ConnectionFactoryInitializer initializer = new ConnectionFactoryInitializer();
		initializer.setConnectionFactory(connectionFactory);
		ResourceDatabasePopulator populator = new ResourceDatabasePopulator(new ClassPathResource("schema.sql"));
		initializer.setDatabasePopulator(populator);
		return initializer;
	}
}
