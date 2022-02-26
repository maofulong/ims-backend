package com.fulong.ims.home.service;

import com.fulong.ims.home.base.dto.HomeInitialParams;
import com.fulong.ims.home.base.entity.User;

/**
 * @author name
 */
public interface HomeService {
    /**
     * s
     * @return
     */
    HomeInitialParams getHomeInitialParams();

    /**
     * 用户登录方法
     *
     * @param user 参数
     * @return
     */
    String userLogin(User user);

}
