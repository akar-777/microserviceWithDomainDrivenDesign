package com.shopping.system.order.domain.core.entity;

import com.shopping.system.common.domain.entity.BaseEntity;
import com.shopping.system.common.domain.valueobject.Money;
import com.shopping.system.common.domain.valueobject.OrderId;
import com.shopping.system.order.domain.core.valueobject.OrderItemId;

public class OrderItem extends BaseEntity<OrderItemId> {
    private final OrderId orderId;
    private final Product product;
    private final int quantity;
    private final Money price;
    private final Money totalPrice;

    public OrderItem(OrderId orderId, Product product, int quantity, Money price, Money totalPrice) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.totalPrice = totalPrice;
    }

    public OrderId getOrderId() {
        return orderId;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Money getPrice() {
        return price;
    }

    public Money getTotalPrice() {
        return totalPrice;
    }
}
