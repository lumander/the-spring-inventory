package com.ibm.garage.warehouse;
import com.typesafe.config.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WarehouseApplication {

	Config conf = ConfigFactory.load("dev.conf");
	String protocol = conf.getString("availability.protocol");
	String availabilityEndpoint = conf.getString("availability.svc-endpoint");
	String port = conf.getString("availability.port");

	public static void main(String[] args) {
		SpringApplication.run(WarehouseApplication.class, args);
	}

}
