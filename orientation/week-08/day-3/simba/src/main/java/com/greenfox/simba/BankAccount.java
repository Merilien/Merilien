package com.greenfox.simba;

public class BankAccount {
    private String name;
    private Double balance;
    private String animalType;
    private Boolean king;
    private Boolean villain;


    public BankAccount(String name, Double balance, String animalType, Boolean king, Boolean villain) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.king = king;
        this.villain = villain;
    }

    public void incrementBalance() {
        if (king) {
            balance += 100;
        } else {
            balance += 10;
        }
    }

    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public Boolean isKing() {
        return king;
    }

    public Boolean isVillain() {
        return villain;
    }
}
