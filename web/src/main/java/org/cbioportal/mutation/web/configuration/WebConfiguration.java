package org.cbioportal.mutation.web.configuration;

import org.cbioportal.mutation.web.mixin.*;
import org.cbioportal.mutation.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by ersin on 4/14/16.
 */
@Configuration
@EnableSwagger2
public class WebConfiguration {

    @Bean
    public Jackson2ObjectMapperBuilder jacksonBuilder() {
        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
        builder.mixIn(Patient.class, PatientMixin.class);
        builder.mixIn(Mutation.class, MutationMixin.class);
        builder.mixIn(MutationEvent.class, MutationEventMixin.class);
        builder.mixIn(GeneticProfile.class, GeneticProfileMixin.class);
        builder.mixIn(Gene.class, GeneMixin.class);
        builder.mixIn(CancerStudy.class, CancerStudyMixin.class);
        builder.mixIn(Sample.class, SampleMixin.class);
        builder.mixIn(TypeOfCancer.class, TypeOfCancerMixin.class);
        return builder;
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("org.cbioportal.mutation.web.rest")).build();
    }
}
