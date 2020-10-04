package io.github.huthesh.springfilter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.huthesh.springfilter.filters.FilterOne;
import io.github.huthesh.springfilter.filters.FilterTwo;

@Configuration
public class FilterConfig {
    
    @Bean
    public FilterOne getFilterOne(){
        return new FilterOne();
    }

    @Bean
    public FilterTwo getFilterTwo(){
        return new FilterTwo();
    }
}
