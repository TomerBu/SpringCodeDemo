package tomerbu.config;

import org.springframework.context.annotation.Configuration;


/**
 * ~corresponds to the <beans> element in Spring XML config files.
 * The <bean> elements are now methods with the @Bean annotation that return a bean instance.
 * The <context:component-scan> element is now the class level annotation @ComponentScan.
 * This is the root application context. It's the base class for all other contexts in this app.
 */

@Configuration
public class RootConfig {
}
