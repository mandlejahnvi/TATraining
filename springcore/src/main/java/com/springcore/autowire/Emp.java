package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
    @Autowired
    @Qualifier("address2")
    private Address address1;

    public Address getAddress1() {
        return address1;
    }

    public void setAddress1(Address address1) {
        this.address1 = address1;
    }

    public Emp(Address address1) {
        this.address1 = address1;
    }

    public Emp() {
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address1=" + address1 +
                '}';
    }
}
