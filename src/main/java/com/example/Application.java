package com.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
/**
 * Created by mikailaakeredolu on 6/7/16.
 */

@SpringBootApplication
public class Application implements CommandLineRunner {

   private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(String... args) throws Exception{
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(quote.toString());
    }

}
//getForObject - Retrieve a representation by doing a GET on the URI template.
//public interface HttpMessageConverter<T>
//Strategy interface that specifies a converter that can convert from and to HTTP requests and responses.