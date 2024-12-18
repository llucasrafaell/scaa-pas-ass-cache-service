package com.arquiteturaSoftware.ass_cache_service.controller;

import com.arquiteturaSoftware.ass_cache_service.model.AssinaturaCacheModel;
import com.arquiteturaSoftware.ass_cache_service.service.AssinaturaCacheService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/asscache")
public class AssinaturaCacheController {

    private final AssinaturaCacheService cacheService;

    public AssinaturaCacheController(AssinaturaCacheService cacheService) {
        this.cacheService = cacheService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody AssinaturaCacheModel assinaturaCache) {
        cacheService.save(assinaturaCache);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AssinaturaCacheModel> findById(@PathVariable Long id) {
        Optional<AssinaturaCacheModel> cache = cacheService.findById(id);
        return cache.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        cacheService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
