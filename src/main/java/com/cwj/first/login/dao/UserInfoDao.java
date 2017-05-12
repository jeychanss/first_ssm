package com.cwj.first.login.dao;

import com.cwj.first.login.dto.UserInfoDto;

/**
 * Created by Administrator on 2017/5/4.
 */
public interface UserInfoDao {
    UserInfoDto getUserInfo(String username);
}
