package com.fulong.ims.home.pc.app.controller;

import com.fulong.ims.home.base.dto.HomeInitialParams;
import com.fulong.ims.home.base.entity.User;
import com.fulong.ims.home.service.HomeService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author name
 */
@Controller
@RequestMapping("/api/home/pc")
public class HomePcController {
    @Resource
    private HomeService homeService;

    @Value("${dataSource.name}")
    private String dataSourceName;

    @ResponseBody
    @RequestMapping("/getHomeInitialParams")
    public HomeInitialParams getHomeInitialParams(){
        System.out.println("dataSourceName:"+dataSourceName);
        return homeService.getHomeInitialParams();
    }

    @ResponseBody
    @RequestMapping("/userLogin")
    public String userLogin(@RequestParam("userName") String userName,@RequestParam("password")String password){
        return homeService.userLogin(new User(){{
            setUserName(userName);
            setPassword(password);
        }});
    }

}
