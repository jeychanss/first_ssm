package com.cwj.first.login.service.impl;

import com.cwj.first.login.dao.UserInfoDao;
import com.cwj.first.login.dto.UserInfoDto;
import com.cwj.first.login.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/5/4.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserInfoDto getUserInfo(String username) {
        return userInfoDao.getUserInfo(username);
    }
}
