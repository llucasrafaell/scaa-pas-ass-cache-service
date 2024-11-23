package com.arquiteturaSoftware.ass_cache_service.service;

import com.arquiteturaSoftware.ass_cache_service.model.AssinaturaCacheModel;
import com.arquiteturaSoftware.ass_cache_service.repository.AssinaturaCacheRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AssinaturaCacheService {

    private final AssinaturaCacheRepository cacheRepository;

    public AssinaturaCacheService(AssinaturaCacheRepository cacheRepository) {
        this.cacheRepository = cacheRepository;
    }

    public void save(AssinaturaCacheModel assinaturaCache) {
        cacheRepository.save(assinaturaCache);
    }

    public Optional<AssinaturaCacheModel> findById(Long id) {
        return cacheRepository.findById(id);
    }

    public void deleteById(Long id) {
        cacheRepository.deleteById(id);
    }
}
