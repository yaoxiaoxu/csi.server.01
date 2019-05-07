
package com.yaoxx.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**

* @author:	yao_x_x
* @since:	JDK 1.8.0_91
* @Description:
*				SpringCloud注册中心
*/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApp01 {
	
	public static void main(String[] agrs){
		SpringApplication.run(EurekaServerApp01.class);
	}
	
	

}
