package com.insee.vistiplanning.controllers;

import com.insee.vistiplanning.documents.Visit;
import com.insee.vistiplanning.dto.VisitDTO;
import com.insee.vistiplanning.services.VisitService;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/visit")
public class VisitController {

  @Autowired
  private VisitService visitService;

  @GetMapping(value = "/{id}")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<Visit> getVisit(@PathVariable(value = "id") UUID id) {
    return new ResponseEntity<>(visitService.getVisitById(id), HttpStatus.OK);
  }

  @PostMapping(value = "/")
  @ResponseStatus(HttpStatus.CREATED)
  public ResponseEntity<Visit> createVisit(@RequestBody VisitDTO visitDTO) {
    return new ResponseEntity<>(visitService.createVisit(visitDTO), HttpStatus.CREATED);
  }

  @PutMapping(value = "/visit/{id}")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<Visit> updateVisit(@RequestBody VisitDTO visitDTO,
      @PathVariable(value = "id") UUID id) {
    return new ResponseEntity<>(visitService.updateVisit(visitDTO, id), HttpStatus.OK);
  }

  @DeleteMapping(value = "/{id}")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<Visit> deleteVisit(@PathVariable(value = "id") UUID id) {
    return new ResponseEntity<>(visitService.deleteVisitById(id), HttpStatus.OK);
  }
}
