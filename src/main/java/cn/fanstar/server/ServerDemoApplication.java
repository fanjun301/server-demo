package cn.fanstar.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
@EnableFeignClients
public class ServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerDemoApplication.class, args);
	}
}
