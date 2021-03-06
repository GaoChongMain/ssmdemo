package cn.chong.service.impl;

import cn.chong.dao.UserMapper;
import cn.chong.model.User;
import cn.chong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public void insertSelective(User user) {
        userMapper.insertSelective(user);
    }
}
