
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.*;

public class test {
   /* @Test
    public void qwe(){
      *//*  //list存放map
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("1", "张三");
        map.put("2", "李四");
        map.put("3", "王五");
        list.add(map);
        System.out.println(list);*//*

        *//*List<List<Integer>> vecvecRes = new ArrayList<List<Integer>>();
        for (int i = 0; i < 3; i++) {
            List<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j <= 2; j++) {
                list.add(j);
            }
            vecvecRes.add(list);
        }
        System.out.println(vecvecRes);*//*
        Map<List<Integer>, List<Integer>> map = new HashMap<List<Integer> , List<Integer>>();

            List<Integer> list = new ArrayList<Integer>();
            list.add(1);
            list.add(2);
            list.add(3);
            List<Integer> list1 = new ArrayList<Integer>();
            list1.add(10);
            list1.add(20);
            list1.add(30);

            map.put(list, list1);
            System.out.println(map);


    }
    @Test
    public void list(){
      List list=new ArrayList();
          list.add(1);
          list.add(2);
          list.add(3);
      List list1= new ArrayList();
         list1.add("A");
         list1.add("B");
         list1.add("C");
      Map map=new HashMap();
        map.put(list,list1);
        System.out.println(map);




    }*/
    public static void main(String[] args) {
        // 构建连接池配置信息
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        // 设置最大连接数
        jedisPoolConfig.setMaxTotal(50);

        // 构建连接池
        JedisPool jedisPool = new JedisPool(jedisPoolConfig, "192.168.195.110", 6379);

        // 从连接池中获取连接
        Jedis jedis = jedisPool.getResource();
        jedis.auth("root");
        jedis.hset("USER_1", "username", "zhangsan");
        jedis.hset("USER_1", "password", "123456");

        Map<String, String> val = jedis.hgetAll("USER_1");
        for (Map.Entry<String, String> entry : val.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

        // 将连接还回到连接池中
       jedisPool.returnResource(jedis);
        //jedisPool.getResource();
        // 释放连接池
        jedisPool.close();

    }


}
