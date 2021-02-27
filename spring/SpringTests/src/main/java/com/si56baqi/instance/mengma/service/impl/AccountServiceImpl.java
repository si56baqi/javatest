package com.si56baqi.instance.mengma.service.impl;

import com.si56baqi.instance.mengma.dao.AccountDao;
import com.si56baqi.instance.mengma.service.AccountService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
/*Spring声明式事务管理（基于Annotation注解方式实现）在service上添加以下注解
* @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = false)
* */

public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;
    //set注入，获得dao
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
    //获得dao的方法
    @Override
    public void transfer(String outUser, String inUser, int money) {
        this.accountDao.out(outUser, money);
        this.accountDao.in(inUser, money);
    }
    /*
    * Spring声明式事务管理（基于XML方式实现）
    * Spring 的事务管理有两种方式：一种是传统的编程式事务管理，即通过编写代码实现的事务管理；另一种是基于 AOP 技术实现的声明式事务管理。由于在实际开发中，编程式事务管理很少使用，所以我们只对 Spring 的声明式事务管理进行详细讲解。
    Spring 声明式事务管理在底层采用了 AOP 技术，其最大的优点在于无须通过编程的方式管理事务，只需要在配置文件中进行相关的规则声明，就可以将事务规则应用到业务逻辑中。
    Spring 实现声明式事务管理主要有两种方式：
    基于 XML 方式的声明式事务管理。
    通过 Annotation 注解方式的事务管理。
    *
    * */
}
