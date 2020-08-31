package redis;

import org.junit.Test;
import redis.clients.jedis.*;

import java.util.ArrayList;
import java.util.List;

public class TestRedis {
    public static void main(String[] args) {
        //设置连接服务器IP地址和访问端口
        Jedis jedis = new Jedis("192.168.195.110",6379);
        jedis.auth("root");

        //单个值
        //jedis.set("test", "456789");				//设置值
        //System.out.println(jedis.get("test"));		//获取值

        //多个值
        //jedis.mset("test1","1","test2","2");
        List<String> oList = jedis.mget("test1","test2");
        for(String s : oList){
            System.out.println(s);
        }

        jedis.close();	//关闭
    }

    @Test    //分片
    public void shard(){


        //构造各个节点链接信息，host和port
        List<JedisShardInfo> infoList = new ArrayList<JedisShardInfo>();
        JedisShardInfo info1 = new JedisShardInfo("192.168.195.110",6379);
        //info1.setPassword("123456");
        //infoList.add(info1);
        JedisShardInfo info2 = new JedisShardInfo("192.168.195.110",6380);
        infoList.add(info2);
        JedisShardInfo info3 = new JedisShardInfo("192.168.195.110",6381);
        infoList.add(info3);

        //分片jedis

        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(500);	//最大链接数

        ShardedJedisPool pool = new ShardedJedisPool(config, infoList);
        //ShardedJedis jedis = new ShardedJedis(infoList);
        ShardedJedis jedis = pool.getResource();	//从pool中获取
        for(int i=0;i<10;i++){
            jedis.set("n"+i, "t"+i);
        }
        System.out.println(jedis.get("n9"));
        jedis.close();
    }
    @Test
    public void runCrc() {
        for (int i = 1; i < 100; i++) {
            System.out.println(this.getCrc(("name" + i).getBytes()) % 3);
        }
    }

    private static Integer getCrc(byte[] data) {
        int high;
        int flag;

        // 16位寄存器，所有数位均为1
        int wcrc = 0xffff;
        for (int i = 0; i < data.length; i++) {
            // 16 位寄存器的高位字节
            high = wcrc >> 8;
            // 取被校验串的一个字节与 16 位寄存器的高位字节进行“异或”运算
            wcrc = high ^ data[i];

            for (int j = 0; j < 8; j++) {
                flag = wcrc & 0x0001;
                // 把这个 16 寄存器向右移一位
                wcrc = wcrc >> 1;
                // 若向右(标记位)移出的数位是 1,则生成多项式 1010 0000 0000 0001 和这个寄存器进行“异或”运算
                if (flag == 1)
                    wcrc ^= 0xa001;
            }
        }

        // return Integer.toHexString(wcrc);
        return wcrc;
    }


}
