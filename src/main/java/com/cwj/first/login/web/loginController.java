package com.cwj.first.login.web;

import com.cwj.first.login.dto.UserInfoDto;
import com.cwj.first.login.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/5/1.
 */
@Controller
@RequestMapping("/firstdemo")
public class loginController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/one.do",method = RequestMethod.GET)
    @ResponseBody
    public UserInfoDto test() {
        UserInfoDto userInfoDto = userInfoService.getUserInfo("cwj");
        return userInfoDto ;
    }

}
