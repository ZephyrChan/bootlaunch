package com.zephyrchan.bootlaunch.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

        @Bean
        public Docket petApi() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(apiInfo())
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com.zephyrchan.bootlaunch")) //指定提供接口所在的基包
                    .paths(PathSelectors.regex("/rest/.*"))
                    .build();
        }

        /**
         * 该套 API 说明，包含作者、简介、版本、host、服务URL
         * @return
         */
        private ApiInfo apiInfo() {
            return new ApiInfoBuilder()
                    .title("demo api 说明")
                    .version("0.1")
                    .termsOfServiceUrl("localhost:8080/demo1/")
                    .description("demo api")
                    .build();
        }


}
