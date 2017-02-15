package tomerbu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Front Controller - The Servlet Definition
 * Uses @{@link WebConfig} WebMvcConfigurerAdapter (Auto adds the prefix and suffix for all view files)
 * Uses @{@link RootConfig} RootConfig corresponds to the <beans> element in Spring XML config files.
 * IE Dependency Injection And Bean Management.
 * //Servlet is Mapped to '/'
 */

@Configuration
public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
