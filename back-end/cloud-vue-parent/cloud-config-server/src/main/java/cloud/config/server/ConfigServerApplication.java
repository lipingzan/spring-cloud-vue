package cloud.config.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
//@EnableDiscoveryClient
@EnableConfigServer
public class ConfigServerApplication {
	private static final Logger log = LoggerFactory.getLogger(ConfigServerApplication.class);
	
    public static void main(String[] args) {
    	log.info("ConfigServerApplication run main");
        SpringApplication.run(ConfigServerApplication.class, args);
        log.info("ConfigServerApplication run main end");
    }
    
}
