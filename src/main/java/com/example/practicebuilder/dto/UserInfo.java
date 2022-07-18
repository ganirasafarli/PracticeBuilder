package com.example.practicebuilder.dto;

import lombok.Data;

@Data
public class UserInfo {
    private String name;
    private String surname;
    private String fatherName;
    private String company;
    private String position;
    private String fin;
    private Double annualIncome;
    private Double tax;
    private Double bonus;
}
