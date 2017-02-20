package com.tianqi.dao.mapper;



import com.tianqi.common.dao.BaseDao;
import com.tianqi.model.user.User;


public interface UserMapper extends BaseDao<User> {

    Integer findAll();

    User findOneByUsername(String username);

    void changePassword(User user);
}