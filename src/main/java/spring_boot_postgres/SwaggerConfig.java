package spring_boot_postgres;

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
//@Import(SpringDataRestConfiguration.class)
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring backed restful webservice")
                .description("A Java developer Hiring Challenge")
                .termsOfServiceUrl("https://www.linkedin.com/in/bhagi/")
                .contact(new Contact(
                        "Bhargava K",
                        "https://www.linkedin.com/in/bhagi/",
                        "bhargavak37@gmail.com"))
                .license("Apache License Version 2.0")
                .licenseUrl("https://github.com/kbhagi")
                .version("4.5")
                .build();
    }
}
