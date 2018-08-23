package com.itchain.samplemsa.samplemsa.customer.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    // @Autowired
    private EventRepository eventRepo;

    public CustomerServiceImpl() {
        // todo : event repo 구현
        // eventRepo = new EventRepository();
    }

    @Override
    public CustomerInfo getCustomerInfo(String id) {
        CustomerInfo c = (CustomerInfo) eventRepo.load(id);

        return c;
    }

    public void addCustomerInfo(String id, String pw, String name, String address) {
        if(id.length() == 0) {
            throw new NonIDValueException();
        }

        if(pw.length() < 8 ) {
            throw new PasswordTooShortException();
        }

        String registeredDay = new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());

        CustomerInfo c = new CustomerInfo(id, pw, name, address, registeredDay);

        // todo : event repo에 저장
        // eventRepo.Save(c);
    }

    public void removeCustomerInfo(String id, String pw) {
        CustomerInfo c = (CustomerInfo) eventRepo.load(id);
        if (c.checkPassword(pw)) {
            // todo : event repo에 저장
            // eventRepo.Save(c);
        }
    }

    public void updateCustomerInfo(String id, String pw, String name, String address) {
        if(pw.length() == 0) {
            throw new PasswordTooShortException();
        }

        CustomerInfo c = (CustomerInfo) eventRepo.load(id);

        // todo : event repo에 저장
        // eventRepo.Save(c);
    }

    public int calculatePoints(String id) {
        int point = 0;

        // todo : 구매내역 쿼리
        List<Integer> spentPriceList = new ArrayList<Integer>();

        for(int price : spentPriceList) {
            point += price;
        }

        return point;
    }
}
