package club.cvast.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean("UsersApis")
    public Docket usersApis() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                // 测试API时的主机URL
                .host("localhost:80")
                .apiInfo(apiInfo());
    }

    public ApiInfo apiInfo() {
        final Contact contact = new Contact(
                "CVast", "http://www.cvast.club", "1157168277@qq.com");
        return new ApiInfoBuilder()
                // API文档标题
                .title("Vast平台接口文档")
                // API文档描述
                .description("Vast平台接口文档")
                // API文档版本
                .version("1.0.2.Dev")
                // API负责人的联系信息
                .contact(contact)
                .build();
    }
}