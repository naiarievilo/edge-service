package dev.naiarievilo.edge_service;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Testcontainers
class EdgeServiceApplicationTests {

	@Container
	static GenericContainer<?> redisContainer = new GenericContainer<>("redis:7.4-alpine")
		.withExposedPorts(6379);

	@Test
	void contextLoads() {
	}

}
