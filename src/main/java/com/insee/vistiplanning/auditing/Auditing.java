package com.insee.vistiplanning.auditing;

import java.util.Optional;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

@Component
public class Auditing implements AuditorAware<String> {

  @Override
  public Optional<String> getCurrentAuditor() {
    //TODO : Pending on how to get user name
    return Optional.of("temp-user");
  }

}