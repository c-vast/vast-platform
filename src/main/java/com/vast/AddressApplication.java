package com.vast;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 *  address项目启动类
 * @since 2019年9月21日20点01分
 * @version 1.0
 * @author 1157168277@qq.com
 */
@SpringBootApplication
@MapperScan("com.vast.dao")
public class AddressApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AddressApplication.class, args);
	}
//	// 用于构建war文件并进行部署
//	@Override
//	protected SpringApplicationBuilder configure(
//			SpringApplicationBuilder builder) {
//		return builder.sources(this.getClass());
//	}


}
