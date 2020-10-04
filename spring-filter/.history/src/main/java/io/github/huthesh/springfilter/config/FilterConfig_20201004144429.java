package io.github.huthesh.springfilter.config;

import org.springframework.context.annotation.Configuration;

import io.github.huthesh.springfilter.filters.FilterOne;

@Configuration
public class FilterConfig {
    
    public FilterOne getFilterOne(){
        return FilterOneP()
    }

}
