package com.mingzhe.commerce.manage.service.impl;

import com.mingzhe.commerce.bean.UserAddress;
import com.mingzhe.commerce.bean.UserInfo;
import com.mingzhe.commerce.manage.mapper.UserAddressMapper;
import com.mingzhe.commerce.manage.mapper.UserInfoMapper;
import com.mingzhe.commerce.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {


    @Autowired
    private UserInfoMapper userInfoMapper ;
    @Autowired
    private UserAddressMapper userAddressMapper ;
    //查询用户信息
    @Override
    public UserInfo getUserInfo(UserInfo userInfo) {
        UserInfo client = userInfoMapper.selectOne(userInfo);
        return client;
    }
    //查询用户地址
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddress = new UserAddress() ;
        userAddress.setUserId(userId);
        List<UserAddress> addressList = userAddressMapper.select(userAddress);
        return addressList;
    }
}
