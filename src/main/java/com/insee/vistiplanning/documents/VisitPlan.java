package com.insee.vistiplanning.documents;

import com.insee.vistiplanning.enums.PlanStatus;
import java.util.List;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "visit_plan")
public class VisitPlan extends BaseDocument {
  private String salesUserId;
  private int month;
  private int year;
  private PlanStatus status;
  @DBRef
  private List<Visit> visits;
}
