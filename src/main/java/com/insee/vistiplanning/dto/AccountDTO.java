package com.insee.vistiplanning.dto;

import com.insee.vistiplanning.enums.AccountCategory;
import com.insee.vistiplanning.enums.LeadType;

import lombok.Data;

@Data
public class AccountDTO {


	private String visitid;
	private String userid;
	private String latitude;
	private String longitude;
	private String month;
	private AccountCategory accountcategory;
	
	private LeadType leadtype;
	
	
	
	
	
}
