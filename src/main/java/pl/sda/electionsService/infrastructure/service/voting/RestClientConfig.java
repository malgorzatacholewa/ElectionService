package pl.sda.electionsService.infrastructure.service.voting;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestClientConfig {

    @Bean
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
