package br.com.raroacademy.products_ddd.infraestructure.config;

import br.com.raroacademy.products_ddd.infraestructure.handler.InterceptorHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfiguration implements WebMvcConfigurer {
    private final InterceptorHandler interceptorHandler;

    @Override
    public void addInterceptors(final InterceptorRegistry registry) {
        registry.addInterceptor(interceptorHandler) //
                .addPathPatterns("/*") //
                .excludePathPatterns("/version");
    }
}