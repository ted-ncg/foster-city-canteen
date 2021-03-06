package com.visa.ncg.canteen;

public class Account {
  private int balance;
  private Long id;
  private String name;

  public Account(int initialAmount) {
    balance = initialAmount;
  }

  public Account() {
    balance = 0;
  }

  public int balance() {
    return balance;
  }

  public void deposit(int amount) {
    if (amount <= 0) {
      throw new InvalidAmountException();
    }

    balance += amount;
  }

  public void withdraw(int amount) {
    if (amount <= 0) {
      throw new InvalidAmountException();
    }
    if (amount > balance) {
      throw new InsufficientBalanceException();
    }
    balance -= amount;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
