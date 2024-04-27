package br.com.acmepay.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Card {

    private Long id;
    private String flag;
    private BigDecimal card_limit;
    private Account account;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

}