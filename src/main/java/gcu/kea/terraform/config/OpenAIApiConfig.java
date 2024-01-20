package gcu.kea.terraform.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAIApiConfig {

    @Value("${openai.api.key}")
    private String openAIApiKey;

    @Bean
    public RequestInterceptor openAIApiKeyInterceptor() {
        return new RequestInterceptor() {
            @Override
            public void apply(RequestTemplate requestTemplate) {
                requestTemplate.header("Authorization", "Bearer " + openAIApiKey);
            }
        };
    }
}
