package com.insee.vistiplanning.documents;

import java.time.Instant;
import java.util.UUID;
import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

@Getter
public abstract class BaseDocument {

  @Id
  private String id = UUID.randomUUID().toString();

  @CreatedBy
  protected String createdBy;

  @CreatedDate
  protected Instant creationDate;

  @LastModifiedBy
  protected String lastModifiedBy;

  @LastModifiedDate
  protected Instant lastModifiedDate;

  @Version
  private Integer version;

  private boolean isDeleted = false;

}