package com.example.practicebuilder.impl;

import com.example.practicebuilder.dto.UserInfo;
import com.example.practicebuilder.service.BuilderService;
import org.springframework.stereotype.Service;

@Service
public class BuilderServiceImpl implements BuilderService {
    @Override
    public UserInfo getData(String fin) {
        UserInfo userInfo = new UserInfo();
        userInfo.setName("Qənirə");
        userInfo.setSurname("Səfərli");
        userInfo.setFatherName("Niyaməddin");
        userInfo.setCompany("Cybernet LLC");
        userInfo.setPosition("Kiçik Programçı");
        userInfo.setFin("123ABCD");
        userInfo.setAnnualIncome(12.000);
        userInfo.setTax((1127.00*10)/100);
        userInfo.setBonus((1127.0*5)/100);
        return userInfo;
    }
}
