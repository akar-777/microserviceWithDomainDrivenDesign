package com.shopping.system.common.domain.valueobject;

public abstract class CustomerId extends BaseId<Long> {
    protected CustomerId(Long value) {
        super(value);
    }
}
