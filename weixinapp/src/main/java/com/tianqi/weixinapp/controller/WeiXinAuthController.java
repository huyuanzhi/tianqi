package com.tianqi.weixinapp.controller;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

/**
 * @author: huyuanzhi
 * @version: 1.0
 * @date: 2017/2/20
 * @project: tianqi
 * @packageName: com.tianqi.weixinapp.controller
 * @description: XXXXXX
 */
@Controller
public class WeiXinAuthController {

    @RequestMapping(value = "/auth")
    private String auth(HttpServletRequest request) throws Exception {
        Map requestMap = request.getParameterMap();
        System.out.println(requestMap);
        HttpClient client = HttpClients.createDefault();
        HttpGet get = new HttpGet();
        get.setURI(new URI("https://api.weixin.qq.com/sns/oauth2/access_token?appid=wx53a2ae758e6c5191&secret=6be4db3bc0aef639cb5d77ed224d09eb&code=huye&grant_type=authorization_code"));
        HttpResponse response =client.execute(get);
        String jsonString = EntityUtils.toString(response.getEntity());
        System.out.println(jsonString);
        return "index";
    }

}
