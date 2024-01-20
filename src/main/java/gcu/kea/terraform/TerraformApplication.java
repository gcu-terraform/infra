package gcu.kea.terraform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class TerraformApplication {

    public static void main(String[] args) {
        SpringApplication.run(TerraformApplication.class, args);
    }

}
