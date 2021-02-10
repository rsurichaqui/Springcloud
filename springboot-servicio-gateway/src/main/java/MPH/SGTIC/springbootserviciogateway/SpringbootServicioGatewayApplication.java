package MPH.SGTIC.springbootserviciogateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class SpringbootServicioGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioGatewayApplication.class, args);
	}

}
