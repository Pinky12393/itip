package edu.course.lab02;
public class BankAccount{
    private int balance;
    public BankAccount(int balance){
        if(balance>=0){
        this.balance=balance;}
        else{
            throw new IllegalArgumentException("Баланс не может быть отрицательным");
        }
    }
    public void deposit(int amount) {
        if (amount >= 0){
            balance = balance + amount;
        }
        else {
            throw new IllegalArgumentException("Баланс не может быть отрицательным");
        }
    }
    public void withdraw(int amount){
        if (amount>=0){
            balance = balance - amount;
        }
        else {
            throw new IllegalArgumentException("Баланс не может быть отрицательным");
        }
    }
    public int getbalance(){
        return balance;
    }
}