package com.itchain.samplemsa.samplemsa.customer.service;

public interface CustomerService {
    CustomerInfo getCustomerInfo(String id);

    void addCustomerInfo(String id, String pw, String name, String address);

    void removeCustomerInfo(String id, String pw);

    void updateCustomerInfo(String id, String pw, String name, String address);

    int calculatePoints(String id);
}
