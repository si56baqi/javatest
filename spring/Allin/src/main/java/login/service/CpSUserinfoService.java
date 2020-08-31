package login.service;

import login.entity.CpSModleinfoEntity;
import login.entity.CpSUserinfoEntity;

import java.util.List;
import java.util.Map;

public interface CpSUserinfoService {
    List<CpSUserinfoEntity> findAll();
    CpSUserinfoEntity findUsername(String no);
    CpSUserinfoEntity findUsernameAndPsd(String no,String password);
    void add(CpSUserinfoEntity cpSUserinfoEntity);
    List<CpSModleinfoEntity> list(String pkID);
    Map<List, List> list1(String pkID);
}
