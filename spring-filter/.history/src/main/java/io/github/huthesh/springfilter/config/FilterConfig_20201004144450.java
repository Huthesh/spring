package io.github.huthesh.springfilter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.huthesh.springfilter.filters.FilterOne;

@Configuration
public class FilterConfig {
    

    @Bean
    public FilterOne getFilterOne(){
        return new FilterOne();
    }

}
