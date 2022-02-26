package com.fulong.ims.home.service.impl;

import com.fulong.ims.home.base.dto.HomeInitialParams;
import com.fulong.ims.home.base.entity.User;
import com.fulong.ims.home.enums.HomeEnums;
import com.fulong.ims.home.service.HomeService;
import org.springframework.stereotype.Service;

/**
 * @author name
 */
@Service
public class HomeServiceImpl implements HomeService {
    @Override
    public String userLogin(User user) {
        if(user.getUserName().equals(HomeEnums.userName) &&user.getPassword().equals(HomeEnums.password)){
            return "success";
        }
        return "fail";
    }

    @Override
    public HomeInitialParams getHomeInitialParams() {
        return new HomeInitialParams(){{setMessage("hello world");}};
    }
}
