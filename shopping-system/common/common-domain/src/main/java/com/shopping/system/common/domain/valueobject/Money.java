package com.shopping.system.common.domain.valueobject;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Money {
    private final BigDecimal amount;

    protected Money(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money money)) return false;
        return Objects.equals(amount, money.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(amount);
    }
}
