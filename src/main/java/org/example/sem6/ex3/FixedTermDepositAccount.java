package org.example.sem6.ex3;

import java.math.BigDecimal;

public class FixedTermDepositAccount extends Account{
    @Override
    protected void deposit(float amount) {
        //deposit into this account
    }

    @Override
    protected void withdraw(float amount) {
        throw new UnsupportedOperationException();
    }
}
