package br.com.acmepay;

import br.com.acmepay.models.Account;
import br.com.acmepay.models.Customer;
import br.com.acmepay.models.Transaction;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Account accountOne = new Account("123", "1", new BigDecimal("1500"));
        Account accountTwo = new Account("312", "1", new BigDecimal("500.50"));

        Customer customer = new Customer("44993925000",
                Arrays.asList(accountOne, accountTwo), "Carlos Junior", "carlosajr@gmail.com", "83999998888");

        Transaction transaction = new Transaction(
                UUID.randomUUID(),
                new BigDecimal("200.00"),
                accountTwo.getAccountNumber(),
                accountOne.getAccountNumber(),
                new Date(),
                accountOne.getAccountNumber()
        );

        System.out.println("# DADOS BANCÁRIOS");

        System.out.println("## CUSTOMER");
        System.out.println("### Name: " + customer.getName());
        System.out.println("### Document: " + customer.getDocument());
        System.out.println("### Phone: " + customer.getPhone());
        System.out.println("### Email: " + customer.getEmail());
        System.out.println();

        System.out.println("## ACCOUNT:");
        for (Account account : customer.getCustomerAccounts()) {
            System.out.println("### Agency: " + account.getAgencyNumber() + " Account Number: " + account.getAccountNumber() + " Balance: " + account.getBalance());
        }
        System.out.println();

        System.out.println("## TRANSACTION");
        System.out.println("### Id: " + transaction.getTransactionId());
        System.out.println("### Amount: " + transaction.getAmount());
        System.out.println("### Origin Account: " + transaction.getOriginAccount());
        System.out.println("### Destination Account: " + transaction.getDestinationAccount());
        System.out.println("### Date: " + transaction.getTransactionDate());
    }
}