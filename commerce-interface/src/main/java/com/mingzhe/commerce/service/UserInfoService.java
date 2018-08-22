package com.mingzhe.commerce.service;

import com.mingzhe.commerce.bean.UserAddress;
import com.mingzhe.commerce.bean.UserInfo;

import java.util.List;

public interface UserInfoService {
    //查询用户信息
    public UserInfo getUserInfo(UserInfo userInfo) ;
    //查询用户地址
    public List<UserAddress> getUserAddressList(String userId) ;
}
