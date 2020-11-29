package com.insee.vistiplanning.services;

import com.insee.vistiplanning.documents.Visit;
import com.insee.vistiplanning.dto.VisitDTO;
import com.insee.vistiplanning.exception.InvalidRequestException;
import com.insee.vistiplanning.exception.RecordNotFoundException;
import com.insee.vistiplanning.repositories.VisitRepository;
import java.util.Optional;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitServiceImpl implements VisitService {

  private static String ERROR_VISIT_NOT_FOUND = "Visit %s not found";

  @Autowired
  private VisitRepository visitRepository;

  @Override
  public Visit getVisitById(UUID id) {
    Optional<Visit> visit = visitRepository.findById(id);
    if (visit.isPresent()) {
      return visitRepository.findById(id).get();
    }
    throw new RecordNotFoundException(String.format(ERROR_VISIT_NOT_FOUND, id.toString()));
  }

  @Override
  public Visit createVisit(VisitDTO visitDTO) {
    validateVisit(visitDTO);
    Visit visit = buildVisit(visitDTO);
    return visitRepository.save(visit);
  }

  @Override
  public Visit updateVisit(VisitDTO visitDTO, UUID id) {
    Optional<Visit> existingVisitOptional = visitRepository.findById(id);
    if (existingVisitOptional.isPresent()) {
      Visit existingVisit = existingVisitOptional.get();
      existingVisit.setProspectName(visitDTO.getProspectName());
      existingVisit.setEventName(visitDTO.getEventName());
      existingVisit.setEventLocation(visitDTO.getEventLocation());
      existingVisit.setTime(visitDTO.getObjective());
      existingVisit.setObjective(visitDTO.getObjective());
      existingVisit.setMode(visitDTO.getMode());
      return visitRepository.save(existingVisit);
    }
    throw new RecordNotFoundException(String.format(ERROR_VISIT_NOT_FOUND, id.toString()));
  }

  @Override
  public Visit deleteVisitById(UUID id) {
    Optional<Visit> existingVisit = visitRepository.findById(id);
    if (existingVisit.isPresent()) {
      Visit visit = existingVisit.get();
      visitRepository.delete(visit);
      return visit;
    }
    throw new RecordNotFoundException(String.format(ERROR_VISIT_NOT_FOUND, id.toString()));
  }

  private Visit buildVisit(VisitDTO visitDTO) {
    return Visit.builder().
        leadId(visitDTO.getLeadId())
        .salesUserId(visitDTO.getSalesUserId())
        .planId(visitDTO.getPlanId())
        .visitFor(visitDTO.getVisitFor())
        .eventName(visitDTO.getEventName())
        .eventLocation(visitDTO.getEventLocation())
        .prospectName(visitDTO.getProspectName())
        .date(visitDTO.getDate())
        .time(visitDTO.getTime())
        .visitType(visitDTO.getVisitType())
        .objective(visitDTO.getObjective())
        .mode(visitDTO.getMode()).build();
  }

  private void validateVisit(VisitDTO visitDTO) {
     //TODO Discussion Pending on which are mandatory/optional
    if(StringUtils.isEmpty(visitDTO.getTime())){
      throw new InvalidRequestException("Visit Time cannot be empty");
    }
    //Time Format Check as well.
  }

}
