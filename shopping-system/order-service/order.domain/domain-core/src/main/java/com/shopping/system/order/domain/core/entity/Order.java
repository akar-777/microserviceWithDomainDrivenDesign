package com.shopping.system.order.domain.core.entity;

import com.shopping.system.common.domain.entity.AggregateRoot;
import com.shopping.system.common.domain.valueobject.CustomerId;
import com.shopping.system.common.domain.valueobject.Money;
import com.shopping.system.common.domain.valueobject.OrderId;
import com.shopping.system.common.domain.valueobject.ShopId;
import com.shopping.system.order.domain.core.valueobject.Address;

import java.util.List;

public class Order extends AggregateRoot<OrderId> {
    private final CustomerId customerId;
    private final ShopId shopId;
    private final Address deliveryAddress;
    private final Money price;
    private final List<OrderItem> orderItems;

    public Order(CustomerId customerId, ShopId shopId, Address deliveryAddress, Money price, List<OrderItem> orderItems) {
        this.customerId = customerId;
        this.shopId = shopId;
        this.deliveryAddress = deliveryAddress;
        this.price = price;
        this.orderItems = orderItems;
    }

    public CustomerId getCustomerId() {
        return customerId;
    }

    public ShopId getShopId() {
        return shopId;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public Money getPrice() {
        return price;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }
}
