package com.insee.vistiplanning.dto;

import com.insee.vistiplanning.enums.VisitFor;
import com.insee.vistiplanning.enums.VisitType;
import lombok.Data;

@Data
public class VisitDTO {

  private String leadId;
  private String salesUserId;
  private String planId;
  private VisitFor visitFor;
  private String eventName;
  private String eventLocation;
  private String prospectName;
  private String date;
  private String time;
  private VisitType visitType;
  private String objective;
  private String mode;
}
