package com.insee.vistiplanning.services;


import com.insee.vistiplanning.documents.Visit;
import com.insee.vistiplanning.dto.VisitDTO;
import java.util.UUID;

 public interface VisitService {

   Visit getVisitById(UUID id);

   Visit createVisit(VisitDTO visitDTO);

   Visit updateVisit(VisitDTO visitDTO, UUID id);

   Visit deleteVisitById(UUID id);
}
