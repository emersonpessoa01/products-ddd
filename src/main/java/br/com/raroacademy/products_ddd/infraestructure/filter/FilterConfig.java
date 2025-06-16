package br.com.raroacademy.products_ddd.infraestructure.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
// Exemplo de filtro que mede o tempo de requisição
@WebFilter
public class FilterConfig implements Filter {
    @Override
    public void init(jakarta.servlet.FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long startTime = System.currentTimeMillis();
        filterChain.doFilter(servletRequest, servletResponse);

        long finalTime = System.currentTimeMillis() - startTime;
        System.out.println("Tempo de requisição: " + finalTime + " milissegundos");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}