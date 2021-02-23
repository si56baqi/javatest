package JdbcTemplate.service.impl;

import JdbcTemplate.dao.JdbcTemplateDao;
import JdbcTemplate.dao.impl.JdbcTemplateDaoImpl;
import JdbcTemplate.entity.Student;
import JdbcTemplate.service.JdbcTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JdbcTemplateServiceImpl implements JdbcTemplateService {
    @Autowired
    private JdbcTemplateDao jdbcTemplateDao;
    @Override
    public void update(String sql, Object... args) {
        jdbcTemplateDao.update(sql,args);
    }

    @Override
    public int delAccount(int id) {
        return jdbcTemplateDao.delAccount(id);
    }

    @Override
    public Student addAccount(Student account) {
        return jdbcTemplateDao.addAccount(account);
    }

    @Override
    public Student updaAccount(Student account) {
        return null;
    }

    @Override
    public List<Student> allstu() {
        return jdbcTemplateDao.allstu();
    }
}
