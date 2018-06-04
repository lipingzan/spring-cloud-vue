package cloud.simple.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@Configuration
@EnableDiscoveryClient
@SpringBootApplication
@EnableEurekaClient
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@EnableWebMvc
@MapperScan(basePackages={"cloud.simple.service.dao","com.framework.common.base"})
public class CloundServiceApplication extends WebMvcConfigurerAdapter  {
	private static final Logger log = LoggerFactory.getLogger(CloundServiceApplication.class);
	
    public static void main(String[] args) {
    	log.info("CloundServiceApplication run main 开始");
    	SpringApplication.run(CloundServiceApplication.class, args);
    	log.info("CloundServiceApplication run main 结束");
    }

}	
