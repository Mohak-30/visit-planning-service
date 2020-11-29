package com.insee.vistiplanning.repositories;

import com.insee.vistiplanning.documents.Visit;
import java.util.UUID;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VisitRepository extends MongoRepository<Visit, UUID> {

}
