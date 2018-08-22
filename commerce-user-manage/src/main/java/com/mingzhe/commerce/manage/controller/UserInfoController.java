package com.mingzhe.commerce.manage.controller;

import com.mingzhe.commerce.bean.UserInfo;
import com.mingzhe.commerce.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService ;

    @RequestMapping("index")
    @ResponseBody
    public UserInfo getUserInfo(){
        UserInfo userInfo = new UserInfo() ;
        userInfo.setLoginName("lisi");
        UserInfo client = userInfoService.getUserInfo(userInfo);
        return client ;
    }


}
