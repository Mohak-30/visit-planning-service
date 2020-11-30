package com.insee.vistiplanning.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import com.insee.vistiplanning.documents.Visit.VisitBuilder;
import com.insee.vistiplanning.enums.AccountCategory;
import com.insee.vistiplanning.enums.LeadType;
import com.insee.vistiplanning.enums.VisitFor;
import com.insee.vistiplanning.enums.VisitType;

import lombok.Builder;
import lombok.Data;

@Data
@Document(collection = "account")
@Builder
public class Account extends BaseDocument{

	
	private String userid;
	private AccountCategory accountcategory;
	private LeadType leadtype;
	private String latitude;
	private String longitude;
	private String visitid;
	private String accountname;
	private String month;

	
}
