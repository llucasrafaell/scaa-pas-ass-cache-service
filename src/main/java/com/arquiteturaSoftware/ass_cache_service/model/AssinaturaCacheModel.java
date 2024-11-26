package com.arquiteturaSoftware.ass_cache_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class AssinaturaCacheModel implements Serializable {
    @Id
    private Long assinaturaId;
    private String clienteNome;
    private String aplicativoNome;
    private String status;
    private String validade;

    // Getters e Setters
    public Long getAssinaturaId() {
        return assinaturaId;
    }

    public void setAssinaturaId(Long assinaturaId) {
        this.assinaturaId = assinaturaId;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public String getAplicativoNome() {
        return aplicativoNome;
    }

    public void setAplicativoNome(String aplicativoNome) {
        this.aplicativoNome = aplicativoNome;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
}
