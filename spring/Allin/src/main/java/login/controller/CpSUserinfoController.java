package login.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import login.entity.CpSModleinfoEntity;
import login.entity.CpSUserinfoEntity;
import login.service.CpSUserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(value ="/CpSUserinfo",tags = "CpSUserinfo表接口")
public class CpSUserinfoController {
    @Autowired
    private CpSUserinfoService cpSUserinfoService;

    @ApiOperation(value = "查询CpSUserinfo表")
    @PostMapping(value = "/findAll")

    public List<CpSUserinfoEntity> findAll(){
        List<CpSUserinfoEntity> all = cpSUserinfoService.findAll();
        System.out.println(all.size());
        return all;
    }
    @ApiOperation(value = "查询CpSUserinfo表返回map")
    @PostMapping(value = "/findMap")
    public Map<String,List> findMap(){
        Map<String,List> map=new HashMap<String, List>();
        List<CpSUserinfoEntity> all = cpSUserinfoService.findAll();
        map.put("CpSUserinfo",all);
        return map;
    }
    @ApiOperation(value = "通过用户名查询")
    @PostMapping(value = "/findUsername")
   public CpSUserinfoEntity findUsername(String no){
        return cpSUserinfoService.findUsername(no);
    }

    @ApiOperation(value = "通过用户名密码查询")
    @PostMapping(value = "/findUsernameAndPsd")
    public CpSUserinfoEntity findUsernameAndPsd(String no, String password){
        return cpSUserinfoService.findUsernameAndPsd(no,password);
    }

    @ApiOperation(value = "插入一条记录")
    @PostMapping(value = "/addUser")
    public void addUser(CpSUserinfoEntity cpSUserinfoEntity){
         cpSUserinfoService.add(cpSUserinfoEntity);
    }

    @ApiOperation(value = "角色查询List<CpSModleinfoEntity>")
    @PostMapping(value = "/list")
    public List<CpSModleinfoEntity> list(String pkID){
        List<CpSModleinfoEntity> list = cpSUserinfoService.list(pkID);
        return  list;
    }
    @ApiOperation(value = "角色查询List<Map<String, Object>>")
    @PostMapping(value = "/list1")
    public  Map<List, List> list1(String pkID){
        Map<List, List> listListMap = cpSUserinfoService.list1(pkID);
        return  listListMap;
    }
}
