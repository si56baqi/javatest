package util;

import redis.clients.jedis.Jedis;

public class TestRedis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.195.110",6379);
        String s = jedis.get("name");
        System.out.println(s);

    }
}
