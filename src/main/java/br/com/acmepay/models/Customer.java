package br.com.acmepay.models;

import java.util.List;

public class Customer {
    private String document;
    private List<Account> customerAccounts;
    private String name;
    private String email;
    private String phone;

    public Customer(String document, List<Account> customerAccounts, String name, String email, String phone) {
        this.document = document;
        this.customerAccounts = customerAccounts;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public List<Account> getCustomerAccounts() {
        return customerAccounts;
    }

    public void setCustomerAccounts(List<Account> customerAccounts) {
        this.customerAccounts = customerAccounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
