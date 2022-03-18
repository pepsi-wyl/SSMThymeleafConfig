package service.impl;

import mapper.UserMapper;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pojo.User;
import service.UserService;

import javax.annotation.Resource;

/**
 * @author by pepsi-wyl
 * @date 2022-03-02 21:18
 */

//注册组件
@Service("userService")
@Scope("singleton")

//编写事务
@Transactional(propagation = Propagation.REQUIRED,
        isolation = Isolation.REPEATABLE_READ,
        timeout = 10
)
public class UserServiceImpl implements UserService {

    @Resource(name = "userMapper")
    private UserMapper userMapper;

    @Override
    public User getUserByUserName(String userName) {
        return userMapper.getUserByUserName(userName);
    }

    @Override
    public User getUserByNameAndPwd(String userName, String password) {
        return userMapper.getUserByNameAndPwd(userName, password);
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

}
