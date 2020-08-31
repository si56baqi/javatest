package login.service.impl;

import login.dao.CpSUserinfoEntityDao;
import login.entity.CpSModleinfoEntity;
import login.entity.CpSUserinfoEntity;
import login.service.CpSUserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CpSUserinfoServiceImpl implements CpSUserinfoService {
    @Autowired
    private CpSUserinfoEntityDao cpSUserinfoEntityDao;
    public List<CpSUserinfoEntity> findAll() {
        return cpSUserinfoEntityDao.findAll();
    }

    public CpSUserinfoEntity findUsername(String no) {
        return cpSUserinfoEntityDao.findUsername(no);
    }

    public CpSUserinfoEntity findUsernameAndPsd(String no, String password) {
        return cpSUserinfoEntityDao.findUsernameAndPsd(no,password);
    }

    public void add(CpSUserinfoEntity cpSUserinfoEntity) {
        cpSUserinfoEntityDao.add(cpSUserinfoEntity);
    }

    public List<CpSModleinfoEntity> list(String pkID) {
        return cpSUserinfoEntityDao.list(pkID);
    }

    public  Map<List, List> list1(String pkID) {
        return cpSUserinfoEntityDao.list1(pkID);
    }
}
