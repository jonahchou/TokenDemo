package com.springSecuriy.service;

import com.springSecuriy.domain.ResponseResult;
import com.springSecuriy.domain.User;

/**
 * @author Jonah
 * @date 2023/5/4 14:35
 */
public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
