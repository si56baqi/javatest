package com.si56baqi.ioc.impl;

import com.si56baqi.ioc.PersonDao;

public class PersonDaoImpl implements PersonDao {
    public void add() {
        System.out.println("save()执行了...");
    }
}
