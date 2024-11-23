package com.arquiteturaSoftware.ass_cache_service.repository;

import com.arquiteturaSoftware.ass_cache_service.model.AssinaturaCacheModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssinaturaCacheRepository extends CrudRepository<AssinaturaCacheModel, Long> {
}
