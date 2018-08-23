package ar.com.dag.rest.utils;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableAutoConfiguration
@ComponentScan(basePackages={"ar.com.dag.rest"})
public class AppContext {

}
