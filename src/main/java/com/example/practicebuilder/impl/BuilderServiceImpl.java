package com.example.practicebuilder.impl;

import com.example.practicebuilder.dto.User;
import com.example.practicebuilder.service.BuilderService;
import org.springframework.stereotype.Service;

@Service
public class BuilderServiceImpl implements BuilderService {
    @Override
    public User getData(String fin) {
        User user1 = new User.UserBuilder("Qənirə", "Səfərli")
                .annualIncome(156.0)
                .fatherName("Niyaməddin")
                .position("Kiçik proqramçı")
                .fin("123ABC")
                .company("Cybernet MMC")
                .bonus((1000.0 * 3) / 100)
                .tax(1000.0 * 5 / 100)
                .build();
        return user1;
    }
}
