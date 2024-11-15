package com.shopping.system.common.domain.valueobject;

import java.util.UUID;

public abstract class OrderId extends BaseId<UUID>{

    protected OrderId(UUID value) {
        super(value);
    }
}
