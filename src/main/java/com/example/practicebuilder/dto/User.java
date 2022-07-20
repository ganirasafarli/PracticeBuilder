package com.example.practicebuilder.dto;

import lombok.Getter;

@Getter
public class User {
    private String name;
    private String surname;
    private String fatherName;
    private String company;
    private String position;
    private String fin;
    private Double annualIncome;
    private Double tax;
    private Double bonus;

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.fatherName = builder.fatherName;
        this.company = builder.company;
        this.position = builder.position;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", fin='" + fin + '\'' +
                ", annualIncome=" + annualIncome +
                ", tax=" + tax +
                ", bonus=" + bonus +
                '}';
    }

    public static class UserBuilder {
        private final String name;
        private final String surname;
        private String fatherName;
        private String company;
        private String position;
        private String fin;
        private Double annualIncome;
        private Double tax;
        private Double bonus;


        public UserBuilder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public UserBuilder fatherName(String fatherName) {
            this.fatherName = fatherName;
            return this;
        }

        public UserBuilder company(String company) {
            this.company = company;
            return this;
        }

        public UserBuilder position(String position) {
            this.position = position;
            return this;
        }

        public UserBuilder fin(String fin) {
            this.fin = fin;
            return this;
        }

        public UserBuilder annualIncome(Double annualIncome) {
            this.annualIncome = annualIncome;
            return this;
        }

        public UserBuilder tax(Double tax) {
            this.tax = tax;
            return this;
        }

        public UserBuilder bonus(Double bonus) {
            this.bonus = bonus;
            return this;
        }

        public User build() {
            User user = new User(this);
            validateUserObject(user);
            return user;
        }

        private void validateUserObject(User user) {
            //Do some basic validations to check
            //if user object does not break any assumption of system
        }
    }
}
