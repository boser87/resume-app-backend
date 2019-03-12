package com.stefanoc.resumeapp.resumeappbackend;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ResumeRepository extends MongoRepository<Resume, String> {
}
