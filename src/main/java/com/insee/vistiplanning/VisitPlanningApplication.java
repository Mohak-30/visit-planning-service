package com.insee.vistiplanning;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@Slf4j
@SpringBootApplication
//@EnableEurekaClient
@EnableMongoAuditing
public class VisitPlanningApplication {

  public static void main(String[] args) {
    log.debug("Starting Visit Planning service");
    SpringApplication.run(VisitPlanningApplication.class, args);
    log.debug("Visit Planning service started");
  }
}
