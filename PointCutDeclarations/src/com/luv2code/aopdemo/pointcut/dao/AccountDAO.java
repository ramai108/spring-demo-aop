package com.luv2code.aopdemo.pointcut.dao;

import com.luv2code.aopdemo.pointcut.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount (Account theAcount, boolean vipFlag) {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }

    public boolean doWork() {
        System.out.println(getClass() + ": doWork()");
        return false;
    }
}
