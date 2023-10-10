package me.dio.restapibanking.model;

import java.math.BigDecimal;

public class Card {

    private Long id;
    private String number;
    private BigDecimal limit;

    public Card(String number, BigDecimal limit) {
        this.number = number;
        this.limit = limit;
    }

    public Card() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
