package com.example.Payroll.dto;

import java.math.BigDecimal;

import jakarta.validation.Valid;

public class dishesDTO{

    @Valid
    private String name;

    private BigDecimal totalPrice;

    private int amount;

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}