package util;

import com.si56baqi.sso.pojo.User;
import com.si56baqi.sso.service.UserService;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HttpClientPost {
    @Autowired
    private UserService userService;
    @Test
    public void find(){
       List<User> users = userService.find();
        System.out.println(users);
    }
  @Test
    public void register() throws Exception {
        String url = "http://localhost:7900/user/register";
        Map<String, String> paraMap = new HashMap<String,String>();

        paraMap.put("username", "tony");
        paraMap.put("password", "123456");
        paraMap.put("phone", "123");
        paraMap.put("email", "chenzs@tedu.cn");

        String result = httpPostWithForm(url,paraMap);
        System.out.println(result);
    }

    public static String httpPostWithForm(String url, Map<String, String> paraMap) throws Exception {
        HttpPost httpPost = new HttpPost(url);
        CloseableHttpClient client = HttpClients.createDefault();
        String respContent = null;

        //遍历参数map，设置表单参数
        List<BasicNameValuePair> pairList = new ArrayList<BasicNameValuePair>();
        for (Map.Entry<String, String> entry : paraMap.entrySet()) {
            pairList.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
        }
        httpPost.setEntity(new UrlEncodedFormEntity(pairList, "utf-8"));

        HttpResponse resp = client.execute(httpPost);
        if (resp.getStatusLine().getStatusCode() == 200) {
            HttpEntity he = resp.getEntity();
            respContent = EntityUtils.toString(he, "UTF-8");
        }
        return respContent;
    }


}
