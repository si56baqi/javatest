package com.si56baqi.instance.annotation.dao.impl;

import com.si56baqi.instance.annotation.dao.PersonDao;
import org.springframework.stereotype.Repository;

@Repository("personDao")
public class PsersonDaoImpl implements PersonDao {
    public void add() {
        System.out.println("Dao层的add()执行了");
    }
}
