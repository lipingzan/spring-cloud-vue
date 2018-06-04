package cloud.eureka.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
	private static final Logger log = LoggerFactory.getLogger(EurekaServerApplication.class);
	
	public static void main(String[] args) {
		log.info("EurekaServerApplication run main 开始");
        new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
        log.info("EurekaServerApplication run main 结束");
        
    }
}
