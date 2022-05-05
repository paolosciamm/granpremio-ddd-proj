package it.granpremio.project;

import com.fasterxml.classmate.TypeResolver;
import it.granpremio.project.presentation.error.ErrorResponse;
import it.granpremio.project.presentation.error.ServerApplicationError;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class GranpremioDddProjApplicaton extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(GranpremioDddProjApplicaton.class, args);
    }

    @Bean
    public Docket api(TypeResolver typeResolver) {
        return new Docket(DocumentationType.OAS_30)
                .additionalModels(
                        typeResolver.resolve(ErrorResponse.class)//,
                        //typeResolver.resolve(SearchShipEquipmentItem.class)
                )
                .select()
                .apis(RequestHandlerSelectors.basePackage("it.granpremio.project.presentation"))
                .build();
    }
    /*
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.OAS_30)
                .select()
                .apis(RequestHandlerSelectors.basePackage("it.granpremio.project.presentation"))
                .build();
    }*/
}
