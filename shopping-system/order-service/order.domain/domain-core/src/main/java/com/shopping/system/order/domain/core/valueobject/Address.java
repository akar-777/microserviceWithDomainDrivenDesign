package com.shopping.system.order.domain.core.valueobject;

import java.util.Objects;
import java.util.UUID;

public class Address {
    private final UUID id;
    private final String fullAddress;

    public Address(UUID id, String fullAddress) {
        this.id = id;
        this.fullAddress = fullAddress;
    }

    public UUID getId() {
        return id;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address address)) return false;
        return Objects.equals(id, address.id) && Objects.equals(fullAddress, address.fullAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullAddress);
    }
}
