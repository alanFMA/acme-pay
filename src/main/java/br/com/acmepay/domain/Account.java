package br.com.acmepay.domain;

import br.com.acmepay.exception.BalanceToWithdrawException;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Account {

    private Long id;
    private Integer number;
    private Integer agency;
    private BigDecimal balance;
    private Boolean close;
    private Customer customer;
    private List<Card> cards;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    private List<Account> accountsCreated = new ArrayList<>();


    public void create(Account account) {
        this.setId(account.id);
        this.setCreated_at(LocalDateTime.now());
        this.setUpdated_at(null);
        this.setCustomer(createCustomer());
        this.setCards(new ArrayList<>());
        this.setBalance(BigDecimal.ZERO);
        this.setNumber(account.number);
        this.setAgency(account.agency);
        this.setClose(account.close);
        this.accountsCreated.add(this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getAgency() {
        return agency;
    }

    public void setAgency(Integer agency) {
        this.agency = agency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Boolean getClose() {
        return close;
    }

    public void setClose(Boolean close) {
        this.close = close;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
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

    public List<Account> getAccountsCreated() {
        return accountsCreated;
    }

    public void setAccountsCreated(List<Account> accountsCreated) {
        this.accountsCreated = accountsCreated;
    }

    public void deposit(BigDecimal amount){
        this.balance = this.balance.add(amount);
    }

    public void withdraw(BigDecimal amount) throws BalanceToWithdrawException {
        if (this.balance.compareTo(amount) < 0) throw new BalanceToWithdrawException("error withdraw");

        this.balance = this.balance.subtract(amount);
    }

    public void transfer(BigDecimal amount, Account destinationAccount) throws BalanceToWithdrawException {
         this.withdraw(amount);
        destinationAccount.deposit(amount);
    }

    private Customer createCustomer(){
        var customer = new Customer();
        customer.setId(1L);
        customer.setName("Carlos Barbosa");
        customer.setEmail("carlos@gmail.com");
        customer.setDocument("03100721403");
        customer.setPhone("83991267778");
        customer.setCreated_at(LocalDateTime.now());
        customer.setUpdated_at(null);
        customer.setAccounts(new ArrayList<>());
        return customer;
    }

}