package login.dao.impl;

import login.dao.CpSUserinfoEntityDao;
import login.entity.CpSModleinfoEntity;
import login.entity.CpSUserinfoEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CpSUserinfoDaoImpl implements CpSUserinfoEntityDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    private SessionFactory sessionFactory;
    private Session getCurrentSession(){
        return this.sessionFactory.openSession();
    }
    public List<CpSUserinfoEntity> findAll() {
        List list = getCurrentSession().createCriteria(CpSUserinfoEntity.class).list();
        return list;
    }

    public CpSUserinfoEntity findUsername(String no) {
        String hql="from CpSUserinfoEntity e where e.no=?";
        Query query = this.getCurrentSession().createQuery(hql);
        query.setString(0,no);
        CpSUserinfoEntity o = (CpSUserinfoEntity) query.uniqueResult();
        return o;
    }


    public CpSUserinfoEntity findUsernameAndPsd(String no, String password) {
        String hql="from CpSUserinfoEntity e where e.no=? and password=?";
        Query query = this.getCurrentSession().createQuery(hql);
        query.setString(0,no);
        query.setString(1,password);
        CpSUserinfoEntity cpSUserinfoEntity = (CpSUserinfoEntity) query.uniqueResult();
        return cpSUserinfoEntity;
    }

    public void add(CpSUserinfoEntity cpSUserinfoEntity) {
        getCurrentSession().save(cpSUserinfoEntity);
    }

    public List<CpSModleinfoEntity>  list(String pkID) {
        String sql="SELECT a.Alias FROM cp_s_modleinfo a \n" +
                "LEFT JOIN cp_s_rolemodel b ON  a.pkID=b.fkID_ModelInfo \n" +
                "LEFT JOIN cp_s_userrole c ON b.fkID_UserRole=c.pkID \n" +
                "LEFT JOIN cp_s_usermaprole d ON c.pkID=d.fkID_UserRole\n" +
                "LEFT JOIN cp_s_userinfo e ON d.fkID_UserInfo=e.pkID \n" +
                "WHERE e.pkID=? AND a.DownTag='0'";
        List<CpSModleinfoEntity> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<CpSModleinfoEntity>(CpSModleinfoEntity.class), pkID);
        return query;
    }

    public  Map<List, List> list1(String pkID) {
        String sql="SELECT a.Alias FROM cp_s_modleinfo a \n" +
                "LEFT JOIN cp_s_rolemodel b ON  a.pkID=b.fkID_ModelInfo \n" +
                "LEFT JOIN cp_s_userrole c ON b.fkID_UserRole=c.pkID \n" +
                "LEFT JOIN cp_s_usermaprole d ON c.pkID=d.fkID_UserRole\n" +
                "LEFT JOIN cp_s_userinfo e ON d.fkID_UserInfo=e.pkID \n" +
                "WHERE e.pkID=? AND a.DownTag='0'";
        String sql1="SELECT a.Alias FROM cp_s_modleinfo a \n" +
                "LEFT JOIN cp_s_rolemodel b ON  a.pkID=b.fkID_ModelInfo \n" +
                "LEFT JOIN cp_s_userrole c ON b.fkID_UserRole=c.pkID \n" +
                "LEFT JOIN cp_s_usermaprole d ON c.pkID=d.fkID_UserRole\n" +
                "LEFT JOIN cp_s_userinfo e ON d.fkID_UserInfo=e.pkID \n" +
                "WHERE e.pkID=? AND a.DownTag='1'";


        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql,pkID);
        List<Map<String, Object>> list1 = jdbcTemplate.queryForList(sql1,pkID);
        Map map=new HashMap();
        map.put(list,list1);
        return map;
    }


}
