package com.tianqi.service.user;



import com.tianqi.common.service.BaseService;
import com.tianqi.model.user.User;

import java.util.List;

public interface UserService extends BaseService<User> {

    Integer findAll();

    User findOneByUsername(String username);

    void changePassword(User user);
}
