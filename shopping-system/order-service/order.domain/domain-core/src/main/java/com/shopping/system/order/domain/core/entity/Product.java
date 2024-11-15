package com.shopping.system.order.domain.core.entity;

import com.shopping.system.common.domain.entity.BaseEntity;
import com.shopping.system.common.domain.valueobject.Money;
import com.shopping.system.common.domain.valueobject.ProductId;

public class Product extends BaseEntity<ProductId> {
    private final String name;
    private final Money price;

    public Product(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }
}
