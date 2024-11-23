package com.arquiteturaSoftware.ass_cache_service.messaging;

import com.arquiteturaSoftware.ass_cache_service.model.AssinaturaCacheModel;
import com.arquiteturaSoftware.ass_cache_service.service.AssinaturaCacheService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class AssinaturaCacheListener {

    private final AssinaturaCacheService cacheService;

    public AssinaturaCacheListener(AssinaturaCacheService cacheService) {
        this.cacheService = cacheService;
    }

    @RabbitListener(queues = "${rabbitmq.routingkey.assinatura}")
    public void handleAssinaturaUpdate(AssinaturaCacheModel assinaturaCache) {
        cacheService.save(assinaturaCache);
    }
}
