package br.com.acmepay;

import br.com.acmepay.domain.Account;

public class App {
    public static void main( String[] args ) {
        Account account = new Account();
        account.setId(1L);
        account.setClose(false);
        account.setAgency(1010);
        account.setNumber(203040);

        account.create(account);
        account.getAccountsCreated().forEach(acc -> {
            System.out.println(acc.getAgency());
            System.out.println(acc.getNumber());
            System.out.println(acc.getCreated_at());
        });
    }
}