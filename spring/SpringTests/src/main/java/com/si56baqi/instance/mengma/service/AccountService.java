package com.si56baqi.instance.mengma.service;

public interface AccountService {
    // 转账
    public void transfer(String outUser, String inUser, int money);
}
