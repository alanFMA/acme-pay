package br.com.acmepay.models;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

public class Transaction {
    private UUID transactionId;
    private BigDecimal amount;
    private String destinationAccount;
    private String originAccount;
    private Date transactionDate;
    private String accountId;

    public Transaction(UUID transactionId, BigDecimal amount, String destinationAccount, String originAccount, Date transactionDate, String accountId) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.destinationAccount = destinationAccount;
        this.originAccount = originAccount;
        this.transactionDate = transactionDate;
        this.accountId = accountId;
    }

    public UUID getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(UUID transactionId) {
        this.transactionId = transactionId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(String destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    public String getOriginAccount() {
        return originAccount;
    }

    public void setOriginAccount(String originAccount) {
        this.originAccount = originAccount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}
