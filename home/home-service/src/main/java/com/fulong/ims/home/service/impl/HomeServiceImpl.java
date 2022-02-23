package com.fulong.ims.home.service.impl;

import com.fulong.ims.home.base.dto.HomeInitialParams;
import com.fulong.ims.home.service.HomeService;
import org.springframework.stereotype.Service;

/**
 * @author name
 */
@Service
public class HomeServiceImpl implements HomeService {
    @Override
    public HomeInitialParams getHomeInitialParams() {
        return new HomeInitialParams(){{setMessage("hello world");}};
    }
}
