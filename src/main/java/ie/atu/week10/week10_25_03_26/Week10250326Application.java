package ie.atu.week10.week10_25_03_26;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Week10250326Application {

    public static void main(String[] args) {
        SpringApplication.run(Week10250326Application.class, args);
    }

}
