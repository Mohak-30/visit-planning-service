package com.insee.vistiplanning.documents;

import com.insee.vistiplanning.enums.CategoryType;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class SuggestedVisitGuidelinesMatrix {

  private CategoryType category;
  private int noOfVisits;
}
