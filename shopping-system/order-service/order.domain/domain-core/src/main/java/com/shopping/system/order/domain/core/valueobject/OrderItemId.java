package com.shopping.system.order.domain.core.valueobject;

import com.shopping.system.common.domain.valueobject.BaseId;

public class OrderItemId extends BaseId<Long> {
    protected OrderItemId(Long value) {
        super(value);
    }
}
