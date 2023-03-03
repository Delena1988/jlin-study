package cn.joinhealth.springbootsqlite.service.impl;

import cn.joinhealth.springbootsqlite.mapper.UserMapper;
import cn.joinhealth.springbootsqlite.model.User;
import cn.joinhealth.springbootsqlite.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author linjian
 * @date 2023/3/3 14:40
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    /**
     * 根据id查用户
     *
     * @param id 用户id
     * @return
     */
    @Override
    public User getById(Integer id) {
        return userMapper.selectById(id);
    }
}
