package behavior.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"behavior", "erp_microservices"})
public class BehaviorTestConfiguration {
}
