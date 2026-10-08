package edu.course.lab02;

import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

class test{
    @Test
    void testfortrue_1(){
        BankAccount ballance = new BankAccount(500);
        assertEquals(ballance.getbalance(),500);
    }
//    @Test
//    void testfortrue_2(){
//        BankAccount acc = new BankAccount(500);
//        acc = acc.deposit(100);
//    }
}