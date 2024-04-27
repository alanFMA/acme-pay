package br.com.acmepay.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    private Long id;
    private LocalDateTime data_transaction;
    private Integer source_account;
    private Integer destination_account;
    private BigDecimal amount;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getData_transaction() {
        return data_transaction;
    }

    public void setData_transaction(LocalDateTime data_transaction) {
        this.data_transaction = data_transaction;
    }

    public Integer getSource_account() {
        return source_account;
    }

    public void setSource_account(Integer source_account) {
        this.source_account = source_account;
    }

    public Integer getDestination_account() {
        return destination_account;
    }

    public void setDestination_account(Integer destination_account) {
        this.destination_account = destination_account;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }
}