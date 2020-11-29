package com.insee.vistiplanning.documents;

import com.insee.vistiplanning.enums.VisitFor;
import com.insee.vistiplanning.enums.VisitType;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "visit")
@Builder
public class Visit extends BaseDocument {

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
