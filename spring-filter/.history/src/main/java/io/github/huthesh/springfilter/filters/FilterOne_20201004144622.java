package io.github.huthesh.springfilter.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.core.Ordered;

public class FilterOne implements Filter, Ordered {

    @Override
    public int getOrder() {
        return 1;
    }

    @Override
    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
            throws IOException, ServletException {
            System.out.println("Filter One invoked");
            arg2.doFilter(arg0, arg1);
    }
    
}
